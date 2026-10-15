package src;

public class Cliente {

    private String nome;
    private String email;
    private int idade;
    private double saldoCashback;
    private Cliente indicadoPor;

    public Cliente(String nome, String email, int idade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("E-mail é obrigatório.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido: deve conter @.");
        }
        this.nome = nome;
        this.email = email;
        setIdade(idade);
        this.saldoCashback = 0.0;
    }

    public Cliente(String nome, String email, int idade, Cliente indicadoPor) {
        this(nome, email, idade);
        if (indicadoPor == null) {
            throw new IllegalArgumentException("Cliente indicador não pode ser nulo.");
        }
        this.indicadoPor = indicadoPor;
        indicadoPor.creditarCashback(10.0);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldoCashback() {
        return saldoCashback;
    }

    public Cliente getIndicadoPor() {
        return indicadoPor;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 120) {
            throw new IllegalArgumentException("Idade deve estar entre 0 e 120.");
        }
        this.idade = idade;
    }

    public boolean isMaiorDeIdade() {
        return idade >= 18;
    }

    public void creditarCashback(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de crédito deve ser positivo.");
        }
        saldoCashback += valor;
    }

    public void usarCashback(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de uso deve ser positivo.");
        }
        if (valor > saldoCashback) {
            throw new SaldoInsuficienteException(saldoCashback, valor);
        }
        saldoCashback -= valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cliente)) {
            return false;
        }
        Cliente outro = (Cliente) obj;
        return email.equalsIgnoreCase(outro.email);
    }

    @Override
    public int hashCode() {
        return email.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nome + " <" + email + ">";
    }
}