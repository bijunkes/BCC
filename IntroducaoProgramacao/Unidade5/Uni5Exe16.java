package Unidade5;

import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int totalg = 0;
        int totalf = 0;
        float totalG = 0;
        float totalF = 0;

        while(true) {
            System.out.print("Altura: ");
            float a = s.nextFloat();

            if (a == 0) {
                break;
            }

            System.out.print("Genero: ");
            String g = s.next();

            totalG += a;

            if (g.equalsIgnoreCase("f")) {
                totalF += a;
                totalf++;
            }

            totalg++;
        }

        System.out.println("A média de altura das mulheres: " + totalF / totalf);
        System.out.println("A média de altura do grupo é: " + totalG / totalg);

        s.close();
    }
}
