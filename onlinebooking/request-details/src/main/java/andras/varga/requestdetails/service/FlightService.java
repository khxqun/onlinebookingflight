package andras.varga.requestdetails.service;

import andras.varga.requestdetails.entities.Flight;
import andras.varga.requestdetails.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {


    @Autowired
    private FlightRepository flightRepository;



    public List<String> getAllOrigins() {
        return flightRepository.findAll()
                .stream()
                .map(Flight::getOrigin)
                .distinct()
                .collect(Collectors.toList());
    }

    public List<String> getAllDestinationByOrigin(String origin) {
        return flightRepository.findAll()
                .stream()
                .filter(flight -> flight.getOrigin().equals(origin))
                .map(Flight::getDestination)
                .distinct()
                .collect(Collectors.toList());
    }

    /*public List<Flight> getAllFilterByAirlines(String origin, String destination, String name) {
        return flightRepository.findAll().stream().filter(x -> x.getAirLineName() == name && x.getOrigin() == origin && x.getDestination() == destination).sorted().toList();
    }*/

    public List<Flight> getAllFilterBySchedule(String origin, String destination, Date schedule) {
        return flightRepository.findAll().stream().filter(x -> x.getOrigin() == origin && x.getDestination() == destination).sorted().toList();
    }

    public List<Flight> getAllFilterByLuggage(boolean lugagge) {
        if (lugagge) {
            return flightRepository.findAll().stream().filter(x -> x.isLuggage() == true).toList();
        } else {
            return flightRepository.findAll().stream().filter(x -> x.isLuggage() == false).toList();
        }
    }

    public List<Flight> oneWayOrNot(String origin, String destination, LocalDate start, LocalDate end) {
        if (end == null) {
            return flightRepository.findAllByOriginAndDestinationAndDepartureTimeGreaterThanEqual(origin, destination, start);
        }
        else {
            return flightRepository.findAllByOriginAndDestinationAndDepartureTimeBetween(origin, destination, start, end);
        }
    }
}
