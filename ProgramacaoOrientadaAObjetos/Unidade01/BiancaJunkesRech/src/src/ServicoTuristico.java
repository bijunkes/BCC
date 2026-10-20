public abstract class ServicoTuristico {

    private static int totalServicos = 0;
    private int codigo;
    private String descricao;
    private double valorBase;

    public ServicoTuristico(String descricao, double valorBase) {
        if (valorBase <= 0) {
            throw new IllegalArgumentException("Valor base inválido");
        }

        this.codigo = getTotalServicos();
        this.descricao = descricao;
        this.valorBase = valorBase;
    }

    public static int getTotalServicos() {
        return totalServicos += 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorBase() {
        return valorBase;
    }

    public abstract double calcularValor();

    @Override
    public String toString() {
        return codigo + " - " + descricao + " - R$ " + calcularValor();
    }

}
