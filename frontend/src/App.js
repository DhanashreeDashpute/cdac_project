import React, { useState, useEffect } from 'react';
import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import {Home} from './pages/Home';
import Register from './pages/Register';
import Login from './pages/Login';
import SignUp from './pages/SignUp';
import Customers from './pages/CustomerList';
import CreateOrder from './pages/CreateOrder';
import Orders from './pages/OrderList';
import Categories from './pages/CategoryList';
import CreateCategory from './pages/CreateCategory';
import Products from './pages/Products';
import { TopNavbar } from './Component/Header/TopNavbar';
import Contact from './pages/Contact';

const App = () => {
  const [isAuthenticated, setIsAuthenticated] = useState(false);

  useEffect(() => {
    const token = localStorage.getItem('authToken');
    if (token) {
      setIsAuthenticated(true);
    }
  }, []);

  const handleLogin = () => {
    setIsAuthenticated(true);
  };

  const handleLogout = () => {
    localStorage.removeItem('authToken');
    setIsAuthenticated(false);
    window.location.href = '/login'; // Redirect to login after logout
  };

  return (
    <Router>
      {isAuthenticated ? (
        <>
          <TopNavbar onLogout={handleLogout} />
          <Routes>
            <Route path="/" element={<Home />} />
            <Route path="/customers" element={<Customers />} />
            <Route path="/create-order" element={<CreateOrder />} />
            <Route path="/orders" element={<Orders />} />
            <Route path="/categories" element={<Categories />} />
            <Route path="/categories/create" element={<CreateCategory />} />
            <Route path="/products" element={<Products />} />
            {/* Redirect /register and /login to homepage if already authenticated */}
             <Route path="/contact" element={<Contact />} /> 
            <Route path="/login" element={<Navigate to="/" />} />
          </Routes>
        </>
      ) : (
        <Routes>
          <Route path="/signup" element={<SignUp />} />
          <Route path="/register" element={<Register />} />
          <Route path="/login" element={<Login onLogin={handleLogin} />} />
          {/* Redirect any other routes to the login page */}
          <Route path="*" element={<Navigate to="/login" />} />
        </Routes>
      )}
    </Router>
  );
};

export default App;
