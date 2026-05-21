package Unidade6.Matrizes;

import java.util.Scanner;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[][] matriz = new String[3][3];
        for (int lin = 0; lin < matriz.length; lin++) {
            for (int col = 0; col < matriz[lin].length; col++) {
                matriz[lin][col] = " ";
            }
        }

        int jogadas = 0;
        String jogadorAtual = "O";

        do {
            System.out.println("1 - Jogar");
            System.out.println("2 - Exibir tabuleiro");
            System.out.println("3 - Sair");

            int resposta = s.nextInt();

            switch (resposta) {
                case 1:
                    int linha = 0;
                    do {
                        System.out.print("Informe a linha [0, 1, 2]: ");
                        linha = s.nextInt();
                    } while (linha > 2 || linha < 0);

                    int coluna = 0;
                    do {
                        System.out.print("Informe a coluna [0, 1, 2]: ");
                        coluna = s.nextInt();
                    } while (coluna > 2 || coluna < 0);

                    if (jogadorAtual.equals("X")) {
                        jogadorAtual = "O";
                    } else {
                        jogadorAtual = "X";
                    }

                    if (matriz[linha][coluna] == " ") {
                        matriz[linha][coluna] = jogadorAtual;
                        jogadas++;
                    } else {
                        System.out.println("Posição preenchida");
                    }

                    break;

                case 2:
                    for (int lin = 0; lin < matriz.length; lin++) {
                        for (int col = 0; col < matriz[lin].length; col++) {
                            System.out.print("[" + matriz[lin][col] + "]");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    jogadas = 9;
                    break;

                default:
                    break;
            }

        } while (jogadas < 9);
        System.out.println("--- Jogo encerrado ---");

        s.close();
    }
}
