import React, { useState } from 'react';

 

function Food() {
  const [formData, setFormData] = useState({
    firstName: '',
    lastName: '',
    address: '',
    phoneNumber: '',
    email: '',
  });

 

  const [errors, setErrors] = useState({});

 

  const handleChange = (e) => {
    const { id, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [id]: value,
    }));
  };

 

  const handleSubmit = (e) => {
    e.preventDefault();
    const validationErrors = {};

 

    // Validate first name
    if (!formData.firstName.trim()) {
      alert( 'First name is required');
    }

 

    // Validate last name
    if (!formData.lastName.trim()) {
      validationErrors.lastName = 'Last name is required';
    }

 

    // Validate email
    const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!formData.email.match(emailPattern)) {
      validationErrors.email = 'Invalid email address';
    }

 

    // Validate phone number (assumes it should be exactly 10 digits)
    if (!formData.phoneNumber.match(/^\d{10}$/)) {
      validationErrors.phoneNumber = 'Phone number must be 10 digits';
    }

 

    // Set errors
    setErrors(validationErrors);

 

    // If no validation errors, you can proceed with submitting the data
    if (Object.keys(validationErrors).length === 0) {
      // Add your logic to handle the submission here
      alert('Form submitted successfully');
    }
  };

 

  return (
<div>
<center>
<form onSubmit={handleSubmit}>
<div>
            First Name:{' '}
<input
              type="text"
              placeholder="Enter your first name"
              id="firstName"
              required
              value={formData.firstName}
              onChange={handleChange}
            />
            {errors.firstName && <div className="error">{errors.firstName}</div>}
</div>
<div>
            Last Name:{' '}
<input
              type="text"
              placeholder="Enter your last name"
              id="lastName"
              required
              value={formData.lastName}
              onChange={handleChange}
            />
            {errors.lastName && <div className="error">{errors.lastName}</div>}
</div>
<div>
            Address: <br />
<textarea
              rows="4"
              cols="30"
              placeholder="Enter Address"
              id="address"
              value={formData.address}
              onChange={handleChange}
></textarea>
</div>
<div>
            Phone No:{' '}
<input
              type="text"
              maxLength="10"
              placeholder="Enter your Mobile Number"
              id="phoneNumber"
              required
              value={formData.phoneNumber}
              onChange={handleChange}
            />
            {errors.phoneNumber && <div className="error">{errors.phoneNumber}</div>}
</div>
<div>
            E-mail:{' '}
<input
              type="text"
              placeholder="Enter your E-mail"
              id="email"
              required
              value={formData.email}
              onChange={handleChange}
            />
            {errors.email && <div className="error">{errors.email}</div>}
</div>
<div>
<input type="submit" value="ADD" />
<input type="reset" value="RESET" />
</div>
</form>
</center>
</div>
  );
}

 

export default Food;