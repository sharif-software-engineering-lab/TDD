import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
