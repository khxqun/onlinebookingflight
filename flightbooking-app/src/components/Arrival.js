import React, { useState } from 'react';

import { FaPlaneArrival, FaPlaneDeparture, FaChild } from "react-icons/fa";

function Arrival (props){
    const origins = ["Budapest", "Seville", "Madrid", "Lisbon"];
    const destinations = ["Budapest", "Seville", "Madrid", "Lisbon"];
    const [origin,setOrigin]=useState('');
    const [departure,setDeparture]=useState('');


    return(
            <div>
              <div className="grid justify-center space-y-5 bg-indigo-50 pb-10">
                {/*Departure section*/ }
                <div>
                    <div>
                      <div className="out">
                        <p className="text">flying from</p>
                        <select className="combobox" onChange={(e) => setOrigin(e.target.value)}>
                          {origins.map(result =>(
                            <option value={result}>{result}</option>
                          ))}
                        </select>
                        <FaPlaneDeparture className="icon" />
                      </div>
                    </div>
                </div>
                </div>

                {/* arrival section */}
                <div>
                    <div>
                      <div className="out">
                        <p className="text">flying from</p>
                        <select className="combobox" onChange={(e) => setDeparture(e.target.value)}>
                          {destinations.map(result =>(
                              <option value={result}>{result}</option>
                            ))}
                        </select>
                        <FaPlaneDeparture className="icon" />
                      </div>
                    </div>
                </div>
            </div>

    )
}
export default Arrival;