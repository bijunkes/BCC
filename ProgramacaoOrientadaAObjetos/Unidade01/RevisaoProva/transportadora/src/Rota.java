/** Parte da COMPOSICAO: so a Entrega cria e usa. */
public class Rota {
    private String origem;
    private String destino;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
    }

    @Override
    public String toString() { return origem + " -> " + destino; }
}
