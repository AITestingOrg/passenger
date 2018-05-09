package org.aitesting.passenger;

import org.aitesting.passenger.controllers.PassengerController;
import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.model.PassengerDto;
import org.aitesting.passenger.services.PassengerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

import static org.aitesting.passenger.helpers.TestConstants.ID;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@DataJpaTest
@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = { PassengerConfig.class})
public class PassengerControllerUnitTest {
    //TODO:Create the remaining unit test and duplicate for the repository
    @Mock
    private PassengerService passengerService;

    @InjectMocks
    private PassengerController passengerController;

    private ModelMapper modelMapper = new ModelMapper();

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
        PassengerDto passengerDto = new PassengerDto();
        Passenger passenger = modelMapper.map(passengerDto, Passenger.class);

        // act
        passengerController.addPassenger(passengerDto);

        // assert
        verify(passengerService, times(1)).addPassenger(passenger);
    }


    @Test
    public void testUpdatePassenger() {
        // arrange
        Passenger passenger = new Passenger();

        // act
        passengerController.updatePassenger(passenger);

        // assert
        verify(passengerService, times(1)).updatePassenger(passenger);
    }

    @Test
    public void testDeletePassenger() {
        // arrange

        // act
        passengerController.deletePassenger(ID);

        // assert
        verify(passengerService, times(1)).deletePassenger(ID);
    }

    @Test
    public void testConvertToPassenger() {
        // given
        PassengerDto passengerDto = new PassengerDto();

        // when
        Passenger passenger = modelMapper.map(passengerDto, Passenger.class);

        // then
        assertEquals(passengerDto.getFirstName(),passenger.getFirstName());
        assertEquals(passengerDto.getLastName(),passenger.getLastName());
        assertEquals(passengerDto.getEmail(),passenger.getEmail());
        assertEquals(passengerDto.getPhoneNumber(),passenger.getPhoneNumber());
        assertEquals(passengerDto.getStreetAddress(),passenger.getStreetAddress());
        assertEquals(passengerDto.getCity(),passenger.getCity());
        assertEquals(passengerDto.getState(),passenger.getState());
        assertEquals(passengerDto.getZip(),passenger.getZip());
    }

    @Test
    public void testConvertToPassengerDto() {
        // given
        Passenger passenger = new Passenger();

        // when
        PassengerDto passengerDto = modelMapper.map(passenger, PassengerDto.class);

        // then
        assertEquals(passengerDto.getFirstName(),passenger.getFirstName());
        assertEquals(passengerDto.getLastName(),passenger.getLastName());
        assertEquals(passengerDto.getEmail(),passenger.getEmail());
        assertEquals(passengerDto.getPhoneNumber(),passenger.getPhoneNumber());
        assertEquals(passengerDto.getStreetAddress(),passenger.getStreetAddress());
        assertEquals(passengerDto.getCity(),passenger.getCity());
        assertEquals(passengerDto.getState(),passenger.getState());
        assertEquals(passengerDto.getZip(),passenger.getZip());
    }
}
