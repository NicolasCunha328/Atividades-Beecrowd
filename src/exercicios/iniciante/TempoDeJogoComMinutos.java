package exercicios.iniciante;

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner ler = new Scanner(System.in);
        int hi = ler.nextInt(),
                mi = ler.nextInt(),
                hf = ler.nextInt(),
                mf = ler.nextInt();
        int horas1 = 24 - (hi - hf);
        int horas2 = hf - hi;
        int min1 = (horas1 + mi + mf) * 60;
        int min2 = ((horas2 + mi + mf) * 60) / 60;

        // Resolução do exercício
        if (hi > hf){
            System.out.println((24 - (hi - hf)) + " HORA(S)");
            System.out.println(min1 + " MINUTO(S)");
        }else if (hf > hi){
            System.out.println((hf - hi) + " HORA(S)");
            System.out.println(min2+ " MINUTO(S)");
        }
    }
}
