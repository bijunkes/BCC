import java.util.ArrayList;

/**
 * HERANCA: extends (Caminhao "e um" Veiculo). UML: ---|>
 * REALIZACAO: implements (..|>) de interface que herda de outra.
 * ASSOCIACAO 0..3 com Pacote -> ArrayList + validacao do MAXIMO.
 */
public class Caminhao extends Veiculo implements RastreavelGPS {
    private static final int MAX_PACOTES = 3;
    private ArrayList<Pacote> pacotes = new ArrayList<>();   // multiplicidade 0..3

    public Caminhao(String placa) {
        super(placa);                          // 1o comando: chama construtor da superclasse
        System.out.println("  [ctor] Caminhao criado");
    }

    public void embarcar(Pacote p) {
        if (pacotes.size() >= MAX_PACOTES)     // >= (e NAO >): senao deixa entrar o 4o
            throw new IllegalStateException("Caminhao cheio");
        pacotes.add(p);
    }

    public int getQuantidadePacotes() { return pacotes.size(); }

    @Override                                  // SOBRESCRITA (mesmo nome e parametros)
    public double calcularFrete(double km) {
        return km * 5.0 + pacotes.size() * 10;
    }

    @Override
    public void rodar(double km) {
        System.out.println("  Caminhao rodando " + km + "km");
        super.rodar(km);                       // super.metodo(): reaproveita o da superclasse
    }

    @Override
    public String getLocalizacao() { return "Rodovia BR-116"; }

    @Override
    public double getLatitude() { return -23.5; }

    @Override
    public String toString() { return "Caminhao/" + super.toString(); }
}
