package repeticao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        while(true){
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um numero: ");
            double num1 = entrada.nextDouble();
            System.out.println("Digite um numero: ");
            double num2 = entrada.nextDouble();
            System.out.println("Digite um numero: ");
            double num3 = entrada.nextDouble();


            if(num1 > num2 && num1 > num3){
                System.out.println("O maior numero é o : "  + num1);
            }
            if(num2 > num1 && num2 > num3){
                System.out.println("O maior numero é o : "  + num2);
            }
            if(num3 > num2 && num3 > num1){
                System.out.println("O maior numero é o : "  + num3);
            }
        }
    }
}
