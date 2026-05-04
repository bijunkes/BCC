package Unidade5;

import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int vp = 0;
        int totalDia = 0;

        while(true) {
            System.out.print("\nValor da compra: ");
            int vc = s.nextInt();

            if (vc == 0) {
                break;
            }

            if (vc > 500) {
                vp = vc * 80/100;
            } else if (vc <= 500) {
                vp = vc * 85/100;
            }

            System.out.print("Valor a pagar: R$" + vp);
            
            totalDia += vp;
        }

        System.out.println("O valor total recebido foi de R$" + totalDia);

        s.close();
    }
}
