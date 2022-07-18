package aula1;

import java.util.Random;

public class CalculadoraTeste {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        long inicio = System.currentTimeMillis();
        for(int i = 1; i<=5000; i++){
            int a = new Random().nextInt();
            int b = new Random().nextInt();
            long c = calc.somar(a, b);
            if(c != a + b){
                throw new RuntimeException("Soma esta com problema");
            }
        }
        long fim = System.currentTimeMillis();

        System.out.println("Tempo de execucao: " + (fim - inicio));

    }
}
