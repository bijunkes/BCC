package Unidade5;

import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Nome: ");
            String nome = s.next();
            System.out.print("Nota 1: ");

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            int n1 = s.nextInt();
            System.out.print("Nota 2:");
            int n2 = s.nextInt();

            int media = (n1 + n2) / 2;
            System.out.println("A média de " + nome + " é " + media);
        }

        s.close();
    }
}
