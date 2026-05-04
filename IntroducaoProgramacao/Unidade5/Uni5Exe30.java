package Unidade5;

import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Valor inicial (N): ");
        int n = s.nextInt();

        System.out.print("Decremento (K): ");
        int k = s.nextInt();

        System.out.print("Capacidade da mochila (M): ");
        int m = s.nextInt();

        int atual = n;
        int somaDentro = 0;
        int somaFora = 0;

        System.out.print("\nElementos gerados: ");
        int temp = n;
        while(temp > 0){
            System.out.print(temp + " ");
            temp -= k;
        }

        System.out.print("\nEntraram na mochila: ");
        while(atual > 0){

            if (somaDentro + atual <= m) {
                System.out.print(atual + " ");
                somaDentro += atual;
            } else {
                somaFora += atual;
            }

            atual -= k;
        }

        System.out.println("\nSoma dentro da mochila: " + somaDentro);
        System.out.println("Soma fora da mochila: " + somaFora);

        s.close();
    }
}
