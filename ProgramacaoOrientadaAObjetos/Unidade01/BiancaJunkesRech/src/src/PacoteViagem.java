import java.util.ArrayList;
import java.util.List;

public class PacoteViagem {

    Cliente titular;
    Localidade destino;

    private List<ServicoTuristico> servicos = new ArrayList<>();

    public PacoteViagem(Cliente titular, String cidade, String pais) {
        setTitular(titular);
        destino = new Localidade(cidade, pais);
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        if (titular == null) {
            throw new IllegalArgumentException("Titular obrigatório.");
        }
        this.titular = titular;
    }

    public Localidade getCidadeDestino() {
        return destino;
    }

    public Localidade getPaisDestino() {
        return destino;
    }

    public ArrayList<ServicoTuristico> getServicos() {
        return (ArrayList<ServicoTuristico>) servicos;
    }

    public void adicionarServico(ServicoTuristico s) {
        if (s == null) {
            throw new IllegalArgumentException("Serviço inválido");
        }

        for (ServicoTuristico servico : servicos) {
            if (servico.equals(s)) {
                throw new IllegalStateException("Servço já incluído no pacote.");
            }
        }

        if (servicos.size() > 6) {
            throw new IllegalStateException("Pacote lotado");
        }

        servicos.add(s);
    }

    public void removerServico(ServicoTuristico s) {
        for (ServicoTuristico servico : servicos) {
            if (!servico.equals(s)) {
                throw new IllegalStateException("Serviço não encontrado no pacote.");
            }
        }

        servicos.remove(s);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (ServicoTuristico servico : servicos) {
            valorTotal += servico.calcularValor();
        }
        return valorTotal;
    }

    public double calcularTotalReembolso() {
        double valorReembolsavel = 0;

        for (ServicoTuristico servico : servicos) {
            if (servico instanceof Reembolsavel) {
                valorReembolsavel += ((Reembolsavel) servico).calcularReembolso();
            }
        }
        return valorReembolsavel;
    }

}
