package src;

public class Prato extends ItemCardapio {

    private char tamanho;

    public Prato(String nome, double precoBase, char tamanho) {
        super(nome, precoBase);

        if (tamanho != 'P' && tamanho != 'M' && tamanho != 'G') {
            throw new IllegalArgumentException("Tamanho inválido: use P, M ou G.");
        }
        this.tamanho = tamanho;
    }

    public char getTamanho() {
        return tamanho;
    }

    @Override
    public double calcularPreco() {
        if (tamanho == 'M') {
            return getPrecoBase() * 1.30;
        }
        if (tamanho == 'G') {
            return getPrecoBase() * 1.60;
        }
        return getPrecoBase();
    }

    @Override
    public String toString() {
        return super.toString() + " (tamanho " + tamanho + ")";
    }
}