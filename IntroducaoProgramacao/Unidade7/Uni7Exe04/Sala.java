package Unidade7.Uni7Exe04;

import Unidade4.Beecrowd.a;

public class Sala {
    int numero;
    boolean[][] assentos;

    Sala(int numero) {
        this.numero = numero;
        assentos = new boolean[4][6];
    }

    void exibirMapa() {
        System.out.println("Sala " + numero);

        char fileira = 'A';

        System.out.print("   ");
        for (int i = 1; i <= 6; i++) {
            System.out.print(i + "   ");
        }
        System.out.println();

        for (int lin = 0; lin < assentos.length; lin++) {
            System.out.print(fileira + " ");

            for (int col = 0; col < assentos[lin].length; col++) {
                if (assentos[lin][col]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }

            System.out.println();
            fileira++;
        }

        percentualOcupado();
    }

    void reservar(int fileira, int coluna) {
        if (assentos[fileira][coluna]) {
            System.out.println("Assento já ocupado!");
        } else {
            assentos[fileira][coluna] = true;
            System.out.println("Reserva confirmada!");
        }
    }

    void cancelar(int fileira, int coluna) {
        assentos[fileira][coluna] = false;
        System.out.println("Reserva cancelada!");
    }

    void percentualOcupado() {
        int somaOcupados = 0;
        for (int lin = 0; lin < assentos.length; lin++) {
            for (int col = 0; col < assentos[lin].length; col++) {
                if (assentos[lin][col]) {
                    somaOcupados += 1;
                }
            }
        }
        double ocupacao = (somaOcupados * 100.0) / 24;
        System.out.println("Ocupação: " + ocupacao + "%");
    }
}
