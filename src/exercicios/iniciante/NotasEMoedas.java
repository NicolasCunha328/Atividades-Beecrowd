package exercicios.iniciante;

import java.util.Scanner;

public class NotasEMoedas {
    public static void main(String[] args) {
        // Declaração de variáveis.
        Scanner dinheiro = new Scanner(System.in);
        double n = dinheiro.nextDouble();

        // Resoluçao do exercicio.
        System.out.println("NOTAS:");

        System.out.println((int) (n / 100)+" nota(s) de R$ 100.00");
        n = n % 100;
        System.out.println((int) (n / 50)+" nota(s) de R$ 50.00");
        n = n % 50;
        System.out.println((int) (n / 20)+" nota(s) de R$ 20.00");
        n = n % 20;
        System.out.println((int) (n / 10)+" nota(s) de R$ 10.00");
        n = n % 10;
        System.out.println((int) (n / 5)+" nota(s) de R$ 5.00");
        n = n % 5;
        System.out.println((int) (n / 2)+" nota(s) de R$ 2.00");
        n = n % 2;

        System.out.println("MOEDAS:");

        n = n * 100;
        System.out.println((int) (n / 100)+" moeda(s) de R$ 1.00");
        n = n % 100;
        System.out.println((int) (n / 50)+" moeda(s) de R$ 0.50");
        n = n % 50;
        System.out.println((int) (n / 25)+" moeda(s) de R$ 0.25");
        n = n % 25;
        System.out.println((int) (n / 10)+" moeda(s) de R$ 0.10");
        n = n % 10;
        System.out.println((int) (n / 5)+" moeda(s) de R$ 0.05");
        n = n % 5;
        System.out.println( (int) n+" moeda(s) de R$ 0.01");


    }
}
