import React, { useEffect, useState } from 'react';
import { useParams, Link } from 'react-router-dom';

const CategoryDetails = () => {
  const { id } = useParams();
  const [category, setCategory] = useState(null);

  useEffect(() => {
    fetch(`http://localhost:8080/api/product-categories/${id}`)
      .then((response) => response.json())
      .then((data) => setCategory(data))
      .catch((error) => console.error('Error fetching category:', error));
  }, [id]);

  if (!category) {
    return <div>Loading...</div>;
  }

  return (
    <div className="container">
      <h2>Category Details</h2>
      <p>Name: {category.name}</p>
      <Link to={`/categories/edit/${category.id}`} className="btn btn-warning">
        Edit Category
      </Link>
      <Link to="/categories" className="btn btn-secondary ml-2">
        Back to Categories
      </Link>
    </div>
  );
};

export default CategoryDetails;
