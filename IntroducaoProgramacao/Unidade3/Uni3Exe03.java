package Unidade3;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Preço do litro de gasolina: ");
        double preco = s.nextDouble();

        System.out.println("Valor do pagamento: ");
        double pagamento = s.nextDouble();

        System.out.println("O motorista conseguiu colocar: " + pagamento / preco + " litros");

        s.close();
    }
}
