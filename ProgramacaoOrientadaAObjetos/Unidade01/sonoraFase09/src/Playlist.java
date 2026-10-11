import java.util.ArrayList;

public class Playlist {

    private String nome;
    private Usuario dono;
    private ArrayList<Conteudo> conteudos;

    public Playlist(String nome, Usuario dono) {
        if (nome == null || dono == null) {
            throw new IllegalArgumentException("Nome e dono não podem ser nulos.");
        }
        this.nome = nome;
        this.dono = dono;
        this.conteudos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return conteudos.size();
    }

    public boolean adicionar(Conteudo conteudo) {
        if (conteudo == null) {
            throw new IllegalArgumentException("O conteúdo não pode ser nulo.");
        }

        if (conteudos.size() >= 100) {
            return false;
        }

        conteudos.add(conteudo);
        return true;
    }

    public Conteudo getNaPosicao(int indice) {
        if (indice < 0 || indice >= conteudos.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        return conteudos.get(indice);
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= conteudos.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        conteudos.remove(indice);
        return true;
    }

    public int getDuracaoTotalSegundos() {
        int duracaoTotal = 0;

        for (Conteudo conteudo : conteudos) {
            duracaoTotal += conteudo.getDuracaoSegundos();
        }

        return duracaoTotal;
    }

    public void reproduzirTudo() {
        for (Conteudo conteudo : conteudos) {
            conteudo.reproduzir();
        }
    }

}
