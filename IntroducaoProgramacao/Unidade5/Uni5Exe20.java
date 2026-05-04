package Unidade5;

import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float m = s.nextFloat();
        float mi = m;
        int t = 0;

        while(true) {
            if (m < 0.0005) {
                break;
            }

            t += 50;
            m /= 2;
        }

        System.out.println("Massa inicial: " + mi);
        System.out.println("Massa final: " + m);
        System.out.println("Tempo: " + t);
        s.close();
    }
}
