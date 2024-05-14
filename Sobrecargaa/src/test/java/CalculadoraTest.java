import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.AssertJUnit.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class CalculadoraTest {

    @Test
    public void testSomaIntInt() {
        Calculadora calc = new Calculadora();
        AssertJUnit.assertEquals(5, calc.soma(2, 3));
    }

    @Test
    public void testSomaIntIntInt() {
        Calculadora calc = new Calculadora();
        AssertJUnit.assertEquals(6, calc.soma(1, 2, 3));
    }

    @Test
    public void testSomaDoubleDouble() {
        Calculadora calc = new Calculadora();
        AssertJUnit.assertEquals(6.0, calc.soma(2.5, 3.5), 0.0001);
    }
}
