/** Superclasse SEM construtor padrao: as subclasses sao OBRIGADAS a chamar super(nome). */
public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("  [ctor] Pessoa: " + nome);
    }

    public String getNome() { return nome; }

    @Override
    public String toString() { return nome; }
}
