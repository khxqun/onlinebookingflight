package andras.varga.requestdetails.controller;

import andras.varga.requestdetails.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:300")
@RestController
@RequestMapping("/api/v3/")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight")
    public List<String> getAllOrigins() {
        return flightService.getAllOrigins();
    }

    @GetMapping("/depart")
    public List<String> getAllDestinationByOrigin(@RequestParam("origin") String origin){
        return flightService.getAllDestinationByOrigin(origin);
    }

    /*@GetMapping()
    public  List<String> getAllFlightByOriginAndDestinationAndDates(String origin, String destination, LocalDate start, LocalDate end){
        return flightService.oneWayOrNot(origin,destination, start, end);
    }*/
}
