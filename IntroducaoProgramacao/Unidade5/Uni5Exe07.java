package Unidade5;
import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double menor = 0;

        for(int i = 0; i < n; i++) {
            double r = s.nextDouble();
            if (i == 0) {
                menor = r;
            }
            if (r < menor) {
                menor = r;
            }
        }

        System.out.println("Menor: " + menor);

        s.close();
    }
}
