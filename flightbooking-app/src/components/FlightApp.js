import React, { Component, useState } from "react";
import { FaPlaneArrival, FaPlaneDeparture, FaChild } from "react-icons/fa";
import { useForm } from "react-hook-form";
import './FlightApp.css';
import './FindButton.css';
import './Ways.css';
import Arrival from "./Arrival";
import Ways from "./Ways";
import FindButton from "./FindButton";
import FlightService from "../service/FlightService";

class FlightApp extends Component {
  constructor(props){
    super(props);
    this.state ={
      origins: []
    };
  componentDidMount(){
    FlightService.getAllOrigins().then((res)=>{
      this.setState({origins: res.data})
    });
  }

  render(){
    return (
      <React.Fragment>
        <section>
          <form>
            <div className="bg-white w-auto h-auto pb-10 mt-5 mx-5 px-5 rounded-lg sm:w-full md:w-4/5 md:mx-auto lg:w-2/5 lg:mx-auto">
              {/* header section */}
              <div className="h-24 flex justify-center items-center shadow ">
                <p className="appHeader">
                  flight booking app
                </p>
              </div>

              {/* body section */}
              <div>
                <div className="grid justify-center space-y-5 bg-indigo-50 pb-10">
                    <Arrival />              
                  {/* Ways section */}
                    <Ways/>
                  

                  {/* date section */}
                  <div className="flex space-x-2">
                    {/* departure section */}
                    <div>
                      <div>
                        <div className="relative">
                          <p className="font-bold text-xl uppercase">departure date</p>
                          <input type="date"className=""/>
                        </div>
                      </div>
                    </div>

                    {/* return section */}
                    <div>
                      <div>
                        <div  className="relative">
                          <p className="font-bold text-xl uppercase">Return date</p>
                          <input  type="date"className=""/>
                        </div>
                      </div>
                    </div>
                  </div>

                  {/* btn section */}
                  <FindButton/>
                  <div>
                        <p>{this.state.origins}</p>
                  </div>
                </div>
              </div>
            </div>
          </form>
        </section>
      </React.Fragment>
    )
  
};

export default FlightApp;
