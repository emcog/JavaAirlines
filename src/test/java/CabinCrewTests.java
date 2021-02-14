import org.junit.Before;
import org.junit.Test;
import crew.CrewType;

import static org.junit.Assert.assertEquals;

public class CabinCrewTests {

    crew.CabinCrew cabinCrew;

    @Before
    public void before(){
        cabinCrew = new crew.CabinCrew("Bruce", CrewType.FLIGHTATTENDANT );
    }

    @Test
    public void cabinCrewHasRank(){
        assertEquals("Flight Attendant", CrewType.FLIGHTATTENDANT.getRank());
    }
}

//    @Test
//    public void crewCanMakeAnnouncement(){
//    assertEquals("Ladies and gentlemen, dinner is served", crew.announcement());
//    }
//}