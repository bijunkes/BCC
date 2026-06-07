package Unidade7.Uni7Exe02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pedido[] pedidos = new Pedido[10];
        int totalPedidos = 0;

        int opcao;

        String nomeItem = "";
        double precoUnitario = 0f;
        double total = 0;

        do {
            System.out.println("=== LANCHONETE ===\n1 - Adicionar item\n2 - Ver comanda\n3 - Fechar e pagar");
            System.out.print("Opção: ");
            opcao = s.nextInt();
            System.out.println();

            total = 0;

            for (int i =  0; i < totalPedidos; i++) {
                total += pedidos[i].calcularTotal(pedidos[i].quantidade, pedidos[i].precoUnitario);
            }

            switch (opcao) {
                case 1:
                    System.out.println("=== CARDÁPIO ===\n1 - X-Burger (R$ 18.50)\n2 - X-Salada (R$ 16.00)\n3 - Suco Natural (R$ 8.00)");

                    if (pedidos.length == totalPedidos) {
                        System.out.println("Comanda cheia!");
                    } else {
                        System.out.print("Item: ");
                        int item = s.nextInt();

                        switch (item) {
                            case 1:
                                nomeItem = "X-Burger";
                                precoUnitario = 18.50;
                                break;

                            case 2:
                                nomeItem = "X-Salada";
                                precoUnitario = 16.00;
                                break;

                            case 3:
                                nomeItem = "Suco Natural";
                                precoUnitario = 8.00;
                                break;
                        
                            default:
                                break;
                        }

                        System.out.print("Quantidade: ");
                        int quantidade = s.nextInt();

                        pedidos[totalPedidos] = new Pedido(nomeItem, quantidade, precoUnitario);

                        System.out.println("Adicionado!\n");

                        totalPedidos++;
                    }
                    break;

                case 2:
                    System.out.println("=== COMANDA ===");
                    for (int i = 0; i < totalPedidos; i++) {
                        System.out.println(pedidos[i].nomeItem + " x" + pedidos[i].quantidade + " = R$ " + pedidos[i].calcularTotal(pedidos[i].quantidade, pedidos[i].precoUnitario));
                        System.out.println("TOTAL: R$ " + total + "\n");
                    }
                    break;
            
                default:
                    break;
            }

        } while (opcao != 3);

        System.out.println("Total a pagar: R$ " + total + "\nObrigado, volte sempre!");

        s.close();
    }
}
