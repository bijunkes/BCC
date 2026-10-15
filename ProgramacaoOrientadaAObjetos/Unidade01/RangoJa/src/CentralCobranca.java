package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CentralCobranca {

    private List<Cobravel> cobrancas = new ArrayList<>();

    public void registrar(Cobravel cobranca) {
        if (cobranca == null) {
            throw new IllegalArgumentException("Cobrança não pode ser nula.");
        }
        cobrancas.add(cobranca);
    }

    public double calcularTotalAReceber() {
        double total = 0;
        for (int i = 0; i < cobrancas.size(); i++) {
            total += cobrancas.get(i).calcularValorCobrar();
        }
        return total;
    }

    public int getQuantidadeCobrancas() {
        return cobrancas.size();
    }

    public String gerarRelatorio() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cobrancas.size(); i++) {
            sb.append(cobrancas.get(i).gerarComprovante()).append("\n");
        }
        sb.append(String.format(new Locale("pt", "BR"), "Total a receber: R$ %.2f", calcularTotalAReceber()));
        return sb.toString();
    }
}