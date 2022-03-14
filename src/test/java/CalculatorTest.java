import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() { calculator = new Calculator();}

    @Test
    public void canAdd() {assertEquals(12, calculator.add(6,6));}

    @Test
    public void canSubtract(){
        assertEquals(6, calculator.subtract(18, 12));
    }
    @Test
    public void canMultiply(){
        assertEquals(27, calculator.multiply(3, 9));
    }

    @Test
    public void canDivide(){
        assertEquals(3.00, calculator.divide(27.00, 9.00), 0.00);
    }
}
