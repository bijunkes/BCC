public class Documentario extends Midia2 implements Legendavel {

    private int temporadas;

    public Documentario(String descricao, double precoBase, int temporadas) {
        super(descricao, precoBase);
        this.temporadas = temporadas;
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase();
    }

    @Override
    public double calcularCustoLegenda() {
        return getPrecoBase();
    }
}
