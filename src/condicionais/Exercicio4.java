package condicionais;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaMaiores = 0;

        System.out.println("Digite um numero: ");
        double num1 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num2 = entrada.nextDouble();
        System.out.println("Digite um numero: ");
        double num3 = entrada.nextDouble();


        if(num1 > num2 || num1 > num3){
            somaMaiores += num1;
        }
        if(num2 > num1 || num2 > num3){
            somaMaiores += num2;
        }
        if(num3 > num2 || num3 > num1){
            somaMaiores += num3;
        }

        System.out.println("A soma dos dois maiores numeros são: " + somaMaiores);

    }
}
