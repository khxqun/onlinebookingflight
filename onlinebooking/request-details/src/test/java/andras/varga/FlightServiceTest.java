package andras.varga;

import andras.varga.requestdetails.entities.Flight;
import andras.varga.requestdetails.service.FlightService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FlightServiceTest {

    FlightService service;

    @BeforeEach
    public void initialize() {
        service = new FlightService();
    }
    @Test
    public void  getAllOrigins_WhenCalled_GetAllOrigins(){

        var result=service.getAllOrigins();
        assertTrue(result.size() != 0);
    }

    @Test
    public void getAllDestinationByOrigin_WhenOriginIsBudapest_ExpectedDepartureIsSeville(){

        String origin = "Budapest";
        var result= service.getAllDestinationByOrigin(origin);

        assertTrue(result.equals("Seville"));
    }

    @Test
    public void getAllFilterByLuggage_WhenLuggageIsTrue_GetAListOfFlightsWithLugagge() {

        var list= service.getAllFilterByLuggage(true);
        assertTrue(list.size() == 1);
    }

    @Test
    public void oneWayOrNot_WhenCalled_GotBackAListOfFlights(String origin, String destination, LocalDate start, LocalDate end)
}
