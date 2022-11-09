package andras.varga.pricedetails.entity;

import andras.varga.requestdetails.entities.Flight;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@Table
@EntityScan(basePackages = "andras.varga.requestdetails.entity")
public class FlightDetails {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    @JoinColumn(name = "flightId")
    @ManyToOne(cascade = CascadeType.ALL)
    private Flight flightId;

    @Column(name = "price_luggage")
    private int priceLuggage;

    @Column(name = "price_age")
    private int priceAge;


}
