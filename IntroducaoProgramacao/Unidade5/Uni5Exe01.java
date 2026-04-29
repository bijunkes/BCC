package Unidade5;
import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 20; i++){
            int numero = s.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

        s.close();
    }
}
