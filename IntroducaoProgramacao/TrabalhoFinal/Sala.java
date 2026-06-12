package TrabalhoFinal;

import java.util.Random;

public class Sala {
    int filas;
    int poltronas;
    boolean[][] mapa;
    float[] precos;
    String[] descPoltrona;
    Random random;

    Sala(int filas, int poltronas) {
        this.filas = filas;
        this.poltronas = poltronas;
        this.mapa = new boolean[filas][poltronas];
        this.random = new Random();
        this.precos = new float[filas];
        this.descPoltrona = new String[filas];

        this.iniciar_precos();
    }

    void preencher(int limite) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < poltronas; j++) {
                this.mapa[i][j] = false;
            }
        }

        int preenchidos = 0;

        while (preenchidos < limite && preenchidos < filas * poltronas) {
            int linha = random.nextInt(filas);
            int coluna = random.nextInt(poltronas);

            if (!this.mapa[linha][coluna]) {
                this.mapa[linha][coluna] = true;
                preenchidos++;
            }
        }
    }

    void exibir() {
        System.out.println("========= MAPA SESSÃO =========");
        System.out.print("   ");
        for (int i = 0; i < poltronas; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.print(i + "  ");

            for (int j = 0; j < poltronas; j++) {
                if (mapa[i][j]) {
                    System.out.print("#  ");
                } else {
                    System.out.print("-  ");
                }
            }

            System.out.println();
        }
        System.out.println("===============================\n");
    }

    boolean valdiar_poltrona(int fila, int poltrona) {
        if (fila < 0 || fila >= filas || poltrona < 0 || poltrona >= poltronas) {
            System.out.println("Fora dos limites.");
            return false;
        }
        if (mapa[fila][poltrona]) {
            System.out.println("Poltrona já vendida.");
            return false;
        }
        return true;
    }

    void comprar(int fila, int poltrona, int tipo, String confirmacao) {
        float precoIngresso = this.precos[fila];

        if (confirmacao.equalsIgnoreCase("S")) {
            System.out.println("Compra realizada.");
            this.mapa[fila][poltrona] = true;
        } else {
            System.out.println("Compra cancelada.");
        }
    }

    void iniciar_precos() {
        for (int i = 0; i < filas; i++) {
            if (i <= 1) {
                this.precos[i] = 15f;
                descPoltrona[i] = "Frente";
            } else if (i <= 7 && i >= 2) {
                this.precos[i] = 25f;
                descPoltrona[i] = "Meio";
            } else {
                this.precos[i] = 35f;
                descPoltrona[i] = "VIP";
            }
        }
    }

}
