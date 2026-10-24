package src.src;

public class Pedido {

    private Cliente comprador;
    private  Endereco entrega;

    public Pedido(Cliente comprador, String rua, int numero) {
        this.comprador = comprador;
        this.entrega = new Endereco(rua, numero);
    }

    public String getRuaEntrega() {
        return entrega.getRua();
    }

    public int getNumeroEntrega() {
        return entrega.getNumero();
    }

    /*
    Correção da versão 1:
    Pedido não deve estender Endereco, pois um pedido não é um endereço.
    Mesmo compilando, a versão 1 é um erro de modelagem porque faz Pedido
    herdar características de Endereco sem representar uma relação correta.

    Correção da versão 2:
    A versão 2 cria um Endereco, mas não o guarda como atributo
    e armazena rua e numero duplicadamente no próprio Pedido.
    A variável entrega é local ao construtor e deixa de ser acessível
    quando ele termina.
    */

}
