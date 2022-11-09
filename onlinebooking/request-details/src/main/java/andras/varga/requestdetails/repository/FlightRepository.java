package andras.varga.requestdetails.repository;

import andras.varga.requestdetails.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findAllByOriginAndDestinationAndDepartureTimeBetween(String origin, String destination, LocalDate start, LocalDate end);
    List<Flight> findAllByOriginAndDestinationAndDepartureTimeGreaterThanEqual(String origin, String destination, LocalDate start);

}
