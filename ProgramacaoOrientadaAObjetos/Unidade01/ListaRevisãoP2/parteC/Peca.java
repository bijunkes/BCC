public class Peca extends ItemSetup implements ComGarantia {

    private int quantidade;

    public Peca(String descricao, double precoBase, int quantidade) {
        super(descricao, precoBase);

        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }

        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double calcularPreco() {
        double total = getPrecoBase() * quantidade;

        if (quantidade >= 3) {
            total = total * 0.9;
        }

        return total;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return calcularPreco() * 0.15;
    }
}
