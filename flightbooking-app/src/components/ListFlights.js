import React, { Component , Button} from 'react';

import history from './../history';

class ListFlights extends Component {
    constructor(props){
        super(props)

        this.state ={
            flights: []
        }
    }
    render() {
        return (
            <div>
                <h2 className='text-center'>List of Flights</h2>
                <div className='expenses-filter__control'>
                    <label>Filter by:</label>
                    <select placeholder='AirLine'>

                    </select>
                    <select placeholder='Scale'>

                    </select>
                    <select placeholder='Luggage'>

                    </select>
                    <select placeholder='Schedule'>

                    </select>
                </div>
                <button onClick={() => history.push("/api/v3/customer")}>SUBMIT</button>
                <div className='row'>
                    <table className='table table-striped table-bordered text-center'>
                        <thead>
                            <tr>
                                <th>Flight Nr</th>
                                <th>AirLine</th>
                                <th>Origin</th>
                                <th>Destination</th>
                                <th>Departure Time</th>
                                <th>Transit Time</th>
                                <th>Lugagge</th>                          
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.flights.map(
                                    flight =>
                                    <tr>
                                        <td>{flight.flightNr}</td>
                                        <td>{flight.airline}</td>
                                        <td>{flight.origin}</td>
                                        <td>{flight.destination}</td>
                                        <td>{flight.departureTime}</td>
                                        <td>{flight.transitTime}</td>
                                        <td>{flight.lugagge}</td>
                                    </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
                
            </div>
        );
    }
}

export default ListFlights;