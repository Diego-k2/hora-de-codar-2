package condicionais;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = entrada.nextDouble();

        if(num1 > num2){
            System.out.println("Primeiro é maior");
        } else if(num1 < num2){
            System.out.println("Segundo é maior");
        } else {
            System.out.println("Numeros iguais");
        }

    }
}
