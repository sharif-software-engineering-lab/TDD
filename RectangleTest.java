import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;

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
    private Rectangle rectangle;

    @Before
    public void setUp() {
        rectangle = new Rectangle(5, 4);
    }

    @Test
    public void testGetLength() {
        assertEquals(5, rectangle.getLength(), 0.001);
    }

    @Test
    public void testGetWidth() {
        assertEquals(4, rectangle.getWidth(), 0.001);
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(10);
        assertEquals(10, rectangle.getLength(), 0.001);
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(8);
        assertEquals(8, rectangle.getWidth(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeLength() {
        rectangle.setLength(-3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeWidth() {
        rectangle.setWidth(-3);
    }
}

public class SquareTest {

    @Test
    public void testSquareCreation() {
        Square square = new Square(5);
        assertEquals(5, square.getLength(), 0.001);
        assertEquals(5, square.getWidth(), 0.001);
    }

    @Test
    public void testUpdatingLengthUpdatesWidthForSquare() {
        Square square = new Square(5);
        square.setLength(10);
        assertEquals(10, square.getWidth(), 0.001);
    }

    @Test
    public void testUpdatingWidthUpdatesLengthForSquare() {
        Square square = new Square(5);
        square.setWidth(8);
        assertEquals(8, square.getLength(), 0.001);
    }
}
