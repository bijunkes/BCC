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
        String jogadorAtual = "X";
        boolean velha = false;
        boolean venceu = false;

        do {
            System.out.println("1 - Jogar");
            System.out.println("2 - Exibir tabuleiro");
            System.out.println("3 - Sair");

            int resposta = s.nextInt();

            switch (resposta) {
                case 1:

                    // Ler valores
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

                    // Verificar posição
                    boolean preencheu = false;
                    do {
                        if (matriz[linha][coluna] == " ") {
                            matriz[linha][coluna] = jogadorAtual;
                            jogadas++;
                            preencheu = true;
                            if (jogadorAtual.equals("X")) {
                                jogadorAtual = "O";
                            } else {
                                jogadorAtual = "X";
                            }
                        } else {
                            System.out.println("Posição preenchida");
                            
                            System.out.print("Informe a linha: ");
                            linha = s.nextInt();

                            System.out.print("Informe a coluna: ");
                            coluna = s.nextInt();
                        }
                    } while (preencheu == false);

                    // Vitória
                    for (int lin = 0; lin < matriz.length; lin++) {
                        if (!matriz[lin][0].equals(" ") && matriz[lin][0].equals(matriz[lin][1])
                                && matriz[lin][1].equals(matriz[lin][2])) {
                            venceu = true;
                        }
                    }
                    for (int col = 0; col < matriz.length; col++) {
                        if (!matriz[0][col].equals(" ") && matriz[0][col].equals(matriz[1][col])
                                && matriz[1][col].equals(matriz[2][col])) {
                            venceu = true;
                        }
                    }
                    if (!matriz[0][0].equals(" ")
                            && matriz[0][0].equals(matriz[1][1])
                            && matriz[1][1].equals(matriz[2][2])) {
                        venceu = true;
                    }
                    if (!matriz[0][2].equals(" ")
                            && matriz[0][2].equals(matriz[1][1])
                            && matriz[1][1].equals(matriz[2][0])) {
                        venceu = true;
                    }

                    // Velha
                    for (int lin = 0; lin < matriz.length; lin++) {
                        for (int col = 0; col < matriz[lin].length; col++) {
                            if (!matriz[lin][col].equals(" ")) {
                                velha = true;
                            }
                        }
                        System.out.println();
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

        } while (jogadas < 9 || velha == true || venceu == true);
        System.out.println("--- Jogo encerrado ---");

        s.close();
    }
}
