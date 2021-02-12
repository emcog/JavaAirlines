import org.junit.Before;
import org.junit.Test;

public class CabinCrewTests {

    CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new CabinCrew("Bruce");
    }

    @Test
    public void crewCanMakeAnnouncement(){
    assertEquals("Ladies and gentlemen, dinner is served", crew.announcement());
    }
}
