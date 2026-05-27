package Unidade7.Exemplo1;

public class Pedido {
    String nomeCliente;
    String descricaoItem;
    double valor;
    boolean entregue;

    public Pedido(String nome, String descricao, double valor) {
        this.nomeCliente = nome;
        this.descricaoItem = descricao;
        this.valor = valor;
    }

    public boolean entregar() {
        entregue = true;
        return entregue;
    }

    void exibirStatus() {
        if (entregue) {
            System.out.println("Pedido entregue");
        } else {
            System.out.println("Pedido pendente");
        }
    }
}
