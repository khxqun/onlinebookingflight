package andras.varga.pricedetails;

import andras.varga.pricedetails.entity.FlightDetails;
import andras.varga.pricedetails.service.FlightDetailsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FlightDetailsServiceTest {

    FlightDetailsService service;

    @BeforeEach
    public void initializer(){
        service = new FlightDetailsService();
    }
    @Test
    public void getPriceAge_When_AgeIsTwoBetweenNine(long id){
        long id;
        var result = service.getPriceAge(id);
        assertTrue(result == 10);

    }
    @Test
    public void getPriceAge_When_LuggageIsTrue(long id){
        long id;
        var result = service.getPriceLuggage(id);
        assertTrue(result == 20);

    }
}
