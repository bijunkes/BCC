package Unidade3.Beecrowd;
import java.util.Scanner;

public class Ex1008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int numero = s.nextInt(), horas = s.nextInt();
        float valor = s.nextFloat();
        float salario = horas * valor;
        
        System.out.println("NUMBER = " + numero)        ;
        System.out.printf("SALARY = U$ %.2f\n", salario);
        
        s.close();
    }
}
