package org.aitesting.passenger.provider;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.aitesting.passenger.PassengerApplication;
import org.aitesting.passenger.interfaces.PassengerRepository;
import org.aitesting.passenger.model.Passenger;
import org.hibernate.validator.constraints.Email;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static org.aitesting.passenger.helpers.TestConstants.*;

@RunWith(SpringRunner.class)
@Profile("test")
@SpringBootTest(classes = PassengerApplication.class)
public abstract class PassengerContractBase {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private PassengerRepository passengerRepository;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
        passengerRepository.findAll();
        passengerRepository.save(new Passenger(FNAME, LNAME, EMAIL, STREET, CITY, STATE, ZIP, NUMBER));
        passengerRepository.save(new Passenger(FNAME2, LNAME, EMAIL, STREET, CITY, STATE, ZIP, NUMBER));
        passengerRepository.save(new Passenger(FNAME3, LNAME, EMAIL, STREET, CITY, STATE, ZIP, NUMBER));
        passengerRepository.save(new Passenger(FNAME4, LNAME, EMAIL, STREET, CITY, STATE, ZIP, NUMBER));
    }

    @After
    public void teardown(){

    }

//TODO:view trip management query
}
