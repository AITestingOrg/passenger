package org.aitesting.passenger.controllers;

import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("api/v1/passenger")
public class PassengerController {


    @Autowired
    private PassengerService passengerService;


    @GetMapping
    public ResponseEntity getAllPassengers() throws EntityNotFoundException {
        return new ResponseEntity<>(passengerService.getList(),HttpStatus.OK);
    }

    @GetMapping(value="{passID}")
    public ResponseEntity getPassenger(@PathVariable long passID) throws EntityNotFoundException {
        if(!passengerService.isPassengerById(passID)) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(passengerService.getPassenger(passID),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity addPassenger(@RequestBody Passenger passenger){
            passengerService.addPassenger(passenger);
            return new ResponseEntity<>(passenger, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity updatePassenger(@RequestBody Passenger passenger) throws EntityNotFoundException {
            if(!passengerService.isPassenger(passenger)) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }

            passengerService.updatePassenger(passenger);
            return new ResponseEntity<>("Updated",HttpStatus.OK);
    }

    @DeleteMapping(value = "{passID}")
    public ResponseEntity deletePassenger(@PathVariable long passID) throws EntityNotFoundException {
        if(!passengerService.isPassengerById(passID)){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        passengerService.deletePassenger(passID);
        return new ResponseEntity(HttpStatus.OK);
    }

}