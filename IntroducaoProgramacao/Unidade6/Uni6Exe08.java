package Unidade6;

import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int v;

        do {
            System.out.print("Informe tamanho do vetor: ");
            v = s.nextInt();

            if (v < 1 || v > 20) {
                System.out.println("Valor inválido");
            }
        } while (v < 1 || v > 20);

        double[] valores = new double[v];

        for (int i = 0; i < v; i++) {
            System.out.print("Informe um valor [" + i + "]: ");
            valores[i] = s.nextDouble();
        }

        System.out.println("Valor | Quantidade");

        boolean[] contado = new boolean[v];

        for (int i = 0; i < valores.length; i++) {
            if (!contado[i]) {
                int contador = 1;

                for (int j = i + 1; j < v; j++) {
                    if (valores[i] == valores[j]) {
                        contador++;
                        contado[j] = true;
                    }
                }

                System.out.println(valores[i] + "\t" + contador);
            }
        }

        s.close();
    }
}
