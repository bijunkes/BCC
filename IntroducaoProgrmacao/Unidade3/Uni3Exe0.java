package Unidade3;

import java.util.Scanner;

public class Uni3Exe0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Valor em dólares recebido pelo cliente:");
        double valor = s.nextDouble();

        System.out.println("Cotação de dólar hoje:");
        double cotacao = s.nextDouble();

        System.out.println("O atendente deve devolver R$" + (valor * cotacao) + " para o cliente");

        s.close();
    }
}
