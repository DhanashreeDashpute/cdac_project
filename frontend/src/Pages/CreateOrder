import React, { useState, useEffect } from 'react';

const CreateOrder = () => {
  const [customers, setCustomers] = useState([]);
  const [products, setProducts] = useState([]);
  const [selectedCustomer, setSelectedCustomer] = useState('');
  const [selectedProducts, setSelectedProducts] = useState([]);
  const [status, setStatus] = useState('');
  const [message, setMessage] = useState('');

  useEffect(() => {
    // Fetch customers from the backend
    fetch('http://localhost:8080/api/customers')
      .then(response => response.json())
      .then(data => setCustomers(data))
      .catch(error => console.error('Error fetching customers:', error));

    // Fetch products from the backend
    fetch('http://localhost:8080/api/products')
      .then(response => response.json())
      .then(data => setProducts(data))
      .catch(error => console.error('Error fetching products:', error));
  }, []);

  const handleSubmit = async (e) => {
    e.preventDefault();

    const order = {
      customer: { id: selectedCustomer }, // Send only the customer ID
      products: selectedProducts.map(productId => ({ id: productId })), // Send only product IDs
      status,
      orderDate: new Date(), // Set the current date as the order date
    };

    try {
      const response = await fetch('http://localhost:8080/api/orders', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(order),
      });

      if (response.ok) {
        setMessage('Order created successfully!');
      } else {
        setMessage('Failed to create order.');
      }
    } catch (error) {
      console.error('Error creating order:', error);
      setMessage('An error occurred. Please try again.');
    }
  };

  const handleProductChange = (e) => {
    const value = Array.from(
      e.target.selectedOptions,
      option => option.value
    );
    setSelectedProducts(value);
  };

  return (
    <div className="container mt-5">
      <h2>Create Order</h2>
      {message && <div className="alert alert-info">{message}</div>}
      <form onSubmit={handleSubmit}>
        <div className="mb-3">
          <label htmlFor="customer" className="form-label">Customer</label>
          <select
            className="form-control"
            id="customer"
            value={selectedCustomer}
            onChange={e => setSelectedCustomer(e.target.value)}
            required
          >
            <option value="">Select Customer</option>
            {customers.map(customer => (
              <option key={customer.id} value={customer.id}>
                {customer.name}
              </option>
            ))}
          </select>
        </div>
        <div className="mb-3">
          <label htmlFor="products" className="form-label">Products</label>
          <select
            multiple
            className="form-control"
            id="products"
            value={selectedProducts}
            onChange={handleProductChange}
            required
          >
            {products.map(product => (
              <option key={product.id} value={product.id}>
                {product.name}
              </option>
            ))}
          </select>
        </div>
        <div className="mb-3">
          <label htmlFor="status" className="form-label">Status</label>
          <input
            type="text"
            className="form-control"
            id="status"
            value={status}
            onChange={e => setStatus(e.target.value)}
            required
          />
        </div>
        <button type="submit" className="btn btn-primary">Create Order</button>
      </form>
    </div>
  );
};

export default CreateOrder;
