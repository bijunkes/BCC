package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1015 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        float x1 = s.nextFloat(), y1 = s.nextFloat(), x2 = s.nextFloat(), y2 = s.nextFloat();
        float dif1 = x2 - x1;
        float dif2 = y2 - y1;
        double distancia = Math.sqrt(Math.pow(dif1, 2) + Math.pow(dif2, 2));
        
        System.out.printf("%.4f\n", distancia);
        
        s.close();
    }
}
