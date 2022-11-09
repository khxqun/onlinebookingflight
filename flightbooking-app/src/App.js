import './App.css';
import React from 'react';
import ListFlights from './components/ListFlights';
import Customer from './components/Customer';
import FlightApp from './components/FlightApp';
import Routes from './Routes';
import Home from './components/Home';

function App() {
  return (
    <div className='container'>
      <Routes/>
    </div>
  );
}

export default App;
