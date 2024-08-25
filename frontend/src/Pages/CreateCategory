import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';

const CreateCategory = () => {
  const [name, setName] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    const newCategory = { name };

    fetch('http://localhost:8080/api/product-categories', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(newCategory),
    })
      .then(() => navigate('/categories'))
      .catch((error) => console.error('Error creating category:', error));
  };

  return (
    <div className="container">
      <h2>Create New Category</h2>
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label className="form-label">Category Name</label>
          <input
            type="text"
            className="form-control"
            value={name}
            onChange={(e) => setName(e.target.value)}
            required
          />
        </div>
        <button type="submit" className="btn btn-primary">Create</button>
      </form>
    </div>
  );
};

export default CreateCategory;
