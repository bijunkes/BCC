public class Playlist {

    private String nome;
    private Usuario dono;
    private int quantidade;
    private Musica[] musicas;
    
    public Playlist(String nome, Usuario dono) {
        if (nome == null || dono == null) {
            throw new IllegalArgumentException("Nome e dono não podem ser nulos.");
        }
        this.nome = nome;
        this.dono = dono;
        this.musicas = new Musica[100];
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionar(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("A música não pode ser nula.");
        }
        if (quantidade >= musicas.length) {
            return false;
        }

        musicas[quantidade] = musica;
        quantidade++;

        return true;
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        return musicas[indice];
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        for (int i = indice; i < quantidade - 1; i++) {
            musicas[i] = musicas[i + 1];
        }

        musicas[quantidade - 1] = null;
        quantidade--;

        return true;
    }

    public int getDuracaoTotalSegundos() {
        int duracaoTotal = 0;

        for (int i = 0; i < quantidade; i++) {
            duracaoTotal += musicas[i].getDuracaoSegundos();
        }

        return duracaoTotal;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < getQuantidade(); i++) {
            musicas[i].reproduzir();
        }
    }

}
