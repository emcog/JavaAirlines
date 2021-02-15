package Flight;

import airports.Airport;
import crew.CabinCrew;
import crew.FlightDeck;
import crew.Passenger;

import java.util.ArrayList;

public class Flight {


//    Instance variables
    Airport dept;
    Airport dest;

    private ArrayList<FlightDeck> flightDeckMembers;
    private ArrayList<CabinCrew> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private int totalBags;
//    constructor
    public Flight(Airport dept, Airport dest){
//        super(dept);
        this.dept = dept;
        this.dest = dest;

        this.flightDeckMembers = new ArrayList<FlightDeck>();
        this.cabinCrewMembers = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();

    }



    public String getDeptAirport() {
        return this.dept.getAirportName();
    }

    public String getDestAirport() {
        return this.dest.getAirportName();
    }


    public void addFlightDeckMembers(FlightDeck flightDeck) {
        this.flightDeckMembers.add(flightDeck);
    }

    public void addCabinCrewMembers(CabinCrew cabinCrew) {
        this.cabinCrewMembers.add(cabinCrew);
        System.out.println(cabinCrewMembers.get(0).getName());
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }


    public int getPassengerCount() {
        return this.passengers.size();
    }


    public int getFlightBagCount(){
//    TODO fix for loop syntax
        for(Passenger passenger:passengers  ) {
            totalBags += passenger.getPassengerBagCount();
        }
        return totalBags;
    }

}