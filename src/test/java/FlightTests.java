import Flight.Flight;
import airports.Airport;
import crew.CabinCrew;
import crew.CrewType;
import crew.FlightDeck;
import jdk.nashorn.api.scripting.ScriptObjectMirror;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

//    @Test
//    public void canAddCabinCrew(){
//        CabinCrew cabinCrew;
//        cabinCrew = new CabinCrew("Bruce", CrewType.FLIGHTATTENDANT);
//        flight.addCabinCrewMembers(cabinCrew);
//        assertEquals("Bruce", cabinCrewMembers.get(0).getName());
//    }

//    @Test
//    public void canAddFlightDeckMember(){
//        FlightDeck flightDeck;
//        flightDeck = new FlightDeck("Sandra", );
//        flight.addCabinCrewMembers(cabinCrew);
//        assertEquals("Bruce", cabinCrewMembers.get(0).getName());
//
//    }

    @Test
    public void canAddPassenger(){

    }
}