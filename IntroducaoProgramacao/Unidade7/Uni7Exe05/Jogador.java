package Unidade7.Uni7Exe05;

public class Jogador {
    String nome;
    int[] pontuacoes;

    Jogador(String nome) {
        this.nome = nome;
        pontuacoes = new int[3];
    }

    void registrarPontuacao(int rodada, int pontos) {
        if (rodada <= 2 && rodada >= 0) {
            pontuacoes[rodada] = pontos;
        } else {
            System.out.println("Rodada inválida!");
        }
    }

    int totalPontos() {
        int soma = 0;
        for (int i = 0; i < pontuacoes.length; i++) {
            soma += pontuacoes[i];
        }

        return soma;
    }

    double mediaPontos() {
        return totalPontos() / 3.0;
    }

    int melhorRodada() {
        int indiceMelhor = 0;

        for (int i = 1; i < pontuacoes.length; i++) {
            if (pontuacoes[i] > pontuacoes[indiceMelhor]) {
                indiceMelhor = i;
            }
        }

        return indiceMelhor + 1;
    }

    String classificacao() {
        String mensagem = "";

        if (totalPontos() >= 2500) {
            mensagem = "Ouro";
        } else if (totalPontos() >= 1500) {
            mensagem = "Prata";
        } else if (totalPontos() >= 800) {
            mensagem = "Bronze";
        } else {
            mensagem = "Sem classificação";
        }

        return mensagem;
    }
}
