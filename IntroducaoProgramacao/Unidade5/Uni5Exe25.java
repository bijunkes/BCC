package Unidade5;

import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int pontosD = 0;
        int pontosE = 0;

        while(true) {
            System.out.print("Pontos (D/E): ");
            String jogada = s.next();

            if (jogada.equalsIgnoreCase("d")) {
                pontosD++;
            } else if (jogada.equalsIgnoreCase("e")) {
                pontosE++;
            } else {
                System.out.println("Inválido");
                continue;
            }

            System.out.println("Placar: D = " + pontosD + " E = " + pontosE);

            if ((pontosD >= 21 || pontosE >= 21) && (pontosD - pontosE >= 2 || pontosE - pontosD >= 2)) {
                break;
            }
        }

        s.close();
    }
}
