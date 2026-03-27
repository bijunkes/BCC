package Unidade3;
import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ALtura: ");
        double altura = s.nextDouble();

        System.out.println("Comprimento: ");
        double comprimento = s.nextDouble();

        double gasto = altura * comprimento * 9 * 12.5; 

        System.out.println("O valor final é R$" + gasto);

        s.close();
    }
}
