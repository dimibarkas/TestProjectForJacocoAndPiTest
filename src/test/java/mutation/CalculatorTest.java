package mutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void add() {
        assertEquals(10,calculator.add(5,5));
    }

    @Test
    public void subtract() {
        assertEquals(2,calculator.subtract(7,5));
    }

    @Test
    public void multiply() {
        assertEquals(25,calculator.multiply(5,5));
    }

    @Test
    public void divide() {
        assertEquals(5,calculator.divide(25,5));
    }

    @Test
    public void divideThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5,0);
        });
    }
}