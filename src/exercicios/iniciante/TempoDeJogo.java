package exercicios.iniciante;

import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        // Declaração das variáveis
        Scanner ler = new Scanner(System.in);
        int hi = ler.nextInt();
        int hf = ler.nextInt();

        // Resolução do exercício
        if (hi > hf){
            System.out.println("O JOGO DUROU " + (24 - (hi - hf)) + " HORA(S)");
        }else if (hf > hi){
            System.out.println("O JOGO DUROU " + (hf - hi) + " HORA(S)");
        }else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}
