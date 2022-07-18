package aula1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    @Test
    public void doisMaisDoisDaQuatro(){
        var calc = new Calculadora();
        assertEquals(4, calc.somar(2, 2));

    }
}
