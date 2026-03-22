package Unidade3;

import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("°C: ");
        double c = s.nextDouble();

        System.out.println(((9.0/5) * c) + 32);

        s.close();
    }
}
