package org.aitesting.passenger.unit;

import org.aitesting.passenger.interfaces.PassengerRepository;
import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.services.PassengerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.context.ActiveProfiles;

import static org.aitesting.passenger.helpers.TestConstants.ID;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;


@ActiveProfiles("test")
@RunWith(MockitoJUnitRunner.class)
public class PassengerServiceUnitTests {

    @InjectMocks
    private PassengerService passengerService;

    @Mock
    private PassengerRepository passengerRepository;


    @Test
    public void testGetList() {
        // arrange

        // act
        passengerService.getList();

        // assert
        verify(passengerRepository, times(1)).findAll();
    }

    @Test
    public void testGetPassenger() {
        // arrange

        // act
        passengerService.getPassenger(ID);

        // assert
        verify(passengerRepository, times(1)).findOne(ID);
    }

    @Test
    public void testAddPassenger() {
        // arrange
        Passenger passenger = new Passenger();

        // act
        passengerService.addPassenger(passenger);

        // assert
        verify(passengerRepository, times(1)).save(passenger);
    }

    @Test
    public void testUpdatePassenger() {
        // arrange
        Passenger passenger = new Passenger();

        // act
        passengerService.updatePassenger(passenger);

        // assert
        verify(passengerRepository, times(1)).save(passenger);
    }

    @Test
    public void testDeletPassenger() {
        // arrange

        // act
        passengerService.deletePassenger(ID);

        // assert
        verify(passengerRepository, times(1)).delete(ID);
    }
}
