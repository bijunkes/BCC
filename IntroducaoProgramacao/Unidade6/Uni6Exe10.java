package Unidade6;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] valores = new int[50];
        int qtdAtual = 0;

        System.out.println(
                "Opções:\n1 - Incluir valor\n2 - Pesquisar valor\n3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n7 - Inverter valores\n8 - Sair do sistema");

        int opc = 0;

        while (opc != 8) {
            System.out.print("\nInforme a opção desejada: ");
            opc = s.nextInt();

            switch (opc) {
                case 1:
                    if (qtdAtual < 50) {

                        System.out.print("Informe o valor a ser incluído: ");

                        valores[qtdAtual] = s.nextInt();
                        qtdAtual++;

                        System.out.println("Valor incluído");

                    } else {
                        System.out.println("Vetor cheio");
                    }
                    break;

                case 2:
                    System.out.print("Informe o valor a ser pesquisado: ");
                    int valorProcurado = s.nextInt();

                    boolean encontrado2 = false;
                    for (int i = 0; i < qtdAtual; i++) {
                        if (valorProcurado == valores[i]) {
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
                    int valorSerAlterado = s.nextInt();

                    boolean encontrado3 = false;

                    for (int i = 0; i < qtdAtual; i++) {
                        if (valores[i] == valorSerAlterado) {
                            encontrado3 = true;

                            System.out.print("Informe o novo valor: ");
                            int novoValor = s.nextInt();

                            valores[i] = novoValor;

                            System.out.println("Valor alterado");

                            break;
                        }
                    }

                    if (!encontrado3) {
                        System.out.println("Valor não encontado");
                    }
                    break;

                case 4:
                    System.out.print("Informe o valor a ser excluído: ");
                    int valorSerExcluido = s.nextInt();

                    boolean encontrado4 = false;

                    for (int i = 0; i < qtdAtual; i++) {
                        if (valores[i] == valorSerExcluido) {
                            encontrado4 = true;

                            for (int j = i; j < qtdAtual - 1; j++) {
                                valores[j] = valores[j + 1];
                            }

                            valores[qtdAtual - 1] = 0; // Zera último valor do vetor
                            qtdAtual--;

                            System.out.println("Valor excluído");
                            break;
                        }
                    }

                    if (!encontrado4) {
                        System.out.println("Valor não encontado");
                    }
                    break;

                case 5:
                    System.out.println("Valores do vetor:");
                    for (int i = 0; i < qtdAtual; i++) {
                        System.out.print(valores[i] + " ");
                    }
                    break;

                case 6:
                    for (int i = 0; i < qtdAtual; i++) {
                        for (int j = 0; j < qtdAtual - 1 - i; j++) {
                            if (valores[j] > valores[j + 1]) {
                                int troca = valores[j];
                                valores[j] = valores[j + 1];
                                valores[j + 1] = troca;
                            }
                        }
                    }

                    System.out.println("Valores ordenados de forma crescente: ");
                    for (int i = 0; i < qtdAtual; i++) {
                        System.out.print(valores[i] + " ");
                    }
                    break;

                case 7:
                    for (int i = 0; i < qtdAtual; i++) {
                        for (int j = 0; j < qtdAtual - 1 - i; j++) {
                            if (valores[j] < valores[j + 1]) {
                                int troca = valores[j];
                                valores[j] = valores[j + 1];
                                valores[j + 1] = troca;
                            }
                        }
                    }

                    System.out.println("Valores invertidos: ");
                    for (int i = 0; i < qtdAtual; i++) {
                        System.out.print(valores[i] + " ");
                    }
                    break;

                default:
                    break;
            }
        }

        s.close();
    }
}
