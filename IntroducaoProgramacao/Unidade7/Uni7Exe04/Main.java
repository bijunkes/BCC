package Unidade7.Uni7Exe04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Sala salas[] = new Sala[5];

        for (int i = 0; i < salas.length; i++) {
            salas[i] = new Sala(i + 1);
        }

        int opcao;

        System.out
                .println("=== CINEMA ===\n1 - Ver mapa de sala\n2 - Reservar assento\n3 - Cancelar reserva\n0 - Sair");

        do {
            System.out.print("\nOpção: ");
            opcao = s.nextInt();

            int sala = 0;
            int fileira = 0;
            int coluna = 0;
            char letra = ' ';

            System.out.print("Sala (1-5): ");
            sala = s.nextInt();

            if (sala > 5 || sala < 1) {
                System.out.println("Sala inválida");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("=== SALA " + sala + " ===");
                    salas[sala - 1].exibirMapa();
                    break;

                case 2:
                    System.out.print("Fileria (A-D): ");
                    letra = Character.toUpperCase(s.next().charAt(0));
                    fileira = letra - 'A';

                    System.out.print("Coluna (1-6): ");
                    coluna = s.nextInt();

                    salas[sala - 1].reservar(fileira, coluna - 1);
                    break;

                case 3:
                    System.out.print("Fileria (A-D): ");
                    letra = Character.toUpperCase(s.next().charAt(0));
                    fileira = letra - 'A';

                    System.out.print("Coluna (1-6): ");
                    coluna = s.nextInt();

                    salas[sala - 1].cancelar(fileira, coluna - 1);
                    break;

                default:
                    break;
            }
        } while (opcao != 0);

        s.close();
    }
}
