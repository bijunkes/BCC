package Unidade7.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido("Bianca", "Pizza de calabrasa", 20.99);
        Pedido pedido2 = new Pedido("Bernardo", "Porção fritas", 11.99);

        pedido1.entregar();
        pedido1.exibirStatus();
        
        pedido2.exibirStatus();
    }
}
