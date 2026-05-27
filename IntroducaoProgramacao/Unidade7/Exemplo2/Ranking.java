package Unidade7.Exemplo2;

public class Ranking {
    Jogador[] jogadores;

    public Ranking() {
        jogadores = new Jogador[5];
    }

    public void registrar(int posicao, String nome, int pontuacao) {
        if (posicao >= 1 && posicao <= 5) {
            jogadores[posicao - 1] = new Jogador(nome, pontuacao);
        } else {
            System.out.println("Posição inválida");
        }
    }

    public void exibir() {
        for (int i = 0; i < jogadores.length; i++) {
            Jogador j =  jogadores[i];

            if (j != null)  {
                j.exibir(i + 1);
            } else {
                System.out.println(i + 1 + "º -- Vazio --");
            }
        }
    }
}
