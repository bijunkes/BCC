package Unidade5;
import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma = 0;

        for(int i = 1; i <= 20; i++) {
            System.out.println("Altura da pessoa " + i + ":");
            double altura = s.nextDouble();

            soma += altura;
        }
        
        double media = soma / 20;
        System.out.println("A média das alturas é: " + media);

        s.close();
    }
}
