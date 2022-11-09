import React, { Component } from 'react';

class Booked extends Component {
    constructor(props){
        super(props);
        this.state ={
          data: []
        };
        
    }
    render() {
        return (
            <div>
                <h2>Booked it successfully!</h2>
                <label>Personal Details:</label>
                {this.state.data.values.map(result =>(
                    <p value={result}>{result}</p>
                ))}
            </div>
        );
    }
}

export default Booked;