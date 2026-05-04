package Unidade5;

import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcao = 1;

        int maiorProducao = 0;
        int diaMaiorProducao = 0;

        int totalManha = 0;
        int totalTarde = 0;

        while(opcao == 1) {
            int dia;
            do {
                System.out.print("Dia: ");
                dia = s.nextInt();

                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido");
                }
            } while(dia < 1 || dia > 30);

            System.out.print("Manhã: ");
            int manha = s.nextInt();

            System.out.print("Tarde: ");
            int tarde = s.nextInt();

            int total = manha + tarde;

            totalManha += manha;
            totalTarde += tarde;

            if (total > maiorProducao) {
                maiorProducao = total;
                diaMaiorProducao = dia;
            }

            double valor;

            if (dia <= 15) {
                if (total > 100 && manha >= 30 && tarde >= 30) {
                    valor = total * 0.8;
                } else {
                    valor = total * 0.5;
                }
            } else {
                valor = manha * 0.4 + tarde * 0.3;
            }

            System.out.println("R$ " + valor + " (valor recebido)");
            System.out.print("Novo funcionário (1.sim 2.não)? ");
            opcao = s.nextInt();
        }

        System.out.println("Dia de maior produção: " + diaMaiorProducao);

        if (totalManha > totalTarde) {
            System.out.println("Maior produção: Manhã com " + totalManha + " peças");
        } else {
            System.out.println("Maior produção: Tarde com " + totalTarde + " peças");
        }

        s.close();
    }
}
