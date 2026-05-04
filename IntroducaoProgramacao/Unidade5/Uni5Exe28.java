package Unidade5;

import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int g1 = 0, g2 = 0, g3 = 0, g4 = 0, total = 0;

        String opcao = "s";

        while (opcao.equalsIgnoreCase("s")) {
            System.out.println("Vote no conjunto: (1, 2, 3, 4)");
            System.out.print("Código: ");

            int voto = s.nextInt();

            if (voto == 1) {
                g1++;
            } else if (voto == 2) {
                g2++;
            } else if (voto == 3) {
                g3++;
            } else if (voto == 4) {
                g4++;
            } else {
                System.out.println("Inválido");
                continue;
            }

            total++;

            System.out.print("Mais um voto (s/n)? ");
            opcao = s.next();
        }

        if (total > 0) {
            double p1 = g1 * 100.0 / total;
            double p2 = g2 * 100.0 / total;
            double p3 = g3 * 100.0 / total;
            double p4 = g4 * 100.0 / total;

            System.out.println("Resultado");
            System.out.println("Nenhum de Nós: " + g1 + " votos (" + p1 + "%)");
            System.out.println("CPM22: " + g2 + " votos (" + p2 + "%)");
            System.out.println("Skank: " + g3 + " votos (" + p3 + "%)");
            System.out.println("Jota Quest: " + g4 + " votos (" + p4 + "%)");

            int maior = g1;
            String vencedor = "Nenhum de Nós";

            if (g2 > maior) {
                maior = g2;
                vencedor = "CPM22";
            }
            if (g3 > maior) {
                maior = g3;
                vencedor = "Skank";
            }
            if (g4 > maior) {
                vencedor = "Jota Quest";
            }

            System.out.println("Vencedor: " + vencedor);
        }

        s.close();
    }
}
