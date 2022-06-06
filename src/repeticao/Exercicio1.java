package repeticao;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("Digite um nuemro: ");
            int numero = entrada.nextInt();

            if(numero > 0){
                System.out.println("Numero maior que zero");
            } else {
                System.out.println("Numero menor que zero");
            }
        }
    }
}
