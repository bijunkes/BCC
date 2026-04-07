package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();

        int valorHoras = valor / 3600;
        int valorMinutos = valor % 3600 / 60;
        int valorSegundos = valor % 3600 % 60;

        System.out.println(valorHoras + ":" + valorMinutos + ":" + valorSegundos);

        s.close();
    }
}
