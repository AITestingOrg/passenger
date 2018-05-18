package org.aitesting.passenger.provider;


//import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.aitesting.passenger.PassengerApplication;
import org.aitesting.passenger.controllers.PassengerController;
import org.aitesting.passenger.model.Passenger;
import org.aitesting.passenger.services.PassengerService;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

import static org.aitesting.passenger.helpers.TestConstants.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("test")
@SpringBootTest(classes = PassengerApplication.class)
public abstract class PassengerContractBase {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    PassengerController passengerController;

    @MockBean
    private PassengerService passengerService;

    @Before
    public void setup() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext);
        RestAssuredMockMvc.standaloneSetup(passengerController);

        Mockito.when(passengerService.getPassenger(1L))
                .thenReturn(new Passenger(FNAME, LNAME, EMAIL, STREET, CITY, STATE, ZIP, NUMBER));
    }

    @After
    public void teardown(){

    }

//TODO:view trip management query
}
