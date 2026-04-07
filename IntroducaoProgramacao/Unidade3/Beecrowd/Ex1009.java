package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String nome = s.next();
        double salario = s.nextDouble(), vendas = s.nextDouble();
        double total = salario + vendas * 0.15;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        s.close();
    }
}
