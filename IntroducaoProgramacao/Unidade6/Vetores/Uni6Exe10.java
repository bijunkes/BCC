package Unidade6.Vetores;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtde;
        do {
            System.out.print("Informe a quantidade de elementos: ");
            qtde = s.nextInt();

            if (qtde < 1 || qtde > 50) {
                System.out.println("Quantidade inválida");
            }
        } while (qtde < 1 || qtde > 50);

        int[] valores = new int[qtde];

        System.out.println(
                "Opções:\n1 - Incluir valor\n2 - Pesquisar valor\n3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores\n8 - Sair do sistema");

        int opc;

        for (int i = 0; i < qtde; i++) {
            System.out.print("\nInforme a opção desejada: ");
            opc = s.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Informe o valor a ser incluído: ");
                    valores[i] = s.nextInt();
                    break;

                case 2:
                    System.out.print("Informe o valor a ser pesquisado: ");
                    int valorProcurado = s.nextInt();

                    boolean encontrado2 = false;
                    for (int j = 0; j < i + 1; j++) {
                        if (valorProcurado == valores[j]) {
                            encontrado2 = true;
                            break;
                        }
                    }

                    if (encontrado2) {
                        System.out.println("Valor consta no vetor");
                    } else {
                        System.out.println("Valor não consta no vetor");
                    }
                    break;

                case 3:
                    System.out.print("Informe o valor a ser alterado: ");
                    int valorAntigo = s.nextInt();

                    boolean encontrado3 = false;

                    for (int j = 0; j < i; j++) {
                        if (valores[j] == valorAntigo) {
                            encontrado3 = true;

                            System.out.print("Informe o novo valor: ");
                            int novoValor = s.nextInt();

                            valores[j] = novoValor;

                            System.out.print("Valor alterado");

                            break;
                        }
                    }

                    if (!encontrado3) {
                        System.out.println("Valor não encontado");
                    }
                    break;

                case 8:
                    System.out.println("Sistema encerrado");
                    i = qtde;
                    break;
                default:
                    break;
            }
        }

        s.close();
    }
}
