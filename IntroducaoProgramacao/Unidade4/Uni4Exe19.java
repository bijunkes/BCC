package Unidade4;
import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("x = ");
        int x = s.nextInt();

        System.out.println("y = ");
        int y = s.nextInt();

        if(x == 0 && y == 0) {
            System.out.println("Quandrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else {
            System.out.println("Quadrante 4");
        }

        s.close();
    }
}
