package Unidade3;

import java.util.Scanner;
import java.lang.Math;

public class Uni3Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Raio: ");
        double raio = s.nextDouble();

        System.out.println("Altura: ");
        double altura = s.nextDouble();

        System.out.println("O volume da lata de óleo é: " + (Math.PI * Math.pow(raio, 2) * altura));

        s.close();
    }
}
