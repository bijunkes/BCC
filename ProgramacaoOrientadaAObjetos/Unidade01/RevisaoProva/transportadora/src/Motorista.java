/**
 * ASSOCIACAO UNIDIRECIONAL 0..1 : Motorista ---> Caminhao (papel veiculoAtual) -> variavel simples, pode ser null
 * ASSOCIACAO REFLEXIVA 0..1     : Motorista -> Motorista (papel supervisor)
 */
public class Motorista extends Pessoa {
    private String cnh;
    private Caminhao veiculoAtual;             // 0..1 (so Motorista conhece Caminhao)
    private Motorista supervisor;              // reflexiva 0..1

    public Motorista(String nome, String cnh) {
        super(nome);                           // cascata: Pessoa executa antes
        this.cnh = cnh;
        System.out.println("  [ctor] Motorista: " + cnh);
    }

    public Caminhao getVeiculoAtual() { return veiculoAtual; }
    public void setVeiculoAtual(Caminhao c) { this.veiculoAtual = c; }
    public Motorista getSupervisor() { return supervisor; }
    public void setSupervisor(Motorista s) { this.supervisor = s; }

    public String situacao() {
        if (veiculoAtual == null) return getNome() + " esta sem caminhao";
        return getNome() + " dirige " + veiculoAtual.getPlaca();
    }
}
