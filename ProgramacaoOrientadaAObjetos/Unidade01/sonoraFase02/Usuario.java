package ProgramacaoOrientadaAObjetos.Unidade01.sonoraFase02;

public class Usuario {
    
    private static int contador = 1;

    private int id;
    private String nome;
    private String email;

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

}
