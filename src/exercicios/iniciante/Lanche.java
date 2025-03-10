package exercicios.iniciante;

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        // Declarando variáveis
        Scanner leitura = new Scanner(System.in);
        int cod = leitura.nextInt();
        int qntd = leitura.nextInt();
        double cq = 4;
        double xs = 4.5;
        double xb = 5;
        double ts = 2;
        double r = 1.5;
        double resolucao = switch (cod) {
            case 1 -> qntd * cq;
            case 2 -> qntd * xs;
            case 3 -> qntd * xb;
            case 4 -> qntd * ts;
            case 5 -> qntd * r;
            default -> 0;
        };
        // Resolução do exercício
        System.out.printf("Total: R$ %.2f", resolucao);

        /*
         if (cod == 1){
            resolucao = qntd * cq;
            System.out.printf("Total: R$ %.2f", resolucao);
        } else if (cod == 2) {
            resolucao = qntd * xs;
            System.out.printf("Total: R$ %.2f", resolucao);
        } else if (cod == 3) {
            resolucao = qntd * xb;
            System.out.printf("Total: R$ %.2f", resolucao);
        } else if (cod == 4) {
            resolucao = qntd * ts;
            System.out.printf("Total: R$ %.2f", resolucao);
        } else if (cod == 5) {
            resolucao = qntd * r;
            System.out.printf("Total: R$ %.2f", resolucao);
        }else {
            System.out.println("Código Inválido!!");
        }
         */
    }
}
