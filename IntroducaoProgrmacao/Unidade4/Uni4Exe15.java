package Unidade4;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantide de meses admitidos:");
        int m = s.nextInt();

        if(m <= 12) {
            System.out.println("O funcionário irá receber 5% de reajuste");
        } else if(m >= 13 && m <= 48) {
            System.out.println("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.println("Reajuste não informado");
        }
        
        s.close();
    }
}
