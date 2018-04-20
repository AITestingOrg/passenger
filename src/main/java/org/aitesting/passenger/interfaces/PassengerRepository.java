package org.aitesting.passenger.interfaces;

import org.aitesting.passenger.model.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository <Passenger, Long>{
}
