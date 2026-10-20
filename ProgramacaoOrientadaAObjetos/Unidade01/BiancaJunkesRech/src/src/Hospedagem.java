public class Hospedagem extends ServicoTuristico{

    private int diarias;

    public Hospedagem(String descricao, double valorBase, int diarias) {
        super(descricao, valorBase);

        if (diarias <= 0) {
            throw new IllegalArgumentException("Quantidade de diárias inválidas.");
        }
        this.diarias = diarias;
    }

    public int getDiarias() {
        return diarias;
    }

    @Override
    public double calcularValor() {
        return getValorBase() * diarias;
    }
}
