package exercicios.iniciante;

import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner valor = new Scanner(System.in);
        int a = valor.nextInt(),
                b = valor.nextInt(),
                c = valor.nextInt();
        // Resolução do exercício
        if (a < b && a < c){
            System.out.println(a);
            if (b < c){
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b < c) {
            System.out.println(b);
            if (a < c){
                System.out.println(a);
                System.out.println(c);
            }else {
                System.out.println(c);
                System.out.println(a);
            }
        } else {
            System.out.println(c);
            if (a < b){
                System.out.println(a);
                System.out.println(b);
            }else {
                System.out.println(b);
                System.out.println(a);
            }
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
