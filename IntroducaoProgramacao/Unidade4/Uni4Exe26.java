package Unidade4;
import java.util.Scanner;
import java.lang.Math.*;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Escolha uma opção: ");
        System.out.println("T: Calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: Calcular a área de um quadrado de lado l");
        System.out.println("R: Calcular a área de um retângulo de base b e altura h");
        System.out.println("C: Calcular a área de um círculo de raio r");
        char opcao = s.next().charAt(0);

        opcao = Character.toUpperCase(opcao);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                int b = s.nextInt();
                int h = s.nextInt();
                System.out.println("Área do triângulo = " + b * h / 2);
                break;
        
            case 'Q':
                System.out.println("Digite o lado: ");
                int l = s.nextInt();
                System.out.println("Área do quadrado: " + l * l);
                break;

            case 'R':
                System.out.println("Digite a base e a altura do retâgulo: ");
                int bb = s.nextInt();
                int hh = s.nextInt();
                System.out.println("Área do triângulo = " + bb * hh);
                break;

            case 'C':
                System.out.println("Digite o raio: ");
                int r = s.nextInt();
                double area = Math.PI * Math.pow(r, 2);
                System.out.printf("Área do círculo = %.2f%n", area);
                break;
        }

        s.close();
    }
}
