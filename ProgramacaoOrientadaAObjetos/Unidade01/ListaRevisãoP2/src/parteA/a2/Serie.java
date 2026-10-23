public class Serie extends Midia2 implements Legendavel {

    private int temporadas;

    public Serie(String descricao, double precoBase, int temporadas) {
        super(descricao, precoBase);
        this.temporadas = temporadas;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * temporadas;
    }

    @Override
    public double calcularCustoLegenda() {
        return getPrecoBase() * 1.1;
    }
}
