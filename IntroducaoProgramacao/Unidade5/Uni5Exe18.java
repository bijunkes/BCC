package Unidade5;

import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c4 = 0;
        int c5 = 0;
        int c9 = 0;
        int c12 = 0;
        int qtdeC = 0;

        while(true) {
            System.out.print("Canal: ");
            int c = s.nextInt();

            if (c == 0) {
                break;
            }

            System.out.print("Pessoas Assistindo: ");
            int p = s.nextInt();

            if (c == 4) {
                c4 += p;
            } else if (c == 5) {
                c5 += p;
            } else if (c == 9) {
                c9 += p;
            } else if (c == 12) {
                c12 += p;
            } else {
                System.out.println("Canal inválido");
                continue;
            }

            qtdeC += p;
        }

        System.out.println("Percentual de audiência do canal 4: " + (c4 * 100f / qtdeC));
        System.out.println("Percentual de audiência do canal 5: " + (c5 * 100f / qtdeC));
        System.out.println("Percentual de audiência do canal 9: " + (c9 * 100f / qtdeC));
        System.out.println("Percentual de audiência do canal 12: " + (c12 * 100f / qtdeC));
        s.close();
    }
}
