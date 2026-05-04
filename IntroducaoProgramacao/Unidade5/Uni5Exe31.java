package Unidade5;

import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Número: ");
        int n = s.nextInt();

        int divisor = 2;

        while(n > 1){
            if (n % divisor == 0) {
                System.out.println(n + " " + divisor);
                n /= divisor;
            } else {
                divisor++;
            }
        }

        s.close();
    }
}
