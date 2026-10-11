import java.util.ArrayList;

public class Plataforma {
    
    private ArrayList<Conteudo> conteudos;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Anuncio> anuncios;

    public Plataforma() {
        conteudos = new ArrayList<>();
        usuarios = new ArrayList<>();
        anuncios = new ArrayList<>();
    }

    public boolean cadastrarConteudo(Conteudo conteudo) {
        if (conteudo == null) {
            return false;
        }

        conteudos.add(conteudo);
        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            return false;
        }

        usuarios.add(usuario);
        return true;
    }

    public Conteudo buscarConteudo(int id) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getId() == id) {
                return conteudo;
            }
        }

        return null;
    }

    public Conteudo buscarConteudo(String titulo) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getTitulo().equalsIgnoreCase(titulo)) {
                return conteudo;
            }
        }

        return null;
    }

    public Usuario buscarUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }

        return null;
    }

    public int getTotalConteudos() {
        return conteudos.size();
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }


    public double calcularReceitaMensal() {
        ArrayList<Faturavel> cobrancas = new ArrayList<>();

        for (Usuario usuario : usuarios) {
            cobrancas.add(usuario.getPlano());
        }

        for (Anuncio anuncio : anuncios) {
            cobrancas.add(anuncio);
        }

        double receitaTotal = 0;

        for (Faturavel cobranca : cobrancas) {
            receitaTotal += cobranca.calcularMensalidade();
        }

        return receitaTotal;
    }

    public void listarEpisodiosDe(String apresentador) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo instanceof Podcast) {
                Podcast podcast = (Podcast) conteudo;

                if (podcast.getApresentador().equalsIgnoreCase(apresentador)) {
                    System.out.println(podcast.getCreditos());
                }
            }
        }
    }

    public boolean cadastrarAnuncio(Anuncio anuncio) {
        if (anuncio == null) {
            return false;
        }

        anuncios.add(anuncio);
        return true;
    }

    public void tocarPlaylist(Usuario ouvinte, Playlist playlist) {
        if (ouvinte == null || playlist == null) {
            throw new IllegalArgumentException(
                    "O ouvinte e a playlist não podem ser nulos."
            );
        }

        ArrayList<Reproduzivel> fila = new ArrayList<>();

        for (int i = 0; i < playlist.getQuantidade(); i++) {
            Conteudo conteudo = playlist.getNaPosicao(i);
            fila.add(conteudo);
        }

        if (ouvinte.getPlano().temAnuncios() && !anuncios.isEmpty()) {
            ArrayList<Reproduzivel> filaComAnuncios = new ArrayList<>();
            int indiceAnuncio = 0;

            for (int i = 0; i < fila.size(); i++) {
                filaComAnuncios.add(fila.get(i));

                if ((i + 1) % 2 == 0) {
                    filaComAnuncios.add(anuncios.get(indiceAnuncio));

                    indiceAnuncio = (indiceAnuncio + 1) % anuncios.size();
                }
            }

            fila = filaComAnuncios;
        }

        for (Reproduzivel item : fila) {
            System.out.println("Duração: " + item.getDuracaoFormatada());
            item.reproduzir();
        }
    }

}
