import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import TeamDetailsWithState from './Components/TeamDetailsWithState';
import TeamDetailsWithUseState from './Components/TeamDetailsWithUseState';
import VenueList from './Components/VenueList';
import TeamsList from './Components/TeamsList'
import reportWebVitals from './reportWebVitals';
import { BrowserRouter,Routes,Link,Route,Router} from 'react-router-dom';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App/>
    <TeamDetailsWithState/>
    <TeamDetailsWithUseState/>
    <TeamsList/>
    <VenueList/>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
