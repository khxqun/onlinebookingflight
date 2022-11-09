import axios from "axios";

const FLIGHT_API_BASE_URL = "http://localhost:8081/api/v3/flight";

class FlightService{

    getAllOrigins(){
        return axios.get(FLIGHT_API_BASE_URL);
    }
}
export default new FlightService();