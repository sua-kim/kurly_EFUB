package com.efub.kurlyclone.service;

import com.efub.kurlyclone.domain.product.Product;
import com.efub.kurlyclone.domain.product.ProductRepository;
import com.efub.kurlyclone.web.dto.ProductResponseDto;
import com.efub.kurlyclone.web.dto.ProductSaveRequestDto;
import com.efub.kurlyclone.web.dto.ProductUpdateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final FileHandler fileHandler;

    public ProductResponseDto findById(Long id){
        Product entity = productRepository.getById(id);
        return new ProductResponseDto(entity);
    }

    @Transactional
    public Long saveProduct(ProductSaveRequestDto productSaveRequestDto, MultipartFile file){
        String file_path;
        Long id;

        try{
            file_path = fileHandler.parseFileInfo(file);
            productSaveRequestDto.setImage(file_path);
        }catch (Exception e){
            System.out.println("File exception");
        }finally {
            id = productRepository.save(productSaveRequestDto.toEntity()).getProduct_id();
        }

        return id;
    }

    @Transactional
    public Long updateProduct(Long id, ProductUpdateDto productUpdateDto){
        Product product = productRepository.getById(id);
        product.update(productUpdateDto.getSale(),
                productUpdateDto.getEvent(),
                productUpdateDto.getRecommend());
        return id;
    }

    @Transactional
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }

}
