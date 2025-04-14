package exercicios.iniciante;

import java.util.Scanner;

public class SequenciaDeNumerosESoma {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        int m = ler.nextInt(),
                n = ler.nextInt();
        int soma = 0;

        //Resolução do exercício
        while (m > 0 && n > 0){
            if (m > n){
                for (int i = n; i <= m; i++) {
                    soma += i;
                    System.out.println(i + " ");
                }
            }else {
                for (int i = m; i <= n; i++) {
                    soma += i;
                    System.out.println(i + " ");
                }
            }
            System.out.println("Sum=" + soma);
            m = ler.nextInt();
            n = ler.nextInt();
            soma = 0;
        }
    }
}
