import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateTest {
    @Test
    public void testAdd() {
        assertEquals(2, new Calculate().add(1,1));
    }
    @Test
    public void testSubtract() {
        assertEquals(8, new Calculate().subtract(10,2));
    }
    @Test
    public void testMultiply() {
        assertEquals(6, new Calculate().multiply(3, 2));
    }
    @Test
    public void testDivide() {
        assertEquals(5, new Calculate().divide(10, 2));
    }
}