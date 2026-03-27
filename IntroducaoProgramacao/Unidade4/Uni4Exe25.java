package Unidade4;
import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int v1 = s.nextInt(), v2 = s.nextInt();
        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(v1 + v2);
                break;
        
            case 2:
                System.out.println(v1 - v2);
                break;

            case 3:
                System.out.println(v1 * v2);
                break;

            case 4:
                System.out.println(v1 / v2);
                break;
        }

        s.close();
    }
}
