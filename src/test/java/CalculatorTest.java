import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void shouldCorrectAddTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.add(a, b);

        // then
        Assert.assertEquals(5, result, 0.001);
    }

    @Test
    public void shouldCorrectSubtractTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.subtract(a, b);

        // then
        Assert.assertEquals(1, result, 0.001);
    }

    @Test
    public void shouldCorrectDivideTwoNumbers() {
        // given
        double a = 4;
        double b = 2;

        // when
        double result = calculator.divide(a, b);

        // then
        Assert.assertEquals(2, result, 0.001);
    }

    @Test
    public void shouldCorrectMultiplyTwoNumbers() {
        // given
        double a = 3;
        double b = 2;

        // when
        double result = calculator.multiply(a, b);

        // then
        Assert.assertEquals(6, result, 0.001);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenDividerIsZero() {
        // given
        double a = 3;
        double b = 0;

        // when
        calculator.divide(a, b);

    }
}
