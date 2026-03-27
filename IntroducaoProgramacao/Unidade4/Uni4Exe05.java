package Unidade4;
import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("A cor é azul? ");
        boolean resposta = s.nextBoolean();

        if(resposta == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        s.close();
    }
}
