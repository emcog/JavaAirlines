import crew.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTests {

    //    instance variables
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Linda", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Linda", passenger.getName());
    }

    @Test
    public void setPassengerHasBags(){
        assertEquals(2, passenger.getBags());
    }
}