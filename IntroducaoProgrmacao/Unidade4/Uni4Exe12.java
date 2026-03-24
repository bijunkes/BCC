package Unidade4;
import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe os lados do triângulo:");
        int l1 = s.nextInt(), l2 = s.nextInt(), l3 = s.nextInt();
        if(l1 > l2 + l3 || l2 > l1 + l3 || l2 > l1 + l3) {
            if(l1 == l2 && l2 == l3) {
                System.out.println("É equilátero");
            } else if(l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("É isósceles");
            } else {
                System.out.println("É escaleno");
            }
        } else {
            System.out.println("Não formam um triângulo");
        }

        s.close();
    }
}
