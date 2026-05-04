package Unidade5;

import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int soma = 0;
        String opcao = "s";

        System.out.println("Limite diário (kg):");
        int limite = s.nextInt();
        int limiteGramas = limite * 1000;

        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Peso peixe (g): ");
            int peso = s.nextInt();
            soma += peso;

            if (soma > limiteGramas) {
                System.out.println("Limite excedido");
                break;
            }

            System.out.print("Deseja informar o peso de mais um peixe (s/n)? ");
            opcao = s.next();
        }

        s.close();
    }
}
