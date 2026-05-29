package Unidade7.Uni7Exe02;

public class Pedido {
    String nomeItem;
    int quantidade;
    double precoUnitario;

    Pedido(String nomeItem, int quantidade, double precoUnitario) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    double calcularTotal() {
        return quantidade * precoUnitario;
    }
}
