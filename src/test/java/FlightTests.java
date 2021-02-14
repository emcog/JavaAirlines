import Flight.Flight;
import airports.Airport;
import com.sun.xml.internal.bind.v2.TODO;
import crew.CabinCrew;
import crew.CrewType;
import crew.FlightDeck;
import crew.Passenger;
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


    @Test
    public void canAddCabinCrew(){
        CabinCrew cabinCrew;
        cabinCrew = new CabinCrew("Bruce", CrewType.FLIGHTATTENDANT);
        flight.addCabinCrewMembers(cabinCrew);
//          TODO Why cant this work? – PRIVATE ACCESS
//        assertEquals("Bruce", flight.cabinCrewMembers.get(0).getName());
    }


    @Test
    public void canAddFlightDeckMember(){
        FlightDeck flightDeck;
        flightDeck = new FlightDeck("Sandra", CrewType.CAPTAIN, "0002J" );
        flight.addFlightDeckMembers(flightDeck);
//        TODO Why cant this work? – PRIVATE ACCESS
//        assertEquals("Bruce", flight.flightDeckMembers.get(0).getName());
    }


    @Test
    public void canAddPassenger(){
        Passenger passenger01;
        Passenger passenger02;
        Passenger passenger03;

        passenger01 = new Passenger("Willy", 2);
        passenger02 = new Passenger("Harry", 3);
        passenger03 = new Passenger("Rick", 1);

        flight.addPassenger(passenger01);
        flight.addPassenger(passenger02);
        flight.addPassenger(passenger03);

        assertEquals(3, flight.getPassengerCount());
    }


    @Test
    public void canCountBags(){
        Passenger passenger01;
        Passenger passenger02;
        Passenger passenger03;
        passenger01 = new Passenger("Willy", 2);
        passenger02 = new Passenger("Harry", 3);
        passenger03 = new Passenger("Rick", 1);

        assertEquals(6, flight.getFlightBagCount());
    }
}