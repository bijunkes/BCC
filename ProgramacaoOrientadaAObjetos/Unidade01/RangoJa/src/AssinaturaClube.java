package src;

public class AssinaturaClube implements Cobravel {

    private Cliente cliente;
    private double valorMensal;
    private int meses;

    public AssinaturaClube(Cliente cliente, double valorMensal, int meses) {
        if (cliente == null) {
            throw new IllegalArgumentException("Cliente é obrigatório.");
        }
        if (valorMensal <= 0) {
            throw new IllegalArgumentException("Valor mensal deve ser positivo.");
        }
        if (meses < 1) {
            throw new IllegalArgumentException("Mínimo de 1 mês.");
        }
        this.cliente = cliente;
        this.valorMensal = valorMensal;
        this.meses = meses;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public int getMeses() {
        return meses;
    }

    @Override
    public double calcularValorCobrar() {
        double total = valorMensal * meses;
        if (meses >= 12) {
            return total * 0.85;
        }
        return total;
    }
}

