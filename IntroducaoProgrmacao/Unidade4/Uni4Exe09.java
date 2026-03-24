package Unidade4;
import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor 1: ");
        int v1 = s.nextInt();


        System.out.println("Valor 2: ");
        int v2 = s.nextInt();

        if(v1 % v2 == 0) {
            System.out.println("Os valores são múltiplos");
        } else {
            System.out.println("Os valores não são múltiplos");
        }

        s.close();
    }
}
