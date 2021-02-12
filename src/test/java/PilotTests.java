import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTests {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Maverick", "0001M");
    }

    @Test
    public void hasName(){
        assertEquals("Maverick", pilot.getName());
    }

    @Test
    public void pilotHasLicenseNumber(){
        assertEquals("0001M", pilot.getLicenseNumber());
    }
}