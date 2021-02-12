public class Pilot {

    private String name;
    private String licenseNumber;

//    constructor
    public Pilot(String name, String licenseNumber){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getLicenseNumber(){
        return this.licenseNumber;
    }

    public String takeOff(){
        return "Engines are burning, wheel are turning";
    }

    public String land() {
        return "Flaps are down fasten your seat belts please";
    }
}