import static org.junit.Assert.*;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testAreaWithPositiveNumbers() {
        Rectangle rectangle = new Rectangle(5, 4);
        assertEquals(20, rectangle.computeArea(), 0.001);
    }

    @Test
    public void testAreaWithZero() {
        Rectangle rectangle = new Rectangle(0, 4);
        assertEquals(0, rectangle.computeArea(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAreaWithNegativeNumbers() {
        new Rectangle(-5, 4);
    }
}
