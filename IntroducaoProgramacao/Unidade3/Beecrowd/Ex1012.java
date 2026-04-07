package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float A = s.nextFloat(), B = s.nextFloat(), C = s.nextFloat();
        
        System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
        System.out.printf("CIRCULO: %.3f\n", 3.14159 * (C *C));
        System.out.printf("TRAPEZIO: %.3f\n", (A + B) * C / 2);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);
        
        s.close();
    }
}
