package Unidade3;

import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Cateto oposto: ");
        double c1 = s.nextDouble();

        System.out.println("Cateto adjacente: ");
        double c2 = s.nextDouble();

        System.out.println("A hipotenusa é: " + (Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2))));

        s.close();
    }
}
