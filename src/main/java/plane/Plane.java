package plane;

public class Plane {

    private String planeType;
    private PlaneModelType planeModelType;

//    constructor function
    public Plane(String planeType, PlaneModelType planeModelType){
        this.planeType = planeType;
        this.planeModelType = planeModelType;
    }

    public String getPlaneType(){
        return this.planeType;
    }

}
