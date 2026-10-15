package src;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale br = new Locale("pt", "BR");
        Scanner teclado = new Scanner(System.in);

        // 1. Cardápio
        ArrayList<ItemCardapio> cardapio = new ArrayList<>();
        Prato hamburguer = new Prato("Hamburguer", 30.0, 'M');
        Bebida refri = new Bebida("Refri", 6.0, 350, false);
        Bebida chopp = new Bebida("Chopp", 12.0, 500, true);
        Sobremesa pudim = new Sobremesa("Pudim", 8.0, 150);

        cardapio.add(hamburguer);
        cardapio.add(refri);
        cardapio.add(chopp);
        cardapio.add(pudim);

        System.out.println("--- CARDÁPIO ---");
        for (int i = 0; i < cardapio.size(); i++) {
            System.out.println(cardapio.get(i));
        }

        // 2. Clientes
        Cliente bianca = new Cliente("Bianca", "bianca@furb.br", 20);
        Cliente felippe = new Cliente("Felippe", "felippe@furb.br", 17, bianca);
        System.out.println("\nSaldo de cashback da Bianca: " + String.format(br, "R$ %.2f", bianca.getSaldoCashback()));

        // 3. Pedido do Felippe com leitura de quantidade
        Pedido pedidoFelippe = new Pedido(felippe);
        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("\nQuantos " + hamburguer.getNome() + " o Felippe quer? ");
                int qtd = teclado.nextInt();
                pedidoFelippe.adicionarItem(hamburguer, qtd);
                ok = true;
                System.out.println(qtd + " item(ns) adicionado(s).");
            } catch (InputMismatchException e) {
                System.out.println("Isso não é um número. Tente de novo.");
                teclado.next();
            } catch (IllegalArgumentException | IllegalStateException e) {
                System.out.println("Quantidade inválida: " + e.getMessage());
            }
        }

        // 4. Chopp para menor
        try {
            pedidoFelippe.adicionarItem(chopp);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // 5. Pedido da Bianca, multi-catch
        Pedido pedidoBianca = new Pedido(bianca);
        try {
            pedidoBianca.adicionarItem(hamburguer, 2);
            pedidoBianca.adicionarItem(pudim);
            pedidoBianca.finalizar();
            System.out.println("Pedido " + pedidoBianca.getNumero() + " finalizado.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        try {
            pedidoBianca.finalizar();
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Erro ao finalizar de novo: " + e.getMessage());
        }

        // 6. Cashback demais
        try {
            bianca.usarCashback(1000.0);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Saldo atual da Bianca: " + String.format(br, "R$ %.2f", bianca.getSaldoCashback()));
        }

        // 7. Cobranças
        CentralCobranca central = new CentralCobranca();
        try {
            central.registrar(new AssinaturaClube(bianca, 19.90, 12));
            central.registrar(pedidoBianca);
            System.out.println("\n=== Relatório ===\n" + central.gerarRelatorio());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        teclado.close();
    }
}
