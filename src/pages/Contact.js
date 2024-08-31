import React, { Fragment } from "react";
import { Footer } from "../Component/Footer/Footer";


const Contact = () => {
  return (
    <Fragment>
    
      
      <div className="container mt-5 text-center">
        <h2>Contact Us</h2>
        <p>If you have any questions, feel free to reach out to us.</p>
        
        <div className="contact-info mt-4">
          <h4>Email</h4>
          <p>support@shopnow.com</p>
          
          <h4>Phone</h4>
          <p>+123 456 7890</p>
          
          <h4>Address</h4>
          <p>123 Shopping Street,<br />E-Commerce City, EC 12345</p>
        </div>
      </div>
      
      <Footer />
    </Fragment>
  );
}

export default Contact;
