import org.junit.Before;
import org.junit.Test;
import plane.Plane;

import static org.junit.Assert.assertEquals;

public class PlaneTests {

//    instance variables
    Plane plane;

    @Before
    public void before(){
        plane = new Plane("747");
    }

    @Test
    public void paneHasNumber(){
        assertEquals("747", plane.getPlaneType());
    }
}
