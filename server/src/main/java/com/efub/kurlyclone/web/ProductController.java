package com.efub.kurlyclone.web;

import com.efub.kurlyclone.domain.product.Product;
import com.efub.kurlyclone.service.ProductService;
import com.efub.kurlyclone.web.dto.ProductResponseDto;
import com.efub.kurlyclone.web.dto.ProductSaveRequestDto;
import com.efub.kurlyclone.web.dto.ProductUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@RequiredArgsConstructor
@CrossOrigin
@RestController
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("")
    public List<Product> getProductAll(){
        return productService.findAll();
    }

    @GetMapping("/{product_id}")
    public ProductResponseDto getProduct(@PathVariable Long product_id){
        return productService.findById(product_id);
    }

    @PostMapping("/create")
    public Long createProduct(
            @RequestParam("file") MultipartFile file,
            ProductSaveRequestDto productSaveRequestDto
            ){
        return productService.saveProduct(productSaveRequestDto, file);
    }

    @PostMapping("/update/{product_id}")
    public Long updateProduct(
            @PathVariable Long product_id,
            @RequestBody ProductUpdateDto productUpdateDto
            ){
        return productService.updateProduct(product_id, productUpdateDto);
    }

    @GetMapping("/delete/{product_id}")
    public String deleteProduct(@PathVariable Long product_id){
        productService.deleteProduct(product_id);
        return "OK";
    }

    @GetMapping("/recommand")
    public List<Product> getRecommand() {
        return productService.getRecommand();
    }

    @GetMapping("/sale")
    public List<Product> getSale() {
        return productService.getSale();
    }

    @GetMapping("/md_choice")
    public List<Product> getMdChoice() {
        return productService.getMdChoice();
    }
}
