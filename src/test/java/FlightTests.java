import Flight.Flight;
import airports.Airport;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTests {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight("London Heathrow", "Edinburgh");
    }

    @Test
    public void flightHasDept(){
        assertEquals("London Heathrow", flight.getDeptAirport());
    }

    @Test
    public void flightHasArrival(){
        assertEquals("Edinburgh", flight.getDestAirport());
    }
}