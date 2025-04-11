package exercicios.iniciante;

import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        //Declaração de variáveis
        Scanner ler = new Scanner(System.in);
        String animal1 = ler.nextLine();

        //Resolução do exercício
        if (animal1.equalsIgnoreCase("vertebrado")){
            String animal2 = ler.nextLine();
            if (animal2.equalsIgnoreCase("ave")){
                String animal3 = ler.nextLine();
                if (animal3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                } else if (animal3.equalsIgnoreCase("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (animal2.equalsIgnoreCase("mamifero")) {
                String animal3 = ler.nextLine();
                if (animal3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                } else if (animal3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if (animal1.equalsIgnoreCase("invertebrado")) {
            String animal2 = ler.nextLine();
            if (animal2.equalsIgnoreCase("inseto")){
                String animal3 = ler.nextLine();
                if (animal3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                } else if (animal3.equalsIgnoreCase("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (animal2.equalsIgnoreCase("anelideo")) {
                String animal3 = ler.nextLine();
                if (animal3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                } else if (animal3.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}
