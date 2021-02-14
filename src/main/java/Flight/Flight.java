package Flight;

import crew.CabinCrew;
import crew.FlightDeck;
import crew.Passenger;

import java.util.ArrayList;

public class Flight {

    private String dept;
    private String dest;
    private ArrayList<FlightDeck> flightDeckMembers;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;


    public Flight(String dept, String dest) {
        this.dept = dept;
        this.dest = dest;

        this.flightDeckMembers = new ArrayList<FlightDeck>();
        this.cabinCrewMembers = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
    }

    public String getDeptAirport() {
        return this.dept;
    }

    public String getDestAirport() {
        return this.dest;
    }

    public void addFlightDeckMembers(FlightDeck flightDeck) {
        this.flightDeckMembers.add(flightDeck);
    }


    public void addCabinCrewMembers(CabinCrew cabinCrew) {
        this.cabinCrewMembers.add(cabinCrew);
        System.out.println(cabinCrewMembers.get(0).getName());
    }

    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

}
