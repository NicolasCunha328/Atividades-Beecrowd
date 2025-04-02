package exercicios.iniciante;

import java.util.Scanner;

public class Tomadas {
    public static void main(String[] args) {
        /*
            Como estão em um único quarto eles terão somente 1 tomada
            Cada membro tem 1 régua, totalizando 4 réguas
         */
        Scanner leitura = new Scanner(System.in);
        int t1 = leitura.nextInt(),
                t2 = leitura.nextInt(),
                t3 = leitura.nextInt(),
                t4 = leitura.nextInt();
        int st1 = t1 - 1,
                st2 = t2 - 1,
                st3 = t3 - 1,
                soma = st1 + st2 + st3 + t4;

        if (2 <= t1 && 2 <= t2 && 2 <= t3 && 2 <= t4 && 6 >= t1 && 6 >= t2 && 6 >= t3 && 6 >= t4) {
            System.out.println(soma);
        }
    }
}
