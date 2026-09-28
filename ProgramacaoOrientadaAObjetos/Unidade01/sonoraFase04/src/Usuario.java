import java.util.ArrayList;

public class Usuario {
    
    private static int contador = 1;

    private int id;
    private String nome;
    private String email;
    private ArrayList<Usuario> seguindo;

    public Usuario(String nome, String email) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new IllegalArgumentException("O email não pode ser nulo ou vazio e precisa ter @.");
        }
        this.id = contador++;
        this.nome = nome;
        this.email = email;
        this.seguindo = new ArrayList<>();
    }

    public static void resetarIds() {
        contador = 1;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void seguir(Usuario outro) {
        if (outro == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        }

        if (outro == this) {
            throw new IllegalArgumentException("Um usuário não pode seguir a si mesmo.");
        }

        if (seguindo.contains(outro)) {
            throw new IllegalArgumentException("O usuário já está sendo seguido.");
        }

        seguindo.add(outro);
    }

    public void deixarDeSeguir(Usuario outro) {
        if (outro == null) {
            throw new IllegalArgumentException("O usuário não pode ser nulo.");
        }

        seguindo.remove(outro);
    }

    public Usuario getSeguindoNaPosicao(int indice) {
        if (indice < 0 || indice >= seguindo.size()) {
            throw new IndexOutOfBoundsException("Índice inválido: " + indice);
        }

        return seguindo.get(indice);
    }

    public int getQuantidadeSeguindo() {
        return seguindo.size();
    }

}
