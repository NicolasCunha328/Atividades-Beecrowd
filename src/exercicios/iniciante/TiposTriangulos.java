package exercicios.iniciante;

import java.util.Scanner;

public class TiposTriangulos {
    public static void main(String[] args) {
        // Area de delcaração de variáveis.
        double a, b, c;
        double aux, a2, bc;
        Scanner sc = new Scanner(System.in);

        // Area para entrada de dados.
        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        // Verificar se 'a' é o maior dos elementos.
        if (b > a){
            aux = a;
            a = b;
            b = aux;
        }
        if (c > a){
            aux = a;
            a = c;
            c = aux;
        }

        a2 = Math.pow(a, 2);
        bc = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c){
            System.out.println("NÃO FORMA TRIANGULO");
        } else {
            // Pode formar algum triângulo.

            if (a2 > bc){
                System.out.println("TRIÂNGULO OBTUSANGULO");
            } else if (a2 < bc) {
                System.out.println("TRIÂNGULO ACUTANGULO");
            } else {
                System.out.println("TRIÂNGULO RETÂNGULO");
            }

            // Verificar as arestas.

            if (a == b && a == c){
                System.out.println("TRIÂNGULO EQUILATERO");
            } else if (a == b || a == c || b == c) {
                System.out.println("TRIÂNGULO ISOSCELES");
            }
        }
    }
}