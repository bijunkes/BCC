import java.lang.classfile.attribute.UnknownAttribute;
import java.util.ArrayList;

public class Plataforma {
    
    private ArrayList<Musica> musicas;
    private ArrayList<Usuario> usuarios;

    public Plataforma() {
        musicas = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null) {
            return false;
        }

        musicas.add(musica);
        return true;
    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null) {
            return false;
        }

        usuarios.add(usuario);
        return true;
    }

    public Musica buscarMusica(int id) {
        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }

        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (Musica musica : musicas) {
            if (musica.getTitulo().equalsIgnoreCase(titulo)) {
                return musica;
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

    public int getTotalMusicas() {
        return musicas.size();
    }

    public int getTotalUsuarios() {
        return usuarios.size();
    }

}
