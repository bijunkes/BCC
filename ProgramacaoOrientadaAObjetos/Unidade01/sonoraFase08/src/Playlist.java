import java.util.ArrayList;

public class Playlist {

    private String nome;
    private Usuario dono;
    private ArrayList<Musica> musicas;

    public Playlist(String nome, Usuario dono) {
        if (nome == null || dono == null) {
            throw new IllegalArgumentException("Nome e dono não podem ser nulos.");
        }
        this.nome = nome;
        this.dono = dono;
        this.musicas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return musicas.size();
    }

    public boolean adicionar(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("A música não pode ser nula.");
        }

        if (musicas.size() >= 100) {
            return false;
        }

        musicas.add(musica);
        return true;
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        return musicas.get(indice);
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= musicas.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        musicas.remove(indice);
        return true;
    }

    public int getDuracaoTotalSegundos() {
        int duracaoTotal = 0;

        for (Musica musica : musicas) {
            duracaoTotal += musica.getDuracaoSegundos();
        }

        return duracaoTotal;
    }

    public void reproduzirTudo() {
        for (Musica musica : musicas) {
            musica.reproduzir();
        }
    }

}
