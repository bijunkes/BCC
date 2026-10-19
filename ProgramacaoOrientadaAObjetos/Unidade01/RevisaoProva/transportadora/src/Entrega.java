/**
 * COMPOSICAO (losango cheio no todo): Entrega ◆---- Rota.
 * O todo CRIA a parte no construtor e NAO a expoe (sem getRota / setRota).
 * Tambem tem associacao unidirecional 1 com Veiculo (recebido pronto).
 */
public class Entrega {
    private Rota rota;
    private Veiculo veiculo;
    private double km;

    public Entrega(String origem, String destino, Veiculo veiculo, double km) {
        this.rota = new Rota(origem, destino);   // criada aqui dentro
        this.veiculo = veiculo;
        this.km = km;
    }

    public double getValor() { return veiculo.calcularFrete(km); }

    public String resumo() { return rota + " via " + veiculo.getPlaca(); }
}
