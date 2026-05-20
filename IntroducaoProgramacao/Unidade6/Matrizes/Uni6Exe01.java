package Unidade6.Matrizes;

import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] valores = new int[4][4];
        int somaDiagonal = 0;

        for (int lin = 0; lin < valores.length; lin++) {
            for (int col = 0; col < valores[lin].length; col++) {
                System.out.print("Informe o valor da linha[" + lin + "] da coluna [" + col + "]: ");
                valores[lin][col] = s.nextInt();
            }
        }

        System.out.println("Valores da diagonal: ");
        for (int lin = 0; lin < valores.length; lin++) {
            for (int col = 0; col < valores[lin].length; col++) {
                if (lin == col) {
                    int valorDiagonal = valores[lin][col];
                    System.out.println(valorDiagonal);
                    somaDiagonal += valorDiagonal;
                }
            }
        }

        System.out.println("Soma dos valores da diagonal: " + somaDiagonal);

        s.close();
    }
}
