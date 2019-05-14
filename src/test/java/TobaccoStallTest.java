import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor adultvisitor;
    Visitor childvisitor;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("The Ice Cream Stall", "Frederick Frederickson", 3, 1);
        adultvisitor = new Visitor(20, 160, 20.00);
        childvisitor = new Visitor(9, 100, 2.00);
    }

    @Test
    public void canGetName(){
        assertEquals("The Ice Cream Stall", tobaccoStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Frederick Frederickson", tobaccoStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(3, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(1, tobaccoStall.getRating());
    }

    @Test
    public void checkIsNotAllowedTo(){
        assertEquals(false, tobaccoStall.isAllowedTo(childvisitor));
    }

    @Test
    public void checkIsAllowedTo(){
        assertEquals(true, tobaccoStall.isAllowedTo(adultvisitor));
    }
}
