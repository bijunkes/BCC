package TrabalhoFinal;

import java.util.Random;

public class Sala {
    int filas;
    int poltronas;
    boolean[][] mapa;
    float[] precos;
    Random random;

    Sala(int filas, int poltronas) {
        this.filas = filas;
        this.poltronas = poltronas;
        this.mapa = new boolean[filas][poltronas];
        this.random = new Random();
        this.precos = new float[filas];
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
        System.out.println("========= MAPA SESSÃO =========\n");
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
    }

    void comprar(int fila, int poltrona, int tipo) {
        this.exibir();

        if (fila > filas || poltrona > poltrona) {
            System.out.println("Fora dos limites.");
        }

        else if (mapa[fila][poltrona]) {
            System.out.println("Poltrona já vendida.");
        } else {
            float preco;

            if (fila <= 1) {
                preco = 15f;
            } else if (fila >= 8) {
                preco = 35;
            } else {
                preco = 25;
            }

            if (tipo == 2) {
                preco /= 2;
            }

            mapa[fila][poltrona] = true;
        }
    }

    void iniciar_precos() {
        for (int i = 0; i < filas; i++) {
            
        }
    }

}
