package Unidade6.Vetores;
import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] valores = new double[12];

        System.out.println("Digite " + valores.length + " valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor [" + i + "]: ");
            double valor = s.nextDouble();
            valores[i] = valor;
        }

        for (int i = 0; i < valores.length; i++) {
            if (i % 2 == 0) {
                valores[i] *= 1.02;
            } else {
                valores[i] *= 1.05;
            }
        }

        System.out.println("Valores ajustados:");
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        s.close();
    }
}
