package repeticao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double soma = 0;

        for (int i = 0; i < 4 ; i++) {
            System.out.println("Digite uma nota");
            double nota = entrada.nextDouble();
            soma += nota;
        }

        double media = soma / 4;

        if(media >= 6){
            System.out.println("Voce foi aprovado!");
        } else {
            System.out.println("Voce foi reprovado");
        }
    }
}
