package Unidade5;

import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int num = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        s.close();
    }
}
