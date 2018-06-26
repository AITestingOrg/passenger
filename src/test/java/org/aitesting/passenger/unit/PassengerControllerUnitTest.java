package org.aitesting.passenger.unit;

import org.aitesting.passenger.controllers.PassengerController;
import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.services.PassengerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.aitesting.passenger.helpers.TestConstants.ID;
import static org.aitesting.passenger.helpers.TestConstants.PASSENGER;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@DataJpaTest
@RunWith(MockitoJUnitRunner.class)
public class PassengerControllerUnitTest {
    //TODO:Create the remaining unit test and duplicate for the repository
    @Mock
    private PassengerService passengerService;

    @InjectMocks
    private PassengerController passengerController;

    @Before
    public void setup() {
        when(passengerService.isPassengerById(ID)).thenReturn(true);
        when(passengerService.isPassenger(PASSENGER)).thenReturn(true);
    }


    @Test
    public void testGetAllPassengers() {
        // arrange

        // act
        passengerController.getAllPassengers();

        // assert
        verify(passengerService, times(1)).getList();
    }

    @Test
    public void testGetPassenger() {
        // arrange

        // act
        passengerController.getPassenger(ID);

        // assert
        verify(passengerService, times(1)).getPassenger(ID);
    }

    @Test
    public void testAddPassenger() {
        // arrange
        Passenger passenger = new Passenger();

        // act
        passengerController.addPassenger(passenger);

        // assert
        verify(passengerService, times(1)).addPassenger(passenger);
    }


    @Test
    public void testUpdatePassenger() {
        // arrange

        // act
        passengerController.updatePassenger(PASSENGER);

        // assert
        verify(passengerService, times(1)).updatePassenger(PASSENGER);
    }

    @Test
    public void testDeletePassenger() {
        // arrange

        // act
        passengerController.deletePassenger(ID);

        // assert
        verify(passengerService, times(1)).deletePassenger(ID);
    }
}