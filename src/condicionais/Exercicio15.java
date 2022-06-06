package condicionais;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = entrada.nextInt();
        int verificarIdade = 2022 - anoNascimento;

        if(verificarIdade >= 16 && verificarIdade < 18){
            System.out.println("Voce pode votar porem nao e obrigatorio");
        } else if(verificarIdade >= 18) {
            System.out.println("Voce pode votar e e obrigatorio");
        } else {
            System.out.println("Voce nao pode votar");
        }
    }
}
