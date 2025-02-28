package exercicios;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        // Declaração de variáveis.
        Scanner idade = new Scanner(System.in);
        int n = idade.nextInt();
        int a = n / 365;
        n = n % 365;
        int m = n / 30;
        int d = n % 30;

        // Resoluçao do exercicio.
        System.out.println(a + " ano (s)");
        System.out.println(m + " mes (es)");
        System.out.println(d + " dia (s)");
    }
}
