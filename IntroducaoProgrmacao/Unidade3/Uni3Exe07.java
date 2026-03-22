package Unidade3;

import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Quantidade de 350ml: ");
        int q1 = s.nextInt();
        
        System.out.println("Quantidade de 600ml: ");
        int q2 = s.nextInt();

        System.out.println("Quantidade de 2L: ");
        int q3 = s.nextInt();

        System.out.println("O cliente comprou um total de " + (q1 * 0.35 + q2 * 0.6 + q3 * 2) +" litros");

        s.close();
    }
}
