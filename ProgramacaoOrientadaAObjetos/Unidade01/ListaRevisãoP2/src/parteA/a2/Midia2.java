public abstract class Midia2 {

    private String descricao;
    private double precoBase;

    public Midia2(String descricao, double precoBase) {
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();

}
