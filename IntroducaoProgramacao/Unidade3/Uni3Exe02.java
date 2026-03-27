package Unidade3;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor do par de sapatos: ");
        double valor = s.nextDouble();

        System.out.println("O valor do desconto é de R$" + (valor * 0.12));
        System.out.println("O preço do par de sapatos com desconto é R$" + (valor * 0.88100));

        s.close();
    }
}
