package exercicios;

import java.util.Scanner;

public class TesteDeSelecao {
    public static void main(String[] args) {
        // Declarando variáveis
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();

        // Resolução do exercício
        if (b > c && d> a && c + d > a + b & c > 0 && d > 0 && a % 2 ==0){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }
    }
}
