import React, { useState } from 'react';

 

const OrderDetails = () => {

  const [formData, setFormData] = useState({

    pizza: 0,

    burgers: 0,

    mojitos: 0,

  });

 

  const handleChange = (e) => {

    const { name, value } = e.target;

    setFormData({

      ...formData,

      [name]: value >= 0 ? value : 0,

    });

  };

 

  const handleSubmit = (e) => {

    e.preventDefault();

 

    // Add validations

    if (formData.pizza === 0 && formData.burgers === 0 && formData.mojitos === 0) {

      alert("Please select at least one item.");

      return;

    }

 

    // Add further processing here (e.g., sending data to server)

  };

 

  return (

    <form onSubmit={handleSubmit}>

      <div>

        <label>

          Pizza:

          <input

            type="number"

            name="pizza"

            value={formData.pizza}

            onChange={handleChange}

          />

        </label>

      </div>

      <div>

        <label>

          Burgers:

          <input

            type="number"

            name="burgers"

            value={formData.burgers}

            onChange={handleChange}

          />

        </label>

      </div>

      <div>

        <label>

          Mojitos:

          <input

            type="number"

            name="mojitos"

            value={formData.mojitos}

            onChange={handleChange}

          />

        </label>

      </div>

      <button type="submit">Submit Order</button>

    </form>

  );

};

 

export default OrderDetails;