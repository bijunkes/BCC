package Unidade4;
import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Idade de Marquinho: ");
        int m = s.nextInt();

        System.out.println("Idade de Zezinho: ");
        int z = s.nextInt();

        System.out.println("Idade de Luluzinha: ");
        int l = s.nextInt();


        if(m > l && z > l) {
            System.out.println("Luluzinho é a caçula");
        } else if(m > z && l > z) {
            System.out.println("Zezinho é o caçula");
        } else if(l > m && z > m) {
            System.out.println("Marquinho é caçula");
        }

        s.close();
    }
}
