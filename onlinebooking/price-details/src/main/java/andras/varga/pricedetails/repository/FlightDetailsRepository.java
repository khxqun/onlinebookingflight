package andras.varga.pricedetails.repository;

import andras.varga.pricedetails.entity.FlightDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Long> {
}
