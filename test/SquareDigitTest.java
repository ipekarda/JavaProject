
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SquareDigitTest{
    @Test
    public void test() {
        assertEquals(811181, new Isogram().squareDigits(9119));
        assertNotEquals(100, new Isogram().squareDigits(10));
    }

}