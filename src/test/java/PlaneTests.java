import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneModelType;

import static org.junit.Assert.assertEquals;

public class PlaneTests {

//    instance variables
    Plane plane;

    @Before
    public void before(){
        plane = new Plane("747", PlaneModelType.B737);
    }

    @Test
    public void paneHasNumber(){
        assertEquals("747", plane.getPlaneType());
    }

    @Test
    public void planeHasModelType(){
        assertEquals("737", PlaneModelType.B737.getModelType());
    }


}
