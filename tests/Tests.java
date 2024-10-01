import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class Tests {

    Random rand = new Random();

    @Test
    public void testAddition() {
        Addition addition = new Addition();
        int a = rand.nextInt(100);  // Random number between 0 and 99
        int b = rand.nextInt(100);
        assertEquals(a + b, addition.add(a, b), "Addition test failed for " + a + " + " + b);
    }

    @Test
    public void testSubtraction() {
        Subtraction subtraction = new Subtraction();
        int a = rand.nextInt(100);  // Random number between 0 and 99
        int b = rand.nextInt(100);
        assertEquals(a - b, subtraction.subtract(a, b), "Subtraction test failed for " + a + " - " + b);
    }

    @Test
    public void testMultiplication() {
        Multiplication multiplication = new Multiplication();
        int a = rand.nextInt(50);  // Keep the range smaller to avoid overflow
        int b = rand.nextInt(50);
        assertEquals(a * b, multiplication.multiply(a, b), "Multiplication test failed for " + a + " * " + b);
    }

    @Test
    public void testDivision() {
        Division division = new Division();
        int a = rand.nextInt(100);  // Random number between 0 and 99
        int b;
        do {
            b = rand.nextInt(100);  // Avoid division by zero
        } while (b == 0);
        assertEquals(a / b, division.divide(a, b), "Division test failed for " + a + " / " + b);
    }

    @Test
    public void testDivisionByZero() {
        Division division = new Division();
        int a = rand.nextInt(100);
        assertThrows(ArithmeticException.class, () -> division.divide(a, 0), "Division by zero should throw ArithmeticException");
    }
}
