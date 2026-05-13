package Unidade6;
import java.util.Scanner;

import Unidade4.Beecrowd.a;

public class Uni6Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] moca = new String[5];
        String[] rapaz = new String[5];

        for (int i = 0; i < moca.length; i++) {
            System.out.print("Resposta MOÇA[" + i + "]: ");
            String m = s.next();
            moca[i] = m;
            System.out.print("Resposta RAPAZ[" + i + "]: ");
            String r = s.next();
            rapaz[i] = r;
        }

        int afinidade = 0;
        for (int i = 0; i < moca.length; i++) {
            if (moca[i].equalsIgnoreCase(rapaz[i])) {
                afinidade += 3;
            }
            else if (moca[i].equalsIgnoreCase("SIM") && rapaz[i].equalsIgnoreCase("NAO") ||
                    moca[i].equalsIgnoreCase("NAO") && rapaz[i].equalsIgnoreCase("SIM")) {
                        afinidade -= 2;
            }
            else {
                afinidade++;
            }
        }

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0  && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade <= -10) {
            System.out.println("Vocês se odeiam!");
        }
        s.close();
    }
}
