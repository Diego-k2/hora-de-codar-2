package condicionais;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de gols marcados pelo Grêmio");
        int gremio = entrada.nextInt();
        System.out.println("Digite o numero de gols marcados pelo Inter");
        int inter = entrada.nextInt();

        if(gremio > inter){
            System.out.println("O Gremio foi o vencedor");
        } else if (inter > gremio) {
            System.out.println("O Inter foi o vencedor");
        } else {
            System.out.println("O jogo acabou empatado");
        }
    }
}
