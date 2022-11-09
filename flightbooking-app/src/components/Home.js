import React, { Component } from "react";
import { Button } from 'react-bootstrap';
import history from './../history';
import "./Home.css";

export default class Home extends Component {
    render() {
      return (
        <div className="Home">
          <div className="lander">
            <h1>Online Flight Ticket Booking</h1>
            <p>Click on the button to book a ticekt.</p>
            <form>
              <Button variant="btn btn-success" onClick={() => history.push('/api/v3/flight')}>Start</Button>
            </form>
          </div>
        </div>
      );
    }
  }