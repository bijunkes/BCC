package Unidade4;
import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int d = s.nextInt();

        System.out.println("Digite o mês:");
        int m = s.nextInt();

        System.out.println("Digite o ano:");
        int a = s.nextInt();
        
        if(d > 0 && d < 32 && m > 0 && m < 13 && a > 0) {
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                System.out.println("Válida");
            }
            else if (m != 2 && d < 31) {
                System.out.println("Válida");
            }
            else if (m == 2 && d < 29) {
                System.out.println("Válida");
            }
            else if (d == 29 && a % 4 == 0 && !(a % 100 == 0 && a % 400 != 0)){
                System.out.println("Válida");
            }
            else {
                System.out.println("Não nválida");
            }
        } else {
            System.out.println("Não válida");
        }

        s.close();
    }
}
