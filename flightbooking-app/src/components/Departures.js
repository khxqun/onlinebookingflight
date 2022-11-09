import { FaPlaneArrival, FaPlaneDeparture, FaChild } from "react-icons/fa";
import { useForm } from "react-hook-form";
import './Departure.css';
import './FaPlan.css';

function Departures(){
    const {
        register,
        handleSubmit,
        watch,
        formState: { errors },
      } = useForm();
    
    return(
        
    <div>
        <div>
          <div className="out">
            <p className="text">flying from</p>
            <select className="combobox">
              <option value="" selected disabled hidden>--Select Airport--</option>
              <option value="ENIA">England Newcastle International Airport</option>
              <option value="INIA">Italy Naples International Airport</option>
              <option value="MMA"> Malaysia Mulu Airport</option>
              <option value="KMA"> Kenya Malindi Airport</option>
            </select>
            <FaPlaneDeparture className="icon" />
          </div>
        </div>
    </div>
    );
}

export default Departures;