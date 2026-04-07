package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();

        int valorInicial = valor;

        int qtde100 = valor / 100;
        int qtde50 = valor % 100 / 50;
        int qtde20 = valor % 100 % 50 / 20;
        int qtde10 = valor % 100 % 50 % 20 / 10;
        int qtde5 = valor % 100 % 50 % 20 % 10 / 5;
        int qtde2 = valor % 100 % 50 % 20 % 10 % 5 / 2;
        int qtde1 = valor % 100 % 50 % 20 % 10 % 5 % 2;

        System.out.println(valorInicial);
        System.out.println(qtde100 + " nota(s) de R$ 100,00");
        System.out.println(qtde50 + " nota(s) de R$ 50,00");
        System.out.println(qtde20 + " nota(s) de R$ 20,00");
        System.out.println(qtde10 + " nota(s) de R$ 10,00");
        System.out.println(qtde5 + " nota(s) de R$ 5,00");
        System.out.println(qtde2 + " nota(s) de R$ 2,00");
        System.out.println(qtde1 + " nota(s) de R$ 1,00");

        s.close();
    }
}
