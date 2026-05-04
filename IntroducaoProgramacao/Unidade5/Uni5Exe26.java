package Unidade5;

import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Valor máximo de pedágio: ");
        double limite = s.nextDouble();

        int acimaLimite = 0;
        int totalTrechos = 0;
        int longosAceitos = 0;

        while (true) {
            System.out.print("Pedágio: ");
            double pedagio = s.nextDouble();

            if (pedagio < 0) {
                break;
            }

            System.out.print("Distância (km): ");
            double distancia = s.nextDouble();

            totalTrechos++;

            if (pedagio > limite) {
                acimaLimite++;
            }

            if (distancia > 150 && pedagio <= limite) {
                longosAceitos++;
            }
        }

        System.out.println(acimaLimite + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(totalTrechos + " (quantidade de trechos informados)");
        System.out.println(longosAceitos + " (trechos acima de 150km com valor aceito por ele)");
        s.close();
    }
}
