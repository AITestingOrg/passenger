package org.aitesting.passenger.controllers;

import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping(value="/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;



    @RequestMapping(value="/list", method= RequestMethod.GET)
    public List<Passenger> getAllPassengers(){
        return passengerService.getList();
    }

    @RequestMapping(value="/{passID}", method= RequestMethod.GET)
    public Passenger getPassenger(@PathVariable long passID) {
        return passengerService.getPassenger(passID);
    }

    @RequestMapping(value="/add", method= RequestMethod.POST)
    public void addPassenger(@RequestBody Passenger passenger){
        passengerService.addPassenger(passenger);
    }

    @RequestMapping(value="/{passID}", method = RequestMethod.PUT)
    public void updatePassenger(@PathVariable long passID, @RequestBody Passenger passenger){
        passengerService.updatePassenger( passID, passenger);
    }

    @RequestMapping(value = "/{passID}", method = RequestMethod.DELETE)
    public void deletePassenger(@PathVariable long passID){
        passengerService.deletePassenger(passID);
    }
}
