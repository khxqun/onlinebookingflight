package andras.varga.pricedetails.configuration;

import andras.varga.requestdetails.repository.FlightRepository;
import andras.varga.pricedetails.entity.FlightDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DataBaseInitializer {

    @Autowired
    private FlightRepository flightRepository;

    @PostConstruct
    public void init(){
        FlightDetails flightDetails= new FlightDetails();
        flightDetails.setPriceAge(10);
        flightDetails.setPriceLuggage(20);
    }

}
