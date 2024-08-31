import React, { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import { Container, Row, Col, Card, Button } from 'react-bootstrap';

const CategoryList = () => {
  const [categories, setCategories] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8080/api/product-categories')
      .then((response) => response.json())
      .then((data) => setCategories(data))
      .catch((error) => console.error('Error fetching categories:', error));
  }, []);

  return (
    <Container className="mt-5">
      <h2 className="mb-4">Product Categories</h2>
      <Row>
        {categories.map((category) => (
          <Col key={category.id} md={4} className="mb-4">
            <Card>
              <Card.Body>
                <Card.Title>{category.name}</Card.Title>
                <Link to={`/categories/${category.id}`} className="btn btn-primary">
                  View Details
                </Link>
              </Card.Body>
            </Card>
          </Col>
        ))}
      </Row>
      <Link to="/categories/create">
        <Button variant="success" className="mt-4">
          Create New Category
        </Button>
      </Link>
    </Container>
  );
};

export default CategoryList;
