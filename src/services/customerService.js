// src/services/customerService.js
import axios from 'axios';

const API_URL = 'http://localhost:8080/api/customers';

export const getAllCustomers = () => {
    return axios.get(API_URL);
};

export const registerCustomer = (customer) => {
    return axios.post(API_URL, customer);
};
