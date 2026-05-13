package Unidade6;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Informe tamanho do vetor: ");
        int v = s.nextInt();

        if (v > 20) {
            System.out.print("Valor excedente");
        } else {
            int[] valores = new int[v];

            for (int i = 0; i < valores.length; i++) {

                boolean repetido = false;

                do {
                    repetido = false;

                    System.out.print("Informe um valor [" + i + "]: ");
                    int valor = s.nextInt();

                    for (int j = 0; j < i; j++) {
                        if (valor == valores[j]) {
                            System.out.print("Valor repetido. ");
                            repetido = true;
                            break;
                        }
                    }

                    if (!repetido) {
                        valores[i] = valor;
                    }

                } while (repetido);
            }

            System.out.println("Valores do vetor em ordem crescente: ");
            for (int i = 0; i < valores.length - 1; i++) {
                for (int j = 0; j < valores.length - 1 - i; j++) {
                    if (valores[j] > valores[j + 1]) {
                        int troca = valores[j];
                        valores[j] = valores[j + 1];
                        valores[j + 1] = troca;
                    }
                }
            }

            for (int i = 0; i < valores.length; i++) {
                System.out.println(valores[i]);
            }
        }

        s.close();
    }
}
