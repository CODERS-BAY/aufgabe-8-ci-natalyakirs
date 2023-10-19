import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.lukaswais.Calculator;

public class CalculatorTest {
    @Test
    void testAdd() {
        double result = Calculator.add(2.5, 3.7);
        Assertions.assertEquals(6.2, result, 0.0001);
    }

    @Test
    void testSubtract() {

        double result = Calculator.subtract(2.5, 0.7);
        Assertions.assertEquals(1.8, result, 0.0001);
    }

    @Test
    void testMultiply() {

        double result = Calculator.multiply(2.5, 3.7);
        Assertions.assertEquals(9.25, result, 0.0001);
    }

    @Test
    void testDivide() {

        double result = Calculator.divide(9.25, 3.7);
        Assertions.assertEquals(2.5, result, 0.0001);
    }

    /**
     * checks if the correct exception is thrown.
     */
    @Test
    void testDivideByZeroException() {
        Assertions.assertThrows(ArithmeticException.class, () -> Calculator.divide(5.0, 0.0));   }

    /**
     * checks if the correct error message is thrown
     */
    @Test
    void testDivideByZeroExceptionMessage() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.divide(5.0, 0.0);
        });

        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();

        Assertions.assertEquals(expectedMessage, actualMessage);

    }

}
