package exercicios.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double salario = ler.nextDouble();

        //Resolução do exercício
        if (salario >= 0.00 && salario <= 2000.00){
            System.out.println("Isento");
        } else if (salario > 2000.00 && salario <= 3000.00) {
            double idp = salario - 2000.00;
            idp = idp *0.08;
            System.out.println("R$ " + df.format(idp));
        } else if (salario > 3000.00 && salario <= 4500.00) {
            salario = salario - 3000.00;
            double idp = salario * 0.18;
            idp = idp + (1000.00 * 0.08);
            System.out.println("R$ " + df.format(idp));
        } else if (salario > 4500.00) {
            salario = salario - 4500.00;
            double idp = salario * 0.28;
            idp = idp + (1500.00 * 0.18) + (1000.00 * 0.08);
            System.out.println("R$ " + df.format(idp));
        }
    }
}
