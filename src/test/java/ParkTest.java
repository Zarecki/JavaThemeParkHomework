import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("The Park", 2);
    }

    @Test
    public void canGetName(){
        assertEquals("The Park", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(2, park.getRating());
    }
}
