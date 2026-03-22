package Unidade4;
import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um número flutuante maior que 0: ");
        float n = s.nextFloat();

        if(n == (int) n) {
            System.out.println("Não possui casas decimais");
        } else {
            System.out.println("Possui casas decimais");
        }

        s.close();
    }
}
