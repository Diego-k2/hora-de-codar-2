package condicionais;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Double> lista = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite um numero: ");
            double num = entrada.nextDouble();
            lista.add(num);
        }

    }
}
