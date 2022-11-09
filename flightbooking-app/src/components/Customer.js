import React, { Component, useState } from 'react';
import { Button } from 'react-bootstrap';

import history from './../history';

class Customer extends Component {
    constructor(props){
        super(props);
        this.state = {
            firstName: '',
            lastName: '',
            nationality: '',
            id: '',
            age: '',
            price: ''

        }
        this.chageFirstNameHandler = this.chageFirstNameHandler.bind(this);
        this.chageLastNameHandler = this.chageLastNameHandler.bind(this);
        this.chageNationalityHandler = this.chageNationalityHandler.bind(this);
        this.chageIdHandler = this.chageIdHandler.bind(this);
        this.chageAgeHandler = this.chageAgeHandler.bind(this);
        this.chagePriceHandler = this.chagePriceHandler.bind(this);
    }

    chageFirstNameHandler = (event) =>{
        this.setState({firstName: event.target.value})
    }
    chageLastNameHandler = (event) =>{
        this.setState({lastName: event.target.value})
    }
    chageNationalityHandler = (event) =>{
        this.setState({nationality: event.target.value})
    }
    chageIdHandler = (event) =>{
        this.setState({id: event.target.value})
    }
    chageAgeHandler = (event) =>{
        this.setState({age: event.target.value})
    }
    chagePriceHandler = (event) =>{
        this.setState({price: event.target.value})
    }

    render(){
        return (
            <div>
                <h2 className='text-center'>Customer Detials</h2><br/>
                <form>
                    <label>First Name</label><br/>
                    <input type="text" required value={this.state.firstName} onChange={this.chageFirstNameHandler}/><br/>
                    <label>Last Name</label><br/>
                    <input type="text" value={this.state.lastName} onChange={this.chageLastNameHandler}/><br/>
                    <label>Nationality</label><br/>
                    <input type="text" required value={this.state.nationality} onChange={this.chageNationalityHandler}/><br/>
                    <label>Identification: NIF or Passport</label><br/>
                    <input type="text" required value={this.state.value} onChange={this.chageIdHandler}/><br/>
                    <label>Select age</label><br/>
                    <select value={this.state.age} onChange={this.chageAgeHandler}>
                        <option value="< 2 years">{'<'}2 years</option>
                        <option value="Between 2 and 9 years">Between 2 and 9 years</option>
                        <option value="> 9 years">{'>'} 9 years</option>
                    </select>
                </form>
                <p>{this.state.firstName}</p>
                <p>{this.state.lastName}</p>
                <p>{this.state.nationality}</p>
                <p>{this.state.id}</p>
                <p>{this.state.age}</p>
                <h1>Price:</h1>
                <label>{this.state.price}</label>
                <Button onClick={() => history.push("/api/v3/booked")}>SUBMIT</Button>
            </div>
        );
    }
}

export default Customer;