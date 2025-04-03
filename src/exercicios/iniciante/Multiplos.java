package exercicios.iniciante;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt(),
                b = ler.nextInt();

        //Resolução do exercício
        if (a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
