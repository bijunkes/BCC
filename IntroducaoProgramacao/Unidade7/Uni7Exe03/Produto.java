package Unidade7.Uni7Exe03;

public class Produto {
    String nome;
    double preco;
    int estoque;

    Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    void vender(int qtd) {
        if (qtd > estoque) {
            System.out.println("Estoque insuficinete! Disponível: " + estoque);
        } else {
            System.out.println("Venda realizada!");
            estoque -= qtd;
        }
    }

    void repor(int qtd) {
        estoque += qtd;
        System.out.println("Estoque reposto!");
    }

    boolean estaEmBaixa() {
        return estoque <= 3;
    }
}
