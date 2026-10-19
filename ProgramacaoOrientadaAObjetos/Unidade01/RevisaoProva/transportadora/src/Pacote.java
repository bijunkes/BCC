/** Lado "muitos" da associacao BIDIRECIONAL Cliente 1 <---> 0..* Pacote (papel remetente). */
public class Pacote {
    private String descricao;
    private double pesoKg;
    private Cliente remetente;

    public Pacote(String descricao, double pesoKg) {
        this.descricao = descricao;
        this.pesoKg = pesoKg;
    }

    public String getDescricao() { return descricao; }
    public double getPesoKg() { return pesoKg; }
    public Cliente getRemetente() { return remetente; }
    public void setRemetente(Cliente c) { this.remetente = c; }

    @Override
    public String toString() { return descricao + " (" + pesoKg + "kg)"; }
}
