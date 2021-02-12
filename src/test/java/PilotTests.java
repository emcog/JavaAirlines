import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTests {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Maverick");
    }

    @Test
    public void hasName(){
        assertEquals("Maverick", pilot.getName());
    }
}
