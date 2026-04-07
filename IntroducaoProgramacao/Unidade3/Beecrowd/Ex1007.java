package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int A = s.nextInt(), B = s.nextInt(), C = s.nextInt(), D = s.nextInt();
        
        int diferenca = A * B - C * D;
        
        System.out.println("DIFERENCA = " + diferenca);
        
        s.close();
    }
}
