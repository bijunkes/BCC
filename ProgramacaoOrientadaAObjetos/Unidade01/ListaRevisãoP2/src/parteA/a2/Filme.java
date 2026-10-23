public class Filme extends Midia2 {

    private double precoBase;

    public Filme(String descricao, double precoBase) {
        super(descricao, precoBase);
    }

    @Override
    public double calcularPreco() {
        return precoBase;
    }
}
