package Unidade7.Uni7Exe05;

import java.util.Scanner;

import Unidade7.Uni7Exe04.Sala;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] tabela = new int[4][3];
        Jogador[] jogadores = new Jogador[4];

        for (int i = 0; i < jogadores.length; i++) {
            jogadores[i] = new Jogador(null);
        }

        System.out.println("=== CADASTRO ===");
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("Jogador " + (i + 1) + " - Nome: ");
            jogadores[i].nome = s.next();

            for (int j = 0; j < tabela[i].length; j++) {
                System.out.print("  Rodada " + (j + 1) + ": ");
                int ponto = s.nextInt();
                jogadores[i].registrarPontuacao(j, ponto);
                tabela[i][j] = ponto;
            }
        }

        int opcao;
        do {
            System.out.print("\nOpção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=== TABELA GERAL ===");
                    System.out.println("Jogador\t| R1\t| R2\t| R3\t| Total");
                    for (int i = 0; i < tabela.length; i++) {
                        System.out.print(jogadores[i].nome);
                        for (int j = 0; j < tabela[i].length; j++) {
                            System.out.print("\t| " + tabela[i][j]);
                        }
                        System.out.println("\t| " + jogadores[i].totalPontos());
                    }
                    break;

                case 2:
                    System.out.println("=== RANKING FINAL ===");
                    for (int i = 0; i < jogadores.length - 1; i++) {
                        for (int j = i + 1; j < jogadores.length; j++) {
                            if (jogadores[i].totalPontos() < jogadores[j].totalPontos()) {
                                Jogador aux = jogadores[i];
                                jogadores[i] = jogadores[j];
                                jogadores[j] = aux;
                            }
                        }
                    }

                    for (int i = 0; i < jogadores.length; i++) {
                        String ehCampeao = "";
                        if (i == 0) {
                            ehCampeao = " CAMPEÃO";
                        }
                        System.out.println(jogadores[i].nome + "\t- Total: " + jogadores[i].totalPontos() + "\t- Média: " + jogadores[i].mediaPontos() + "\t- Melhor: Rodada " + jogadores[i].melhorRodada() + "\t- " + jogadores[i].classificacao() + ehCampeao);
                    }
                    break;

                    case 3:
                        System.out.print("Nome: ");
                        String nomeBusca = s.next();

                        System.out.println("=== DETALHES ===");

                        int i = 0;
                        boolean encontrou = false;

                        while (i < jogadores.length && !encontrou) {
                            if (jogadores[i].nome.equalsIgnoreCase(nomeBusca)) {
                                encontrou = true;
                                System.out.print("Nome: " + jogadores[i].nome + "\nRodadas: ");
                                for (int j = 0; j < tabela[i].length; j++) {
                                    System.out.print(jogadores[i].pontuacoes[j] + " | ");
                                }
                                System.out.println("\nTotal: " + jogadores[i].totalPontos() + " | Média: " + jogadores[i].mediaPontos() + "\nMelhor rodada: " + jogadores[i].melhorRodada() + "\nClassificação: " + jogadores[i].classificacao());
                            }

                            i++;
                        }

                            if (!encontrou) 
                                System.out.println("Jogador não encontrado.");

                        break;

                default:
                    break;
            }

        } while (opcao != 0);

        s.close();
    }
}
