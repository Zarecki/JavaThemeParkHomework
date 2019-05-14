import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Badass Bumpercars", 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Badass Bumpercars", dodgems.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(3, dodgems.getRating());
    }
}
