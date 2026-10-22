public abstract class ItemSetup {

    private int totalItens;
    private int codigo;
    private String descricao;
    private double precoBase;

    public ItemSetup(String descricao, double precoBase) {
        this.descricao = descricao;
        this.precoBase = precoBase;
    }

    public int getTotalItens() {
        return totalItens;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();

    @Override
    public String toString() {
        return "";
    }

}
