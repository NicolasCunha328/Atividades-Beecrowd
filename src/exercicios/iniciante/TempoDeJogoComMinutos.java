package exercicios.iniciante;

import java.util.Scanner;

public class TempoDeJogoComMinutos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int h1 = entrada.nextInt();
        int m1 = entrada.nextInt();
        int h2 = entrada.nextInt();
        int m2 = entrada.nextInt();
        int mt1 = (h1*60) + m1;
        int mt2 = (h2*60) + m2;
        int h24 = (24*60);
        int resultado;
        if(mt2>mt1){
            resultado = mt2-mt1;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else if(mt1>mt2){
            resultado = (h24-mt1)+(mt2);
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
        }else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
        }

    }
}
