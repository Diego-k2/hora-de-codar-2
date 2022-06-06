package condicionais;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de parcelas: ");
        int parcelas = entrada.nextInt();

        if(parcelas <= 15 && parcelas > 0) {
            double conta = 18230 / parcelas;
            System.out.println("O valor de cada parcela se divido em: " + parcelas + " vezes, fica igual a: R$" + conta);
        } else {
            System.out.println("O numero de parcelas que voce deseja é invalido");
        }
    }
}
