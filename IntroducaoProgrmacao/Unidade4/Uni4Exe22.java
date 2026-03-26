package Unidade4;
import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int opcao = s.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
        
            case 2:
                System.out.println("Licenciado em Computação");
                break;

            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
        }

        s.close();
    }
}
