package condicionais;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tamanhoPista = entrada.nextDouble();
        double numeroVoltas = entrada.nextDouble();
        double reabastecimento = entrada.nextDouble();
        double consumoCarro = entrada.nextDouble();

        double conversãoKm = (tamanhoPista * numeroVoltas) / 1000;
        double minimoLitros = (conversãoKm / reabastecimento) / consumoCarro;
        double totalLitros = conversãoKm * consumoCarro;

        System.out.println("O minimo de litros para a primeira parada é: " + minimoLitros);
        System.out.println("O tamanho da pista: " + conversãoKm + "Km");
        System.out.println("O total de litros é de: " + totalLitros);

    }
}
