package exercicios.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = ler.nextDouble();

        // Resolução do exercício
        if (salario >= 0 && salario <= 400){
            double aumento = salario * 0.15;
            double ns = aumento + salario;
            System.out.printf("Novo salario: " + df.format(ns));
            System.out.printf("\nReajuste ganho: " + df.format(aumento));
            System.out.println("\nEm percentual: 15 %");
        } else if (salario > 400 && salario <= 800) {
            double aumento = salario * 0.12;
            double ns = aumento + salario;
            System.out.printf("Novo salario: " + df.format(ns));
            System.out.printf("\nReajuste ganho: " + df.format(aumento));
            System.out.println("\nEm percentual: 12 %");
        } else if (salario > 800 && salario <= 1200) {
            double aumento = salario * 0.1;
            double ns = aumento + salario;
            System.out.printf("Novo salario: " + df.format(ns));
            System.out.printf("\nReajuste ganho: " + df.format(aumento));
            System.out.println("\nEm percentual: 10 %");
        } else if (salario > 1200 && salario <= 2000) {
            double aumento = salario * 0.07;
            double ns = aumento + salario;
            System.out.printf("Novo salario: " + df.format(ns));
            System.out.printf("\nReajuste ganho: " + df.format(aumento));
            System.out.println("\nEm percentual: 7 %");
        }else {
            double aumento = salario * 0.04;
            double ns = aumento + salario;
            System.out.printf("Novo salario: " + df.format(ns));
            System.out.printf("\nReajuste ganho: " + df.format(aumento));
            System.out.println("\nEm percentual: 4 %");
        }
    }
}
