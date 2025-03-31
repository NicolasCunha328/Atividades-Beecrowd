package exercicios.iniciante;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        // Definindo as variáveis
        Scanner leitura = new Scanner(System.in);
        double a = leitura.nextDouble();
        double b = leitura.nextDouble();
        double c = leitura.nextDouble();
        double soma = a + b + c;
        double area = (a + b) * c / 2;

        // Resolução do exercício
        if (a + b > c){
            System.out.println("Perimetro = " + soma);
        } else if (a + c > b) {
            System.out.println("Perimetro = " + soma);
        } else if (b + c > a) {
            System.out.println("Perimetro = " + soma);
        }else {
            System.out.println("Area = " + area);
        }
    }
}
