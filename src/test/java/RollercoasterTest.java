import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor adultvisitor;
    Visitor childvisitor;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("The Rollercoaster", 5);
        adultvisitor = new Visitor(20, 160, 20.00);
        childvisitor = new Visitor(9, 100, 2.00);
    }

    @Test
    public void canGetName(){
        assertEquals("The Rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(5, rollercoaster.getRating());
    }

    @Test
    public void checkIsNotAllowedTo(){
        assertEquals(false, rollercoaster.isAllowedTo(childvisitor));
    }

    @Test
    public void checkIsAllowedTo(){
        assertEquals(true, rollercoaster.isAllowedTo(adultvisitor));
    }
}
