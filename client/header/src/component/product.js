import React from 'react';
import styled from "styled-components";
import image from '../image 24.svg'

const Image = styled.div`
  width: 212px;
  height: 272px;
  margin-bottom: 16px;
`

const GoodsDetail = styled.div`
    text-align: left;
`

const Name = styled.div`
    font-size: 13px;
    margin-bottom: 5px;
`
const SalePrice = styled.div`
    font-size: 14px;
    margin-bottom: 5px;
`

const DC = styled.div`
    display: inline-flex;
    flex-direction: row;
    color: #FA622F;
    margin-right: 5px;
`

const Price = styled.div`
    display: inline-flex;
    flex-direction: row;
    font-weight: bold;
`

const Cost = styled.div`
    font-weight: bold;
    font-size: 13px;
    text-decoration-line: line-through;
    color: #999999;
`

function Product() {
    return (
        <div>
            <Image><img src={image} /></Image>
            <GoodsDetail>
                <Name>[콜린스그린] 더 자몽</Name>
                <SalePrice>
                    <DC>13%</DC>
                    <Price>14,442원</Price>
                </SalePrice>
                <Cost>16,600원</Cost>
            </GoodsDetail>
        </div>

);
}

export default Product;