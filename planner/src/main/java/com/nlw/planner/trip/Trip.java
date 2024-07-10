package com.nlw.planner.trip;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Setter
@Table(name = "trips")
@NoArgsConstructor
@AllArgsConstructor
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    
    @Column(nullable = false)
    private String destination;
    
    @Column(name = "trip_start", nullable = false)
    private LocalDateTime tripStart;

    @Column(name = "trip_end", nullable = false)
    private LocalDateTime tripEnd;

    @Column(name = "owner_name", nullable = false)
    private String ownerName;
    
    @Column(name = "owner_email", nullable = false)
    private String ownerEmail;

    @Column(name = "is_confirmed", nullable = false)
    private boolean isConfirmed;

    public Trip(TripRequestPayload data) {
        this.destination = data.destination();
        this.tripStart = LocalDateTime.parse(data.trip_start(), DateTimeFormatter.ISO_DATE_TIME);
        this.tripEnd = LocalDateTime.parse(data.trip_end(), DateTimeFormatter.ISO_DATE_TIME);
        this.ownerName = data.owner_name();
        this.ownerEmail = data.owner_email();
        this.isConfirmed = false;
    }
}
