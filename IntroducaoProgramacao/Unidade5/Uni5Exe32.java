package Unidade5;

import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Dia da semana do dia 1: ");
        int p = s.nextInt();

        System.out.print("Número de dias do mês: ");
        int n = s.nextInt();

        System.out.println("D S T Q Q S S");

        int coluna = 1;
        while(coluna < p){
            System.out.print(" ");
            coluna++;
        }

        int dia = 1;
        while(dia <= n){
            System.out.print(dia + " ");

            if (coluna % 7 == 0) {
                System.out.println();
            }
            dia++;
            coluna++;
        }

        s.close();
    }
}