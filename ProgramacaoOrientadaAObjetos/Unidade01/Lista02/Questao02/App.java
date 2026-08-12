package ProgramacaoOrientadaAObjetos.Unidade01.Lista02.Questao02;

public class App {
    
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Notebook Dell");
        produto.setPreco(4500);
        produto.repor(10);

        // Operações inválidas
        produto.vender(11);
        produto.setPreco(-1);
    }
}
