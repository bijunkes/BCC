public abstract class Midia {

    protected String descricao;
    protected double precoBase;

    public Midia(String descricao, double precoBase) {
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();

}
