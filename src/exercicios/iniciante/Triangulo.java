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
        // 1- tem que ter duas etapas, a primeira é se os numeros reais de A B e C forme ou nao um triangulo
        // 2- a segunda etapa é que se eles forma um triangulo dai sim calcula o perimetro do triangulo
        //em caso der negativo para um triangulo significa dizer que ele naverdade forma um "trapezio"
        // 3- aparti disso a gente tem que fazer outra sequecia de linhas para fazer o calculo da area do trapezio
        //tendo a base do trapezio como A e B, e C como a altura

        //descobrindo se é ou nao um triangulo
        // Resolução do exercício
        if (a + b > c && a + c > b && b + c > a){ // Forma Triângulo
            System.out.println("Perimetro = " + soma);
        }else { // Não forma Triângulo
            System.out.println("Area = " + area);
        }
    }
}
