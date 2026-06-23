package TrabalhoFinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Sala sala = new Sala(10, 10);
        sala.preencher(15);
        sala.calcularTaxaOcupacao();

        System.out.println("============ CineCampus - Totem de Autoatendimento ============");
        System.out.printf("Ingressos vendidos: %d   Bilheteria: R$ %.2f   Ocupacão: %.0f%%\n",
                sala.ingressosVendidos, sala.bilheteria, sala.taxaOcupacao);
        sala.exibirMapa();

        int opcao;

        do {
            System.out.println("\nMenu: [1] Ver mapa [2] Comprar [3] Resumo [0] Encerrar");
            System.out.print("Opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    sala.exibirMapa();
                    break;

                case 2:
                    sala.comprar(s);
                    break;

                case 3:
                    sala.exibirResumo();
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0 && !sala.salaLotada());

        if (sala.salaLotada()) {
            System.out.println("\nSessão lotada. Todas as poltronas foram vendidas.");
        }

        System.out.println("\nAutoatendimento encerrado.");

        sala.exibirMapa();
        sala.exibirResumo();

        s.close();
    }
}
