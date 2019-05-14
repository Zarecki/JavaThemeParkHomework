import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("The Ice Cream Stall", "Frederick Frederickson", 3, 1);
    }

    @Test
    public void canGetName(){
        assertEquals("The Ice Cream Stall", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Frederick Frederickson", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(3, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(1, iceCreamStall.getRating());
    }
}
