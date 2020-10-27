import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class StringCalculatorTest {
	private StringCalculator calculator;
	@Before
    public void initialize() {
        calculator = new StringCalculator();
    }

    @Test
    public void emptyStringShouldReturn0() {
        assertEquals(StringCalculator.Add(""), 0);
    }

    @Test
    public void numberStringShouldReturnSameNumber() {
        assertEquals(StringCalculator.Add("1"), 1);
        assertEquals(StringCalculator.Add("5"), 5);
    }

    @Test
    public void numbersCommaDelimitedShouldBeSummed() {
        assertEquals(StringCalculator.Add("1,2"), 3);
        assertEquals(25, calculator.Add("10,15"));
    }

}