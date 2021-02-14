import Flight.Flight;
import airports.Airport;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTests {

    Flight flight;

    @Before
    public void before(){
        flight = new Flight(Airport.LHR);
    }

    @Test
    public void flightHasDept(){
        assertEquals("London Heathrow", Airport.LHR.getAirportName());
    }

//    @Test
//    public void flightHasArrival(){
//        assertEquals("Edinburgh", flight.getDestAirport());
//    }
}