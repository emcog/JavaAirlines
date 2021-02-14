public class Pilot extends CrewMember {

    private String licenseNumber;

//    constructor
    public Pilot(String name, String licenseNumber, CrewType crewType){
        super(name, crewType);
        this.licenseNumber = licenseNumber;
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