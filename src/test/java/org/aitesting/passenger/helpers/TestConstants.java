package org.aitesting.passenger.helpers;

import org.aitesting.passenger.model.Passenger;

public class TestConstants {
    public static final String FNAME = "John";
    public static final String LNAME = "Doe";
    public static final String NUMBER = "979-754-7244";
    public static final String EMAIL = "JohnDoe@yahoo.com";
    public static final String STREET = "1601 Colonial Drive";
    public static final String CITY = "Bryan";
    public static final String STATE = "TX";
    public static final String ZIP = "77801";
    public static final long ID = 1;
    public static final Passenger PASSENGER = new Passenger(FNAME, LNAME, NUMBER, EMAIL,
                                                            STREET, CITY, STATE, ZIP);
}
