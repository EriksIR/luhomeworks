package homework_7.task_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraysWorkshopTest {

    int[] arrays = {3, 5, 7, 9, 4};
    ArraysWorkshop arraysWorkshop;

    @Before
    public void setUp() throws Exception {
        arraysWorkshop = new ArraysWorkshop();
    }

    @Test
    public void willMinValueBe3() {
        assertEquals(3, arraysWorkshop.min(arrays));
    }

    @Test
    public void willMinValueShouldFailToBe3() {
        assertNotEquals(10, arraysWorkshop.min(arrays));
    }

    @Test
    public void willFindValue9() {
        assertEquals(3, arraysWorkshop.find(arrays, 9));
    }

    @Test
    public void willNotFindValue9() {
        assertEquals(-1, arraysWorkshop.find(arrays, 11));
    }

    @Test
    public void willReturnArraySum() {
        assertEquals(28, arraysWorkshop.sumArray(arrays));
    }

    @Test
    public void willNotReturnArraySum() {
        assertNotEquals(15, arraysWorkshop.sumArray(arrays));
    }
}