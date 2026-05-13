package Unidade6;
import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] valores = new double[12];
        double soma = 0;

        System.out.println("Digite " + valores.length + " valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor [" + i + "]: ");
            double valor = s.nextDouble();
            valores[i] = valor;

            soma += valor;
        }

        double media = soma / valores.length;
        System.out.println("Média: " + media);

        System.out.println("Valores maiores que a média: ");
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }

        s.close();
    }
}
