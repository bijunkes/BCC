public class Peca extends ItemSetup implements ComGarantia {

    private int quantidade;

    public Peca(String descricao, double precoBase, int quantidade) {
        super(descricao, precoBase);

        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    @Override
    public double calcularGarantiaEstendida() {
        return 0;
    }
}
