package Unidade4;
import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char l = s.next().charAt(0);
        l = Character.toUpperCase(l);


        if(l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        };

        s.close();
    }
}
