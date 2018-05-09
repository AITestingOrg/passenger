package org.aitesting.passenger.controllers;

import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.model.PassengerDto;
import org.aitesting.passenger.services.PassengerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class PassengerController {


    @Autowired
    private PassengerService passengerService;

    private ModelMapper modelMapper = new ModelMapper();


    @GetMapping(value="passenger/list")
    public List<Passenger> getAllPassengers() {
        return passengerService.getList();
    }

    @GetMapping(value="passenger/{passID}")
    public Passenger getPassenger(@PathVariable long passID) {
        return passengerService.getPassenger(passID);
    }

    @PostMapping(value = "passenger")
    public Passenger addPassenger(@RequestBody PassengerDto passengerDto){
        Passenger passenger = convertToPassenger(passengerDto);
        passengerService.addPassenger(passenger);
        return passenger;
    }

    @PutMapping(value="passenger")
    public void updatePassenger(@RequestBody Passenger passenger){
        passengerService.updatePassenger(passenger);
    }

    @DeleteMapping(value = "passenger/{passID}")
    public void deletePassenger(@PathVariable long passID){
        passengerService.deletePassenger(passID);
    }

    private Passenger convertToPassenger(PassengerDto passengerDto) {
        return modelMapper.map(passengerDto, Passenger.class);
    }

    private PassengerDto convertToPassengerDto(Passenger passenger) {
        return modelMapper.map(passenger, PassengerDto.class);
    }

}
