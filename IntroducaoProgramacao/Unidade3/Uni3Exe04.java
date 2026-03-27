package Unidade3;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nota 1: ");
        double n1 = s.nextDouble();

        System.out.println("Nota 2");
        double n2 = s.nextDouble();

        System.out.println("Nota 3");
        double n3 = s.nextDouble();

        double media = n1 * 0.5 + n2 * 0.3 + n3 * 0.2;
        System.out.println(media);

        s.close();
    }
}
