import React from "react";
import './App.css';
import styled from "styled-components"
import Product from './component/product';

const GoodsRecommend = styled.div`
    margin-top: 87px;
    margin-bottom: 55px;
`

const Title = styled.div`
    display: flex;
    flex-direction: column;
    align-items: center;
    margin-bottom: 16px;
`

const GoodsList = styled.div`
    display: inline-flex;
    flex-direction: row;
    align-items: center;
    margin-right: 18px;
`

function App() {
  return (
      <div className="App">
          <GoodsRecommend>
              <Title><div className = "recommend">이 상품 어때요?</div></Title>
              <GoodsList><Product /></GoodsList>
              <GoodsList><Product /></GoodsList>
              <GoodsList><Product /></GoodsList>
              <GoodsList><Product /></GoodsList>
          </GoodsRecommend>
      </div>
  );
}

export default App;
