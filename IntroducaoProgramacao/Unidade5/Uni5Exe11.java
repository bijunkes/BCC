package Unidade5;

import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantidade de dias: ");
        int dias = s.nextInt();

        int totalGeral = 0;

        for(int d = 1; d <= dias; d++) {
            int quebradosHora = 1;
            int totalDia = 0;

            for(int h = 1; h <= 16; h++){
                if (h == 1){
                    quebradosHora = 1;
                } else if (h == 2){
                    quebradosHora = 3;
                } else {
                    quebradosHora *= 3;
                }

                totalDia += quebradosHora;
            }

            totalGeral += totalDia;
        }

        System.out.println("Quantidade de biscoitos quebrados em " + dias + " dias: " + totalGeral);

        s.close();
    }
}
