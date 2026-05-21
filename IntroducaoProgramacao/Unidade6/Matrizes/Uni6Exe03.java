package Unidade6.Matrizes;

import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];

        System.out.println("----- Valores matriz 1 -----");
        for (int lin = 0; lin < matriz1.length; lin++) {
            for (int col = 0; col < matriz1[lin].length; col++) {
                System.out.print("Valor linha[" + lin + "] e coluna[" + col + "]: ");
                int valorM1 = s.nextInt();
                matriz1[lin][col] = valorM1;
            }
        }

        System.out.println("----- Valores matriz 2 -----");
        for (int lin = 0; lin < matriz2.length; lin++) {
            for (int col = 0; col < matriz2[lin].length; col++) {
                System.out.print("Valor linha[" + lin + "] e coluna[" + col + "]: ");
                int valorM2 = s.nextInt();
                matriz2[lin][col] = valorM2;
            }
        }

        int matrizMulti[][] = new int[3][3];

        for (int lin = 0; lin < matrizMulti.length; lin++) {
            for (int col = 0; col < matrizMulti[lin].length; col++) {
                for (int i = 0; i < matrizMulti.length; i++) {
                    matrizMulti[lin][col] += matriz1[lin][i] * matriz2[i][col];
                }
            }
        }

        System.out.println("----- Multiplicação das matrizes -----");
        for (int lin = 0; lin < matrizMulti.length; lin++) {
            for (int col = 0; col < matrizMulti[lin].length; col++) {
                System.err.print(matrizMulti[lin][col] + "\t");
            }
            System.out.println();
        }

        s.close();
    }
}
