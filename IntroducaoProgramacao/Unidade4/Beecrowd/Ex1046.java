package Unidade4.Beecrowd;
import java.util.Scanner;

public class Ex1046 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt(), f = s.nextInt();
        int total = 0;

        if (i == f) {
            total = 24;
        } else if (i < f) {
            total = f - i;
        } else if (i > f) {
            total = 24 - i + f;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");

        s.close();
    }
}
