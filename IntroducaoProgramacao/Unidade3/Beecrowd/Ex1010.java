package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int c1 = s.nextInt(), n1 = s.nextInt();
        float v1 = s.nextFloat();
        
        int c2 = s.nextInt(), n2 = s.nextInt();
        float v2 = s.nextFloat();
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", n1 * v1 + n2 * v2);
        
        s.close();
    }
}
