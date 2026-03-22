package Unidade4;
import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com um caractere: ");
        char caractere = s.next().charAt(0);
        caractere = Character.toUpperCase(caractere);

        if(caractere == 'M') {
            System.out.println("Masculino");
        } else if(caractere == 'F') {
            System.out.println("Feminino");
        } else if(caractere == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }

        s.close();
    }
}
