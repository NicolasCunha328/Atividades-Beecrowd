package exercicios.iniciante;
import java.util.Scanner;

public class FormulaDeBhaskara {
    public static void main(String[] args) {
        // Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        double delta = Math.pow(b,2.0) - 4 * a * c;
        double x = (- b + Math.sqrt(delta)) / (2 * a);
        double y = (- b - Math.sqrt(delta)) / (2 * a);

        // Resolução do exercício
        if (a == 0 || delta < 0){
            System.out.println("Impossivel calcular");
        }else {
            System.out.printf("R1 = %.5f\n" , x);
            System.out.printf("R2 = %.5f" , y);
        }
    }
}
