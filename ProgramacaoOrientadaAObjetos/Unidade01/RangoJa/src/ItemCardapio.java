package src;

import java.util.Locale;

public abstract class ItemCardapio {

    private String nome;
    private double precoBase;

    public ItemCardapio(String nome, double precoBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        validarPositivo(precoBase);
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        validarPositivo(precoBase);
        this.precoBase = precoBase;
    }

    protected void validarPositivo(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser positivo.");
        }
    }

    public abstract double calcularPreco();

    public final double calcularPrecoComDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual deve estar entre 0 e 100.");
        }
        return calcularPreco() * (1 - percentual / 100.0);
    }

    @Override
    public String toString() {
        return String.format(new Locale("pt", "BR"), "%s - R$ %.2f", nome, calcularPreco());
    }
}