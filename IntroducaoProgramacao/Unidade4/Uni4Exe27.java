package Unidade4;
import java.util.Scanner;
import java.lang.Math.*;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Hora e Minuto de chegada: ");
        int horaChegada = s.nextInt(), minChegada = s.nextInt();

        System.out.println("Hora e Minuto de saída: ");
        int horaSaida = s.nextInt(), minSaida = s.nextInt();

        int difHora = horaSaida - horaChegada;
        int difMin = minSaida - minChegada;

        int preco = 0;

        switch (difHora) {
            case 0:
                preco = 5;
            case 1, 2:
                if(difMin < 30) {
                    preco = 5;
                } else {
                    preco = 10;
                }
        }

        System.out.println("Preço cobrado = R$" + preco + ",00");

        s.close();
    }
}
