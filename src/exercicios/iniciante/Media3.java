package exercicios.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        // Declarando variáveis
        Scanner nota = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double n1 = nota.nextDouble(),
                n2 = nota.nextDouble(),
                n3 = nota.nextDouble(),
                n4 = nota.nextDouble();
        double media = ((n1*2) + (n2*3) + (n3*4) + (n4)) / 10;
        // Resolução do exercício
        System.out.println("Média: " + df.format(media));
        if (media >= 7.0){
            System.out.println("Aluno aprovado");
        } else if (media < 5.0) {
            System.out.println("Aluno em exame");
            double exame = nota.nextDouble();
            System.out.println("Nota do exame: " + df.format(exame));
            media = (media + exame) / 2;
            if (media >= 5){

            }
        }

    }
}
