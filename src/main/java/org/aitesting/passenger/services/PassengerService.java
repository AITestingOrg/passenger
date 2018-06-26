package org.aitesting.passenger.services;

import org.aitesting.passenger.interfaces.PassengerRepository;
import org.aitesting.passenger.model.Passenger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service
public class PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;

    public List<Passenger> getList() throws EntityNotFoundException{
        List<Passenger> passengers = new ArrayList<>();
        passengerRepository.findAll()
        .forEach(passengers::add);
        return passengers;
    }


    public Passenger getPassenger(long id) throws EntityNotFoundException {
        return passengerRepository.findOne(id);
    }

    public void addPassenger(Passenger passenger){
        passengerRepository.save(passenger);
    }

    public void updatePassenger(Passenger passenger) throws EntityNotFoundException{
        passengerRepository.save(passenger);
    }

    public void deletePassenger(long id) throws EntityNotFoundException{
        passengerRepository.delete(id);
    }

    public boolean isPassenger(Passenger passenger){
        return passengerRepository.exists(passenger.getId());
    }

    public boolean isPassengerById(long id){
        return passengerRepository.exists(id);
    }

}
