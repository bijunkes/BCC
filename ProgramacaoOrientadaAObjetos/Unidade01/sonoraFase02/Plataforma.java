package ProgramacaoOrientadaAObjetos.Unidade01.sonoraFase02;

public class Plataforma {
    
    private Musica[] musicas;
    private Usuario[] usuarios;

    private int qtdeMusicas;
    private int qtdeUsuarios;

    public Plataforma() {
        musicas = new Musica[500];
        usuarios = new Usuario[500];
        qtdeMusicas = 0;
        qtdeUsuarios = 0;
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null || qtdeMusicas >= musicas.length) {
            return false;
        }

        musicas[qtdeMusicas] = musica;
        qtdeMusicas++;

        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null || qtdeUsuarios >= usuarios.length) {
            return false;
        }

        usuarios[qtdeUsuarios] = usuario;
        qtdeUsuarios++;

        return true;
    }

    public Musica buscarMusica(int id) {
        for (int i = 0; i < qtdeMusicas; i++) {
            if (musicas[i].getId() == id) {
                return musicas[i];
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (int i = 0; i < qtdeMusicas; i++) {
            if (musicas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return musicas[i];
            }
        }

        return null;
    }

    public int getTotalMusicas() {
        return qtdeMusicas;
    }

    public int getTotalUsuarios() {
        return qtdeUsuarios;
    }

}
