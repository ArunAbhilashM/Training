import React, { useState } from 'react';
import './Customer.css';

function Customer() {
  const initialFormData = {
    firstName: '',
    lastName: '',
    email: '',
    phone: '',
  };

  const [formData, setFormData] = useState(initialFormData);
  const [formErrors, setFormErrors] = useState({});

  const validateForm = () => {
    let errors = {};
    let isValid = true;

    if (!formData.firstName.trim()) {
      window.alert('First name is required');
      isValid = false;
    }

    if (!formData.lastName.trim()) {
        window.alert( 'Last name is required');
      isValid = false;
    }

    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!emailPattern.test(formData.email)) {
        window.alert('Invalid email address');
      isValid = false;
    }

    const phonePattern = /^\d{10}$/;
    if (!phonePattern.test(formData.phone)) {
        window.alert('Phone number must be 10 digits');
      isValid = false;
    }

    setFormErrors(errors);
    return isValid;
  };

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value,
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    if (validateForm()) {
      
      window.alert('Form submitted:', formData);
      
      setFormData(initialFormData);
      setFormErrors({});
    }
  };

  const handleReset = () => {
    setFormData(initialFormData);
    setFormErrors({});
  };

  return (
    <div>
      <center>
        <form onSubmit={handleSubmit}>
          First Name:
          <input
            type="text"
            placeholder="Enter your first name"
            name="firstName"
            value={formData.firstName}
            onChange={handleInputChange}
            required
          />
          <span className="error">{formErrors.firstName}</span>
          <br /><br />

          Last Name:
          <input
            type="text"
            placeholder="Enter your last name"
            name="lastName"
            value={formData.lastName}
            onChange={handleInputChange}
            required
          />
          <span className="error">{formErrors.lastName}</span>
          <br /><br />

          Email:
          <input
            type="text"
            placeholder="Enter your email"
            name="email"
            value={formData.email}
            onChange={handleInputChange}
            required
          />
          <span className="error">{formErrors.email}</span>
          <br /><br />

          Phone:
          <input
            type="text"
            placeholder="Enter your phone number"
            name="phone"
            value={formData.phone}
            onChange={handleInputChange}
            required
          />
          <span className="error">{formErrors.phone}</span>
          <br /><br />

          <input type="submit" value="Submit" />
          <input type="button" value="Reset" onClick={handleReset} />
        </form>
      </center>
    </div>
  );
}


export default Customer;