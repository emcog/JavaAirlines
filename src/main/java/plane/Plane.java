package plane;

public class Plane {

    private String planeType;
    private PlaneModelType planeModelType;

//    constructor function
    public Plane(PlaneModelType planeModelType){
        this.planeModelType = planeModelType;
    }

    public String getPlaneType(){
        return this.planeType;
    }

}
