package Unidade6;
import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Integer[] vetor1 = new Integer[10];
        Integer[] vetor2 = new Integer[10];
        Integer[] vetorSoma = new Integer[10];

        System.out.println("Valores:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor 1 - Valor [" + i + "]: ");
            int v1 = s.nextInt();
            vetor1[i] = v1;
            System.out.print("Vetor 2 - Valor [" + i + "]: ");
            int v2 = s.nextInt();
            vetor2[i] = v2;
        }

        for (int i = 0; i < vetorSoma.length; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Soma dos vetores: ");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("[" + vetor1[i] + "] + [" + vetor2[i] + "] = " + vetorSoma[i]);
        }

        s.close();
    }
}
