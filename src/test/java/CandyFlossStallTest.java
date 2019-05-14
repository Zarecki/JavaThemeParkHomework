import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("The Ice Cream Stall", "Frederick Frederickson", 3, 1);
    }

    @Test
    public void canGetName(){
        assertEquals("The Ice Cream Stall", candyFlossStall.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Frederick Frederickson", candyFlossStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot(){
        assertEquals(3, candyFlossStall.getParkingSpot());
    }

    @Test
    public void canGetRating(){
        assertEquals(1, candyFlossStall.getRating());
    }

}
