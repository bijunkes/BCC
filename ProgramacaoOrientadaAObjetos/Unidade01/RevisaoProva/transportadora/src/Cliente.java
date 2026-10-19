import java.util.ArrayList;

/** ASSOCIACAO BIDIRECIONAL (sem setas): Cliente tem lista de Pacote E Pacote tem Cliente. */
public class Cliente extends Pessoa {
    private ArrayList<Pacote> pacotes = new ArrayList<>();   // 0..*

    public Cliente(String nome) { super(nome); }

    public void adicionarPacote(Pacote p) {
        pacotes.add(p);
        p.setRemetente(this);                  // mantem os DOIS lados consistentes
    }

    public ArrayList<Pacote> getPacotes() { return pacotes; }
}
