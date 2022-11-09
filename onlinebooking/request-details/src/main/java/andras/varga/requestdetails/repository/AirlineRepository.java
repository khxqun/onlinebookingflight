package andras.varga.requestdetails.repository;

import andras.varga.requestdetails.entities.AirLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository  extends JpaRepository<AirLine, Long> {
}
