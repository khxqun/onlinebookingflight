package andras.varga.pricedetails.controller;

import andras.varga.pricedetails.service.FlightDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v3/")

public class FlightDetailsController {

    @Autowired
    FlightDetailsService flightDetailsService;

    @GetMapping("/booking")
    public int getPriceOfAgeById(@RequestParam("{id}") long id) {
        return flightDetailsService.getPriceLuggage(id);
    }

    @GetMapping("/booking")
    public int getPriceOfLuggageById(@RequestParam("{id}") long id) {
        return flightDetailsService.getPriceLuggage(id);
    }


}
