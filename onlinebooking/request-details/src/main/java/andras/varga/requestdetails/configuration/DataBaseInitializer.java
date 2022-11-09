package andras.varga.requestdetails.configuration;

import andras.varga.requestdetails.entities.AirLine;
import andras.varga.requestdetails.entities.Flight;
import andras.varga.requestdetails.repository.AirlineRepository;
import andras.varga.requestdetails.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Configuration
public class DataBaseInitializer {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private AirlineRepository airlineRepository;

    @PostConstruct
    public void init(){
        AirLine airline1 = new AirLine();
        airline1.setAirlineName("Malev");

        AirLine airline2 = new AirLine();
        airline2.setAirlineName("WizzAir");

        Flight flight1 = new Flight();
        /*Flight flight2 = new Flight();
        Flight flight3 = new Flight();
        Flight flight4 = new Flight();*/

        flight1.setFlightNumber(202201);
        flight1.setLuggage(false);
        flight1.setAirline(airline1);
        flight1.setDestination("Seville");
        flight1.setOrigin("Budapest");
        flight1.setLayoverNumbers(2);
        flight1.setTransitTime(LocalDateTime.now());
        flight1.setDepartureTime(LocalDate.now());

        flightRepository.save(flight1);
    }
}
