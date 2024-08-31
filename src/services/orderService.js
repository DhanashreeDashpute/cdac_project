// src/services/orderService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/orders';

export const getAllOrders = () => {
    return axios.get(API_URL);
};

export const createOrder = (order) => {
    return axios.post(API_URL, order);
};

export const getOrderById = (id) => {
    return axios.get(`${API_URL}/${id}`);
};
