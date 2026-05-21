package Unidade6.Matrizes;

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] matriz1 = new int[3][3];
        int[][] matriz2 = new int[3][3];

        System.out.println("Matriz 1:");
        for (int lin = 0; lin < matriz1.length; lin++) {
            for (int col = 0; col < matriz1[lin].length; col++) {
                System.out.print("Valor linha[" + lin + "] e coluna[" + col + "]: ");
                int valorM1 = s.nextInt();
                matriz1[lin][col] = valorM1;
            }
        }

        System.out.println("Matriz 1:");
        for (int lin = 0; lin < matriz1.length; lin++) {
            for (int col = 0; col < matriz1[lin].length; col++) {
                System.out.print("[" + matriz1[lin][col] + "]\t");
            }
            System.out.println();
        }
    }
}
