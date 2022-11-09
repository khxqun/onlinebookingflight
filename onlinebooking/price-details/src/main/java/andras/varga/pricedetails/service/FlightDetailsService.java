package andras.varga.pricedetails.service;

import andras.varga.pricedetails.entity.FlightDetails;
import andras.varga.pricedetails.repository.FlightDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightDetailsService {

    @Autowired
    FlightDetailsRepository details;

    public int getPriceAge(long id){
        List<FlightDetails> elements = details.findById(id).stream().toList();
        int price=0;
        for (FlightDetails elemet: elements) {
            price =+ elemet.getPriceAge();
        }
        return price;
    }
    public int getPriceLuggage(long id){
        List<FlightDetails> elements = details.findById(id).stream().toList();
        int price=0;
        for (FlightDetails elemet: elements) {
            price =+ elemet.getPriceLuggage();
        }
        return price;
    }
}
