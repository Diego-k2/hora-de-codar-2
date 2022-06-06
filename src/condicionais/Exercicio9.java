package condicionais;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;
        double numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numero = entrada.nextDouble();
            soma += numero;
        }

        System.out.println("A soma dos numeros é: " + soma);
    }
}
