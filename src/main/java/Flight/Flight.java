package Flight;

import airports.Airport;

public class Flight {

//    Instance variables
    Airport dept;
    Airport dest;
//    constructor
    public Flight(Airport dept, Airport dest){
//        super(dept);
        this.dept = dept;
        this.dest = dest;

    }

    public String getAirportNameFromEnum(){
        return dept.getAirportName();
    }
}