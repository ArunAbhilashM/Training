import React, { useState } from 'react';

import './Catalogue.css';

 

const Catalogue = () => {

  const [selectedFood, setSelectedFood] = useState(null);

 

  const foodItems = [

    { id: 1, name: 'Pizza', price: 10 },

    { id: 2, name: 'Burger', price: 5 },

    { id: 3, name: 'Desserts', price: 20 },

    { id: 4, name: 'Mojitos', price: 12 },

 

  ];

 

  const handleFoodClick = (id) => {

    setSelectedFood(id);

  };

 

  return (

    <div className="food-catalogue">

      <h1>Food Catalogue</h1>

      <div className="food-list">

        {foodItems.map((food) => (

          <div

            key={food.id}

            className={`food-item ${selectedFood === food.id ? 'selected' : ''}`}

            onClick={() => handleFoodClick(food.id)}

          >

            <h2>{food.name}</h2>

            <p>${food.price}</p>

          </div>

        ))}

      </div>

    </div>

  );

};

 

export default Catalogue;