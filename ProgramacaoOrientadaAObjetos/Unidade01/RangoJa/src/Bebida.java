package src;

public class Bebida extends ItemCardapio {

    private int volumeMl;
    private boolean alcoolica;

    public Bebida(String nome, double precoBase, int volumeMl, boolean alcoolica) {
        super(nome, precoBase);

        validarPositivo(volumeMl);
        this.volumeMl = volumeMl;
        this.alcoolica = alcoolica;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public boolean isAlcoolica() {
        return alcoolica;
    }

    @Override
    public double calcularPreco() {
        if (alcoolica) {
            return getPrecoBase() + 3.0;
        }
        return getPrecoBase();
    }

    @Override
    public String toString() {
        String texto = super.toString() + " (" + volumeMl + " ml)";
        if (alcoolica) {
            texto += " [alcoólica]";
        }
        return texto;
    }
}
