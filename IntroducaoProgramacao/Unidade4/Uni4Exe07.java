package Unidade4;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com o peso da carta: ");
        int peso = s.nextInt();

        float valorPagar = 0;

        if(peso <= 50) {
            valorPagar = 0.45f;
        } else {
            float pesoExcedido = peso - 50;
            float qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo: " + valorPagar);

        s.close();
    }
}
