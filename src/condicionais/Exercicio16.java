package condicionais;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de maças: ");
        double  quantidadeMacas = entrada.nextDouble();
        double  valorTotal = 0;


        if(quantidadeMacas < 12) {
            valorTotal = quantidadeMacas * 0.30;
        } else if(quantidadeMacas >= 12){
            valorTotal = quantidadeMacas * 0.25;
        }

        System.out.println("O valor total foi de: " + valorTotal);
    }
}
