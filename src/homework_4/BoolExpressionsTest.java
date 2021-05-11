package homework_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class BoolExpressionsTest {

    BoolExpressions boolExpressions;

    @Before
    public void setUp() throws Exception {
        boolExpressions = new BoolExpressions();
    }

    @Test
    public void testTest1() {
        assertTrue(boolExpressions.test1(10));
    }

    @Test
    public void testTest2() {
        assertTrue(boolExpressions.test2(1));
    }

    @Test
    public void testTest3() {
        assertEquals("Even", boolExpressions.test3(10));
    }

    @Test
    public void testTest4() {
        assertEquals("young", boolExpressions.test4(30));
    }

    @Test
    public void testTest5() {
        assertTrue(boolExpressions.test5("Hello World", 11));
    }

    @Test
    public void testTest6() {
        assertTrue(boolExpressions.test6("Hello World", "Hello World"));
    }

    @Test
    public void testTest7() {
        assertEquals(2, boolExpressions.test7(1, 2));
    }

}