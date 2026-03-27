package Unidade4;
import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int v1 = s.nextInt();

        System.out.println("Valor 2: ");
        int v2 = s.nextInt();

        if(v1 > v2) {
            System.out.println("Maior valor: " + v1);
        } else if(v1 < v2) {
            System.out.println("Maior valor: " + v2);
        } else {
            System.out.println("Valores iguais");
        }

        s.close();
    }
}
