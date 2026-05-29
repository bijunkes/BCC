package Unidade7.Uni7Exe02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pedido[] pedidos = new Pedido[10];
        int totalPedidos = 0;
        int opcao = 0;
        double total = 0;

        System.out.println("=== LANCHONETE ===\r\n" +
                "1 - Adicionar item\r\n" +
                "2 - Ver comanda\r\n" +
                "0 - Fechar e pagar");

        do {
            System.out.print("Opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("1 - X-Burger (R$ 18.50)\r\n" +
                            "2 - X-Salada (R$ 16.00)\r\n" +
                            "3 - Suco Natural (R$ 8.00)");

                    System.out.print("Item: ");
                    int escolha = s.nextInt();
                    System.out.print("Quantidade: ");
                    int qtde = s.nextInt();

                    boolean vazio = false;

                    for (int i = 0; i < pedidos.length; i++) {
                        if (pedidos[i] == null) {
                            vazio = true;
                            break;
                        }
                    }

                    if (vazio) {
                        switch (escolha) {
                            case 1:
                                pedidos[totalPedidos] = new Pedido("X-Burger", qtde, 18.5);
                                break;

                            case 2:
                                pedidos[totalPedidos] = new Pedido("X-Salada", qtde, 16.0);
                                break;

                            case 3:
                                pedidos[totalPedidos] = new Pedido("Suco Natural", qtde, 8.0);
                                break;

                            default:
                                break;
                        }
                    } else {
                        System.out.println("Comanda cheia");
                    }
                    break;

                case 2:
                    System.out.println("=== COMANDA ===");
                    for (int i = 0; i < pedidos.length; i++) {
                        if (pedidos[i].nomeItem != null) {
                            System.out.println(pedidos[i].nomeItem + " x" + pedidos[i].quantidade + " = R$ "
                                    + pedidos[i].precoUnitario);
                            total += pedidos[i].calcularTotal();
                        } else {
                            break;
                        }
                    }
                    System.out.println("TOTAL: R$ " + total);
                    break;

                default:
                    break;
            }
            totalPedidos++;
        } while (opcao != 0 && totalPedidos < 10);
        System.out.println("Total a pagar: R$ " + total);
        System.out.println("Obrigado, volte sempre");
    }
}
