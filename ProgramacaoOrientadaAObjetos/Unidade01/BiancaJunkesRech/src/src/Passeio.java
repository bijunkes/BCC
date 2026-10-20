public class Passeio extends ServicoTuristico implements Reembolsavel {

    private int pessoas;

    public Passeio(String descricao, double valorBase, int pessoas) {
        super(descricao, valorBase);

        if (pessoas <= 0) {
            throw new IllegalArgumentException("Quantidade de pessoas inválidas");
        }
        this.pessoas = pessoas;
    }

    @Override
    public double calcularValor() {
        if (pessoas >= 5) {
            return (getValorBase() * pessoas) * 0.9;
        }
        return getValorBase() * pessoas;
    }

    @Override
    public double calcularReembolso() {
        return calcularValor() * 0.7;
    }

}
