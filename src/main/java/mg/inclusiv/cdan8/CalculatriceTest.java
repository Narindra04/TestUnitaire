package mg.inclusiv.cdan8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatriceTest {
    @Test
    public void testAddition() {
        assertEquals(3, Calculatrice.addition(1, 2));
        assertEquals(-5.1, Calculatrice.addition(-0.10, -5));
        assertEquals(-9.6, Calculatrice.addition(-10, 0.4));
        System.out.println("Test addition est OK");
    }

    @Test
    public void testSoustraction() {
        assertEquals(8, Calculatrice.soustraction(10, 2));
        assertEquals(-57, Calculatrice.soustraction(-55, 2));
        assertEquals(-4.5, Calculatrice.soustraction(0.50, 5));
        System.out.println("Test soustraction est OK");
    }

    @Test
    public void testMultiplication() {
        assertEquals(10, Calculatrice.multiplication(5, 2));
        assertEquals(-24, Calculatrice.multiplication(-12, 2));
        assertEquals(0, Calculatrice.multiplication(2.45, 0));
        System.out.println("Le teste de la multiplication est OK");
    }

    @Test
    public void testDivision() {
        assertEquals(5.225, Calculatrice.division(10.45, 2));
        assertEquals(-10, Calculatrice.division(-20, 2));
        assertEquals(0, Calculatrice.division(0, 2));
        try {
            Calculatrice.division(10,0);
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Diviseur ne peut pas etre 0", e.getMessage());
        }
        System.out.println("Test division est OK");
    }
}
