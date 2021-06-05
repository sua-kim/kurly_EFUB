import React, {Component} from "react";
import {useState} from 'react';
import styled from "styled-components";

const TagList = styled.div`
  margin-top: 16px;
`

const Tag = styled.button`
  display: inline-flex;
  flex-direction: row;
  font-size: 12px;
  height: 32px;
  background: #F7F7F7;
  border-radius: 20px;
  border: none;
  outline: none;
  padding-top: 9px; padding-bottom: 9px;
  padding-left: 13px; padding-right: 13px;
  margin-right: 11px;
  
  &:hover {
    color: #810080;
    background: #F7F3F8;
  }  
  &:active {
    color: #FFFFFF;
    background: #5F0080;
  }
`

function TagCategory() {

    return (
        <div style={{"margin-top": "25px", "margin-bottom": "30px"}}>
            <TagList>
                <Tag>채소</Tag>
                <Tag>과일 · 견과 · 쌀</Tag>
                <Tag>수산 · 해산 · 건어</Tag>
                <Tag>정육 · 계란</Tag>
                <Tag>국 · 반찬 · 메인요리</Tag>
                <Tag>샐러드 · 간편식</Tag>
                <Tag>면 · 양념 · 오일</Tag>
            </TagList>
            <TagList>
                <Tag>생수·음료·우유·커피</Tag>
                <Tag>간식 · 과자 · 떡</Tag>
                <Tag>베이커리 · 치즈 · 델리</Tag>
                <Tag>건강식품</Tag>
                <Tag>생활용품 · 리빙</Tag>
                <Tag>스킨케어 · 메이크업</Tag>
                <Tag>헤어· 바디·구강</Tag>
            </TagList>
            <TagList>
                <Tag>주방용품</Tag>
                <Tag>가전제품</Tag>
                <Tag>베이비·키즈</Tag>
                <Tag>반려동물</Tag>
            </TagList>
        </div>
    );
}

export default TagCategory;