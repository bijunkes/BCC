package TrabalhoFinal;

import java.util.Scanner;
import java.util.Random;

public class Sala {
    // Atributos
    int filas;
    int poltronas;
    Poltrona[][] mapa;
    float[] precosPorFila;

    float bilheteria;
    int ingressosVendidos;
    float taxaOcupacao;

    Random random;

    // Construtor
    Sala(int filas, int poltronas) {
        this.filas = filas;
        this.poltronas = poltronas;

        this.mapa = new Poltrona[this.filas][this.poltronas];
        this.random = new Random();

        // Inicializa vetor de preços e define o valor de cada posição
        this.precosPorFila = new float[10];
        for (int i = 0; i < 10; i++) {
            if (i <= 1) {
                this.precosPorFila[i] = 15f;
            } else if (i <= 7) {
                this.precosPorFila[i] = 25f;
            } else {
                this.precosPorFila[i] = 35f;
            }
        }

        // Inicializa matriz de poltronas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < poltronas; j++) {
                this.mapa[i][j] = new Poltrona(i, this.precosPorFila[i]);
            }
        }
    }

    // Método para preencher sala aleatoriamente de acordo com o parâmetro de limite
    void preencher(int limite) {
        int preenchidos = 0;

        while (preenchidos < limite && preenchidos < filas * poltronas) {
            int linha = random.nextInt(filas);
            int coluna = random.nextInt(poltronas);

            if (!mapa[linha][coluna].ocupado) {
                mapa[linha][coluna].ocupar();
                preenchidos++;
            }
        }
    }

    // Método para calcular taxa de ocupação da sala (poltronas preenchidas aleatoriamente + poltronas vendidas no totem)
    void calcularTaxaOcupacao() {
        int ocupadas = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < poltronas; j++) {
                if (mapa[i][j].ocupado) {
                    ocupadas++;
                }
            }
        }

        taxaOcupacao = ((float) ocupadas / (filas * poltronas)) * 100;
    }

    // Método para exibir mapa
    void exibirMapa() {
        System.out.println("\n========= MAPA SESSÃO =========");
        System.out.print("   ");
        for (int i = 0; i < poltronas; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < filas; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < poltronas; j++) {
                System.out.print(mapa[i][j].simbolo + "  ");
            }
            System.out.println();
        }
    }

    // Método para verificar limites da sala e se a poltrona está disponível
    boolean validarPoltrona(int fila, int poltrona) {
        if (fila < 0 || fila >= filas || poltrona < 0 || poltrona >= poltronas) {
            System.out.println("Poltrona inválida.");
            return false;
        }
        if (mapa[fila][poltrona].ocupado) {
            System.out.println("Poltrona já vendida.");
            return false;
        }
        return true;
    }

    // Método para comprar ingresso, recebe Scanner pois precisa da confirmação da compra
    void comprar(Scanner s) {
        if (salaLotada()) {
            return;
        }

        exibirMapa();

        System.out.print("\nFila: ");
        int fila = s.nextInt();
        System.out.print("Poltrona: ");
        int poltrona = s.nextInt();

        // Continua a compra somente se a poltrona for válida
        if (validarPoltrona(fila, poltrona)) {
            System.out.print("Tipo (1-Inteira / 2-Meia): ");
            int tipo = s.nextInt();

            Poltrona poltronaEscolhida = mapa[fila][poltrona];
            Ingresso ingresso = new Ingresso(poltronaEscolhida, tipo);

            System.out.print("Poltrona " + poltronaEscolhida.descricao + " (" + ingresso.tipo + "). Valor: R$ "
                    + ingresso.precoFinal + " Confirma? (S/N): ");
            String confirmacao = s.next();

            if (confirmacao.equalsIgnoreCase("S")) {
                System.out.println("Compra realizada! Bom filme :)");
                mapa[fila][poltrona].ocupar();

                bilheteria += ingresso.precoFinal;
                ingressosVendidos++;
                calcularTaxaOcupacao();
            } else {
                System.out.println("Compra cancelada.");
            }
        }
    }

    // Método que retorna true ou false de acordo com a taxa de ocupação
    boolean salaLotada() {
        return taxaOcupacao >= 100;
    }

    // Método para exibir resumo da sessão
    void exibirResumo() {
        System.out.println("\n====== RESUMO DA SESSÃO =======");
        System.out.printf("Bilheteria: R$ %.2f\n", bilheteria);
        System.out.println("Ingressos vendidos: " + ingressosVendidos);
        System.out.printf("Ocupação: %.0f%%\n", taxaOcupacao);

        System.out.print("Classificação: ");
        if (taxaOcupacao >= 90) {
            System.out.println("Sessão Esgotada - Sucesso de Bilheteria!");
        } else if (taxaOcupacao >= 70) {
            System.out.println("Casa Cheia");
        } else if (taxaOcupacao >= 40) {
            System.out.println("Sessão Mediana");
        } else {
            System.out.println("Sala Vazia - precisa divulgar mais");
        }
    }

}
