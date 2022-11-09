import { Component } from "react";
import { Router,Switch, Route } from "react-router-dom";

import FlightApp from "./components/FlightApp";
import ListFlights from "./components/ListFlights";
import Customer from "./components/Customer";
import Home from "./components/Home";
import Booked from "./components/Booked";

import history from "./history";

class Approutes extends Component {
    render(){
        return(
            <Router history={history}>
                <Switch>
                    <Route path="/" exact component={Home} />
                    <Route path="/api/v3/flight" exact component={FlightApp} />
                    <Route path="/api/v3/listflight" component={ListFlights} />
                    <Route path="/api/v3/customer" component={Customer} />
                    <Route path="/api/v3/booked" component={Booked}/>
                </Switch>
            </Router>
        )
    }
}
export default Approutes;