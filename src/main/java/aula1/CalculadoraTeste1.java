package aula1;

public class CalculadoraTeste1 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        //isso aqui ja eh teste automatizado, mas sem o JUnit, mais chato de fazer pois voce precisa ficar vendo o console,
        // e o main vai ficar muito extenso conforme tu add mais funcionalidades
        int soma = calc.somar(3, 2);
        System.out.println(soma);


        soma = calc.somar(9, 0);
        System.out.println(soma);

        soma = calc.somar(0, 0);
        System.out.println(soma);

        soma = calc.somar(3, -1);
        System.out.println(soma);

    }
}
