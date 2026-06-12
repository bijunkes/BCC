package TrabalhoFinal;

import TrabalhoFinal.Sala;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Sala sala = new Sala(10, 10);
        sala.preencher(15);

        int opcao;

        do {
            System.out.println("\n=== MENU ===\n[1] Ver mapa\n[2] Comprar\n[3] Resumo\n[0]Encerrar\n============\n");
            System.out.print("Opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    sala.exibir();
                    break;

                case 2:
                    int fila, poltrona, tipo;
                    String confirmacao;

                    sala.exibir();

                    System.out.print("Fila: ");
                    fila = s.nextInt();
                    System.out.print("Poltrona: ");
                    poltrona = s.nextInt();
                    System.out.print("Tipo: ");
                    tipo = s.nextInt();

                    if (sala.valdiar_poltrona(fila, poltrona)) {
                        if (tipo == 2) {
                            sala.precos[fila] /= 2;
                        }
                        System.out.print("Poltrona " + sala.descPoltrona[fila] + ". Valor: R$ " + sala.precos[fila] + " Confirma? (S/N): ");
                        confirmacao = s.next();

                        sala.comprar(fila, poltrona, tipo, confirmacao);
                    }
                    break;

                default:
                    break;
            }
        } while (opcao != 0);

        System.out.print("\nAutoatendimento encerrado.");

        s.close();
    }
}
