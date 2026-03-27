package Unidade3;
import java.util.Scanner;

public class Uni3Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantidade de frangos: ");
        int qtde = s.nextInt();
        System.out.println("O gasto para marcar " + qtde + " é de R$" + qtde * (3.5 * 2 + 4));

        s.close();
    }
}
