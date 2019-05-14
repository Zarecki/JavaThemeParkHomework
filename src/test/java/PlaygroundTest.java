import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor adultvisitor;
    Visitor childvisitor;

    @Before
    public void before(){
        playground = new Playground("The Playground", 4);
        adultvisitor = new Visitor(20, 160, 20.00);
        childvisitor = new Visitor(9, 100, 2.00);
    }

    @Test
    public void canGetName(){
        assertEquals("The Playground", playground.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(4, playground.getRating());
    }

    @Test
    public void checkIsNotAllowedTo(){
        assertEquals(false, playground.isAllowedTo(adultvisitor));
    }

    @Test
    public void checkIsAllowedTo(){
        assertEquals(true, playground.isAllowedTo(childvisitor));
    }
}
