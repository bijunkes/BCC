package Unidade7.Exemplo2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Ranking ranking = new Ranking();
        int opcao = 0;

        do {
            System.out.println("Informe a opção desejada: \n[1] Registrar jogador\n[2] Exibir o ranking\n[0] Sair");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a posição (1 a 5) do jogador: ");
                    int posicao = s.nextInt();

                    System.out.print("Digite o nome do jogador: ");
                    String nome = s.next();

                    System.out.print("Informe a pontuação do jogador: ");
                    int pontuacao = s.nextInt();

                    ranking.registrar(posicao, nome, pontuacao);
                    break;

                case 2:
                    ranking.exibir();
                    break;
            
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        s.close();
    }
}
