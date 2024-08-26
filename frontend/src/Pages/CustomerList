// src/components/CustomerList.js
import React, { useState, useEffect } from 'react';
import { getAllCustomers } from '../services/customerService';
import { Container, Card,  Alert } from 'react-bootstrap';

const CustomerList = () => {
    const [customers, setCustomers] = useState([]);
    const [error, setError] = useState('');

    useEffect(() => {
        const fetchCustomers = async () => {
            try {
                const response = await getAllCustomers();
                setCustomers(response.data);
            } catch (error) {
                console.error('Error fetching customers:', error);
                setError('Failed to load customers. Please try again later.');
            }
        };

        fetchCustomers();
    }, []);

    return (
        <Container className="mt-5">
            <h2 className="text-center mb-4">Customer List</h2>
            {error && <Alert variant="danger">{error}</Alert>}
            <div className="row">
                {customers.map(customer => (
                    <div key={customer.id} className="col-md-4 mb-4">
                        <Card>
                            <Card.Body>
                                <Card.Title>{customer.name}</Card.Title>
                                <Card.Subtitle className="mb-2 text-muted">{customer.email}</Card.Subtitle>
                                <Card.Text>
                                    Address: {customer.address}
                                </Card.Text>
                            </Card.Body>
                        </Card>
                    </div>
                ))}
            </div>
        </Container>
    );
};

export default CustomerList;
