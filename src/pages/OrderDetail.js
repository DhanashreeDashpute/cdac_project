import React, { useState, useEffect } from 'react';
import { useParams } from 'react-router-dom';

const OrderDetails = () => {
  const { id } = useParams(); // Get the order ID from the URL
  const [order, setOrder] = useState(null);
  const [loading, setLoading] = useState(true); // Add a loading state
  const [error, setError] = useState(null); // Add an error state

  useEffect(() => {
    // Fetch the order details from the backend using the ID
    fetch(`http://localhost:8080/api/orders/${id}`)
      .then(response => {
        if (!response.ok) {
          throw new Error('Network response was not ok');
        }
        return response.json();
      })
      .then(data => {
        setOrder(data);
        setLoading(false); // Data loaded successfully
      })
      .catch(error => {
        setError(error);
        setLoading(false); // Loading failed
      });
  }, [id]);

  if (loading) {
    return <div>Loading...</div>; // Display a loading message while fetching data
  }

  if (error) {
    return <div>Error: {error.message}</div>; // Display an error message if fetching fails
  }

  if (!order) {
    return <div>No order details available.</div>; // Display if no order data is found
  }

  return (
    <div className="container mt-5">
      <h2>Order Details</h2>
      <div className="card">
        <div className="card-header">
          Order ID: {order.id}
        </div>
        <div className="card-body">
          <h5 className="card-title">Customer: {order.customer ? order.customer.name : 'N/A'}</h5>
          <p className="card-text"><strong>Order Date:</strong> {new Date(order.orderDate).toLocaleDateString()}</p>
          <p className="card-text"><strong>Status:</strong> {order.status}</p>
          <h5 className="card-title">Products:</h5>
          <ul className="list-group">
            {order.products && order.products.length > 0 ? (
              order.products.map(product => (
                <li key={product.id} className="list-group-item">
                  {product.name} - ${product.price}
                </li>
              ))
            ) : (
              <li className="list-group-item">No products in this order.</li>
            )}
          </ul>
        </div>
      </div>
    </div>
  );
};

export default OrderDetails;
