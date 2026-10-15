package src;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Cobravel {

    public static final double TAXA_ENTREGA = 7.0;
    public static final double VALOR_FRETE_GRATIS = 100.0;
    private static int proximoNumero = 1;

    private int numero;
    private Cliente cliente;
    private boolean finalizado;
    private List<ItemCardapio> itens = new ArrayList<>();

    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Pedido precisa de um cliente.");
        }
        this.cliente = cliente;
        this.numero = proximoNumero;
        proximoNumero++;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public void adicionarItem(ItemCardapio item) {
        if (item == null) {
            throw new IllegalArgumentException("Item não pode ser nulo.");
        }
        if (finalizado) {
            throw new IllegalStateException("Pedido já finalizado.");
        }
        if (item instanceof Bebida) {
            Bebida b = (Bebida) item;
            if (b.isAlcoolica() && !cliente.isMaiorDeIdade()) {
                throw new IllegalArgumentException("Bebida alcoólica só para maiores de idade.");
            }
        }
        itens.add(item);
    }

    public void adicionarItem(ItemCardapio item, int quantidade) {
        if (quantidade < 1) {
            throw new IllegalArgumentException("Quantidade deve ser pelo menos 1.");
        }
        for (int i = 0; i < quantidade; i++) {
            adicionarItem(item);
        }
    }

    public double calcularSubtotal() {
        double total = 0;
        for (int i = 0; i < itens.size(); i++) {
            total += itens.get(i).calcularPreco();
        }
        return total;
    }

    public double calcularTaxaEntrega() {
        if (calcularSubtotal() >= VALOR_FRETE_GRATIS) {
            return 0.0;
        }
        return TAXA_ENTREGA;
    }

    @Override
    public double calcularValorCobrar() {
        return calcularSubtotal() + calcularTaxaEntrega();
    }

    public void finalizar() {
        if (finalizado) {
            throw new IllegalStateException("Pedido já finalizado.");
        }
        if (itens.isEmpty()) {
            throw new IllegalStateException("Pedido sem itens.");
        }
        cliente.creditarCashback(calcularSubtotal() * 0.05);
        finalizado = true;
    }

    public static int getTotalPedidosCriados() {
        return proximoNumero - 1;
    }
}