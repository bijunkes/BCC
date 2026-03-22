package Unidade3;
import java.util.Scanner;

public class Uni3Exe01 {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Largura: ");
        int largura = s.nextInt();

        System.out.println("Comprimento: ");
        int comprimento = s.nextInt();

        System.out.println("Área: " + (largura * comprimento));

        s.close();
    }
}
