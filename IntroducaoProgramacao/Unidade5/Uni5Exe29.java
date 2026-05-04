package Unidade5;

import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor: ");
        int valor = s.nextInt();

        int c20 = 0, c10 = 0, c5 = 0, c2 = 0, c1 = 0;

        while(valor > 0){
            if (valor >= 20) {
                valor -= 20;
                c20++;
            } else if (valor >= 10) {
                valor -= 10;
                c10++;
            } else if (valor >= 5) {
                valor -= 5;
                c5++;
            } else if (valor >= 2) {
                valor -= 2;
                c2++;
            } else {
                valor -= 1;
                c1++;
            }
        }

        System.out.println("Cédulas necessárias:");
        System.out.println("20: " + c20);
        System.out.println("10: " + c10);
        System.out.println("5: " + c5);
        System.out.println("2: " + c2);
        System.out.println("1: " + c1);

        s.close();
    }
}
