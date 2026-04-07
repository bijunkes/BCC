package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valor = s.nextDouble();
        int centavos = (int) (valor * 100.0 + 0.5);

        int qtde100 = centavos / 10000;
        centavos %= 10000;

        int qtde50 = centavos / 5000;
        centavos %= 5000;

        int qtde20 = centavos / 2000;
        centavos %= 2000;

        int qtde10 = centavos / 1000;
        centavos %= 1000;

        int qtde5 = centavos / 500;
        centavos %= 500;

        int qtde2 = centavos / 200;
        centavos %= 200;

        int qtde1 = centavos / 100;
        centavos %= 100;

        int qtde05 = centavos / 50;
        centavos %= 50;

        int qtde025 = centavos / 25;
        centavos %= 25;

        int qtde01 = centavos / 10;
        centavos %= 10;

        int qtde005 = centavos / 5;
        centavos %= 5;

        int qtde001 = centavos;

        System.out.println("NOTAS:");
        System.out.println(qtde100 + " nota(s) de R$ 100.00");
        System.out.println(qtde50 + " nota(s) de R$ 50.00");
        System.out.println(qtde20 + " nota(s) de R$ 20.00");
        System.out.println(qtde10 + " nota(s) de R$ 10.00");
        System.out.println(qtde5 + " nota(s) de R$ 5.00");
        System.out.println(qtde2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(qtde1 + " moeda(s) de R$ 1.00");
        System.out.println(qtde05 + " moeda(s) de R$ 0.50");
        System.out.println(qtde025 + " moeda(s) de R$ 0.25");
        System.out.println(qtde01 + " moeda(s) de R$ 0.10");
        System.out.println(qtde005 + " moeda(s) de R$ 0.05");
        System.out.println(qtde001 + " moeda(s) de R$ 0.01");

        s.close();
    }
}
