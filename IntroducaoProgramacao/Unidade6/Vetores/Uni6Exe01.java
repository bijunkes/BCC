package Unidade6.Vetores;
import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] valores = new Integer[5];

        System.out.println("Digite " + valores.length + " valores:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor [" + i + "]: ");
            int valor = s.nextInt();
            valores[i] = valor;
        }

        System.out.println("\nOrdem inversa: ");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }

        s.close();
    }
}
