package aula1.junit;

import aula1.Calculadora;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    //criaremos um metodo para cada cenario de teste
    @Test
    public void somaDoisPositivos(){
        Calculadora calc = new Calculadora();
        int soma = calc.somar(7, 3);
        Assert.assertEquals(10, soma);
    }
}
