package exercicios.iniciante;

import java.util.Scanner;

public class ConversaoDeTempo {
    public static void main(String[] args) {
        // Declaração de variáveis.
        Scanner seg = new Scanner(System.in);
        int s = seg.nextInt();
        int h = s / 3600;
        s = s % 3600;
        int m = s / 60;
        s = s % 60;

        // Resoluçao do exercicio.
        System.out.println( h + " : " + m + " : " + s );
    }
}
