package condicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        List<Double> numero = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite um numero: ");
            numero.add(entrada.nextDouble());
        }

        for (double num: numero) {
            if(num < 72){
                soma += num;
            }
        }

        System.out.println("A soma foi: " + soma);
        System.out.println("Os numeros foram: " + numero);

    }
}
