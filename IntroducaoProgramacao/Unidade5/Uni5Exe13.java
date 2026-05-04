package Unidade5;

import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Número total de reabastecimentos: ");
        int n = s.nextInt();

        float totalQ = 0f;

        for(int i = 0; i < n; i++){
            System.out.print("Parada " + n + ": ");

            System.out.print("\nQuilometragem: ");
            int q = s.nextInt();

            System.out.print("Combustível: ");
            int l = s.nextInt();

            int kmPorLitro = q / l;

            System.out.println("Parada " + n + ": " + kmPorLitro + " km por litro");

            totalQ += kmPorLitro;
        }

        float media = totalQ / n;
        System.out.println("Quilometragem média obtida por litro: " + media);

        s.close();
    }
}
