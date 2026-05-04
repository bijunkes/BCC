package Unidade5;

import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcao;
        int contasEncerradas = 0;

        do {
            System.out.println("\n(1) Encerrar conta");
            System.out.println("(2) Ver número de contas encerradas");
            System.out.println("(3) Sair");

            System.out.print("Opção: ");
            opcao = s.nextInt();

            if (opcao == 1) {
                s.nextLine();
                
                System.out.print("Nome do hóspede: ");
                String nome = s.nextLine();

                System.out.print("Número de diárias: ");
                int diarias = s.nextInt();

                double taxa;

                if (diarias < 15) {
                    taxa = 7.5;
                } else if (diarias == 15) {
                    taxa = 6.5;
                } else {
                    taxa = 5.0;
                }
                double total = diarias * (50 + taxa);

                System.out.println("Hóspede: " + nome);
                System.out.println("Total a pagar: R$ " + total);

                contasEncerradas++;

            } else if (opcao == 2) {
                System.out.println("Contas encerradas: " + contasEncerradas);

            } else if (opcao == 3) {
                
            } else {
                System.out.println("Opção inválida");
            }

        } while(opcao != 3);

        s.close();
    }
}
