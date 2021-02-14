package Flight;

import airports.Airport;

public class Flight {

    private String dept;
    private String dest;

//
//    constructor
//    public Flight(Airport dept){
//        super(dept);
//    }

    public Flight(String dept, String dest){
        this.dept = dept;
        this.dest = dest;
    }

    public String getDeptAirport(){
        return this.dept;
    }

    public String getDestAirport(){
        return this.dest;
    }
}
