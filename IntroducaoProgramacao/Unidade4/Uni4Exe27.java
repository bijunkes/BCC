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

        int inicio = horaChegada * 60 + minChegada;
        int fim = horaSaida * 60 + minSaida;

        int tempo = fim - inicio;
        int horas;

        if (tempo < 30) {
            horas = 1;
        } else {
            horas = tempo / 60;
            if (tempo % 60 >= 30) {
                horas++;
            }
        }

        double preco = 0;

        switch (horas) {
            case 1:
                preco = 5.0;
                break;
            case 2:
                preco = 10.0;
                break;
            case 3:
                preco = 17.5;
                break;
            case 4:
                preco = 25.0;
                break;
            default:
                preco = 25.0 + (horas - 4) * 10.0;
                break;
        }

        System.out.println("Preço cobrado = R$" + preco + "0");

        s.close();
    }
}
