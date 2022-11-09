package andras.varga.requestdetails.entities;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table
public class Flight implements Serializable {


    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @JoinColumn(name = "airlineId")
    @ManyToOne(cascade = CascadeType.ALL)
    private AirLine airline;

    @Column(name = "flight_number")
    private int flightNumber;

    @Column(name = "transit_time")
    private LocalDateTime transitTime;

    @Column(name = "layover_numbers")
    private int layoverNumbers;

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Column(name = "luggage")
    private boolean luggage;

    @Column(name = "departure_time")
    private LocalDate departureTime;


}
