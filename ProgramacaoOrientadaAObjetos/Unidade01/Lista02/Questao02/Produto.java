package ProgramacaoOrientadaAObjetos.Unidade01.Lista02.Questao02;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public int vender(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            return estoque;
        }
        System.out.println("Quantidade insuficiente, operação cancelada.");
        return estoque;
    }

    public int repor(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            return estoque;
        }
        System.out.println("Quantidade inválida, operação cancelada.");
        return estoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        if (preco > 0) {
            this.preco = preco;
        }
        else {
            System.out.println("Valor inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEstoque() {
        return estoque;
    }
}
