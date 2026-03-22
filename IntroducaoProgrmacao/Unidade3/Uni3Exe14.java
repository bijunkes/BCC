package Unidade3;
import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Distância: ");
        int distancia = s.nextInt();

        System.out.println("Tempo: ");
        int tempo = s.nextInt();

        double velocidade = distancia / tempo;
        double combustivel = distancia / 12.0;

        System.out.println("A velocidade média foi de " + velocidade + " km/h e a quantidade de combustível usado foi de " + combustivel + " litros.");

        s.close();
    }
}
