package condicionais;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero de lados:");
        int numeroLados = entrada.nextInt();
        System.out.println("Digite o valor do lado");
        double medidaDoLado = entrada.nextDouble();
        if(numeroLados == 3){
            double calculo = medidaDoLado * 3;
            System.out.println("O poligono é um triangulo e seu perimetro é: " + calculo);
        } else if(numeroLados == 4){
            double calculo = medidaDoLado * medidaDoLado;
            System.out.println("O poligono é um quadrado e seu perimetro é: " + calculo);
        } else if(numeroLados == 5) {
            System.out.println("O poligono é um pentagono");
        } else if(numeroLados < 3) {
            System.out.println("NÃO É UM POLIGONO");
        } else{
            System.out.println("POLIGONO NAO IDENTIFICADO");
        }
    }
}
