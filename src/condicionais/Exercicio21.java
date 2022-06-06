package condicionais;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor da primeira nota:");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite o valor da segunda nota:");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite o valor da optativa:");
        var optativa = entrada.nextDouble();

        if(optativa != 0) {
            if(nota1 < optativa) {
                nota1 = optativa;
            } else if (nota2 < optativa){
                nota2 = optativa;
            }
        }
        var media = (nota1 + nota2)/2;

        if(media >= 6.0){
            System.out.println("APROVADO !!!");
            System.out.println("Sua média final foi: " + media);
        } else if (media >= 3.0 && media < 6.0){
            System.out.println("EXAME");
            System.out.println("Sua média final foi: " + media);
        } else {
            System.out.println("REPROVADO");
            System.out.println("Sua média final foi: " + media);
        }
    }
}
