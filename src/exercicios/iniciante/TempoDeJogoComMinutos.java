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
        int horas = hf - hi;
        int minutos = mf - mi;

        // Resolução do exercício
        if (horas < 0){
            horas = 24 + (hf - hi);
        }
        if (minutos < 0){
            minutos = 60 + (mf - mi);
            horas--;
        }
        if (hi == hf && mi == mf){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }else {
            System.out.println("O JOGO DUROU " + horas + " HORA(S) E "+ minutos + " MINUTO(S)");
        }
    }
}
