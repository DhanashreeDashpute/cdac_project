import React from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import CategoryCard from './CategoryCard';

export const AllCategories = () => {
  return (
    <Container>
      <h3 className="text-center mb-4">
        Browse category
      </h3>
      <Row>
        <Col xs={12} sm={6} md={3} className="mb-2 p-0">
          <CategoryCard category={"smartphones"} />
          
        </Col>
        <Col xs={12} sm={6} md={3} className="mb-2 p-0">
          <CategoryCard category={"Laptops"} />
          
        </Col><Col xs={12} sm={6} md={3} className="mb-2 p-0">
          <CategoryCard category={"Headphones"} />
          
        </Col>
        <Col xs={12} sm={6} md={3} className="mb-2 p-0">
          <CategoryCard category={"Ipad"} />
          
        </Col>
      </Row>
    </Container>
  );
}
