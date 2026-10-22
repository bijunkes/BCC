public class Montagem extends ItemSetup {

    private int horas;

    public Montagem(String descricao, double precoBase, int horas) {
        super(descricao, precoBase);

        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }
}
