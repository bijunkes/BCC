public class Serie extends Midia implements Legendavel {

    private int temporadas;

    public Serie(String descricao, double precoBase, int temporadas) {
        super(descricao, precoBase);
        this.temporadas = temporadas;
    }

    @Override
    public double calcularPreco() {
        return precoBase * temporadas;
    }

    @Override
    public double calcularCustoLegenda() {
        return calcularPreco() * 0.1;
    }
}
