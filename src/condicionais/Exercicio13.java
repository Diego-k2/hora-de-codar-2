package condicionais;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite uma nota: ");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if(media >= 6.0) {
            System.out.println("Parabens voce foi aprovado.");
        } else {
            System.out.println("Infelizmente voce foi reprovado.");
        }


    }
}
