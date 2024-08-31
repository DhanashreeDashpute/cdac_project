import React from 'react';
import { NavLink } from 'react-router-dom';
import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';

export const TopNavbar = () => {
  return (
    <Navbar bg="dark" expand="lg" variant="dark">
      <Container>
        <NavLink to="/" className="navbar-brand">Shop Now</NavLink>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="ms-auto">
            <NavLink to="/" className="nav-link">Home</NavLink>
            <NavLink to="/contact" className="nav-link">Contact</NavLink>
            {/* <NavLink to="/register" className="nav-link">Register</NavLink>  */}
            <NavLink to="/customers" className="nav-link">Customer List</NavLink>
            <NavLink to="/create-order" className="nav-link">Create Order</NavLink> 
            {/* <NavLink to="/orders" className="nav-link">Order List</NavLink> */}
            <NavLink to="/categories" className="nav-link">Category List</NavLink>
            <NavLink to="/categories/create" className="nav-link">Create Category</NavLink>
            <NavLink to="/products" className="nav-link">Product List</NavLink>
            {/* <NavLink to="/create-product" className="nav-link">Create Product</NavLink> */}
          </Nav>
        </Navbar.Collapse>
      </Container>
    </Navbar>
  );
};

export default TopNavbar;
