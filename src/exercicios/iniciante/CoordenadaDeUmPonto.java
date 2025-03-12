package exercicios.iniciante;

import java.util.Scanner;

public class CoordenadaDeUmPonto {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner cd = new Scanner(System.in);
        double x = cd.nextDouble(),
                y = cd.nextDouble();
        // Resolução do exercício
        if (x == 0 && y == 0){
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (y > 0 && x > 0){
            System.out.println("Q1");
        } else if (y > 0 && x < 0) {
            System.out.println("Q2");
        } else if (y < 0 && x < 0) {
            System.out.println("Q3");
        } else if (y < 0 && x > 0) {
            System.out.println("Q4");
        }
    }
}
