import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(13, 140, 10.00);
    }

    @Test
    public void canGetAge(){
        assertEquals(13, visitor.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(140, visitor.getHeight());
    }

    @Test
    public void canGetMoney(){
        assertEquals(10.00, visitor.getMoney(), 0.01);
    }
}
