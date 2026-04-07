package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt(), b = s.nextInt();
        int PROD = a * b;
        
        System.out.println("PROD = " + PROD);
        
        s.close();
    }
}
