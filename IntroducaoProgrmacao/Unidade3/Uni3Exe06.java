package Unidade3;

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Peso: ");
        double peso = s.nextDouble();

        System.out.println("O valor do prato do cliente é R$" + (peso * 25 - 0.75 * 25));

        s.close();
    }
}
