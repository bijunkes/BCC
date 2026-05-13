package Unidade6;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int n = s.nextInt();
        double[] valores = new double[n];

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor [" + i + "]: ");
            double valor = s.nextDouble();
            valores[i] = valor;
        }

        System.out.print("Informe valor real: ");
        double valor = s.nextDouble();
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == valor) {
                System.out.println("Valor cadastrado no vetor");
                break;
            }
        }
    }
}
