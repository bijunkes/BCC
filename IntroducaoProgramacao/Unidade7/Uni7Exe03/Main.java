package Unidade7.Uni7Exe03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Produto[] produtos = new Produto[8];

        produtos[0] = new Produto("Monitor", 150.90, 2);
        produtos[1] = new Produto("Teclado", 89.90, 5);
        produtos[2] = new Produto("Mousepad", 49.90, 10);
        produtos[3] = new Produto("Notebook", 3500.00, 1);
        produtos[4] = new Produto("Headset", 199.90, 3);
        produtos[5] = new Produto("Webcam", 129.90, 4);
        produtos[6] = new Produto("Impressora", 599.90, 2);
        produtos[7] = new Produto("SSD 1TB", 449.90, 6);

        int opcao = 1;
        System.out.println("=== ESTOQUE ===\n1 - Listar produtos\n2 - Vender\n3 - Repor estoque\n0 - Sair");

        while (opcao != 0) {
            System.out.print("\nOpção: ");
            opcao = s.nextInt();

            int cod = 0;
            int qtd = 0;
            
            switch (opcao) {
                case 1:
                    System.out.println("Cód\t| Produto\t\t| Preço\t\t\t| Estoque");
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.print((i+1) + "\t| " + produtos[i].nome + "\t\t| R$ " + produtos[i].preco + "\t\t| " + produtos[i].estoque);

                        if (produtos[i].estaEmBaixa()) {
                            System.out.println(" BAIXO");
                        } else {
                            System.out.println();
                        }
                    }
                    break;

                case 2:
                    System.out.print("Código do produto: ");
                    cod = s.nextInt();
                    System.out.print("Quantidade: ");
                    qtd = s.nextInt();

                    produtos[cod - 1].vender(qtd);
                    break;

                case 3:
                    System.out.print("Código do produto: ");
                    cod = s.nextInt();
                    System.out.print("Quantidade: ");
                    qtd = s.nextInt();

                    produtos[cod - 1].repor(qtd);
            
                default:
                    break;
            }
        }

        s.close();
    }
}
