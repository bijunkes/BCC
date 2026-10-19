import java.util.ArrayList;

/**
 * AGREGACAO (losango vazio no todo): Frota ◇---- Veiculo.
 * Os veiculos JA EXISTEM e chegam prontos (metodo adicionar). Podem existir fora da Frota.
 * Tambem mostra POLIMORFISMO, INSTANCEOF e DOWNCASTING.
 */
public class Frota {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo v) { veiculos.add(v); }

    public double calcularFreteTotal(double km) {
        double total = 0;
        for (Veiculo v : veiculos) {           // polimorfismo: cada um roda o SEU calcularFrete
            total += v.calcularFrete(km);
        }
        return total;
    }

    public void tratarEspecificos() {
        for (Veiculo v : veiculos) {
            if (v instanceof Caminhao) {                 // confere ANTES do cast
                Caminhao c = (Caminhao) v;               // DOWNCASTING
                System.out.println("  Caminhao com " + c.getQuantidadePacotes() + " pacote(s), lat " + c.getLatitude());
            } else if (v instanceof Moto) {
                Moto m = (Moto) v;                       // DOWNCASTING
                System.out.println("  " + m.entregaExpressa());
            }
        }
    }

    public ArrayList<Veiculo> getVeiculos() { return veiculos; }
}
