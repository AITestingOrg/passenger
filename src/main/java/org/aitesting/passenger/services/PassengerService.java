package org.aitesting.passenger.services;

import org.aitesting.passenger.interfaces.PassengerRepository;
import org.aitesting.passenger.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getList(){
        List<Passenger> passengers = new ArrayList<>();
        passengerRepository.findAll()
        .forEach(passengers::add);
        return passengers;
    }

    public Passenger getPassenger(long id){
        return passengerRepository.findOne(id);
    }

    public void addPassenger(Passenger passenger){
        passengerRepository.save(passenger);
    }

    public void updatePassenger(long id, Passenger passenger){
        passengerRepository.save(passenger);
    }

    public void deletePassenger(long id){
        passengerRepository.delete(id);
    }

}
