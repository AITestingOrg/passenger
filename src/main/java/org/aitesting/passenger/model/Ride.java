package org.aitesting.passenger.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    private String startStAddr;

    @NotBlank
    private String startCity;

    @NotBlank
    private String startState;

    @NotBlank
    private String startZip;

    @NotBlank
    private String destinationAddr;

    @NotBlank
    private String destinationCity;

    @NotBlank
    private String destinationState;

    @NotBlank
    private String destinationZip;

    @NotNull
    private Status rideStatus;

    enum Status {
        COMPLETE, INRIDE, INTRANSIT,
        CANCELLED, PENDING
    }


}
