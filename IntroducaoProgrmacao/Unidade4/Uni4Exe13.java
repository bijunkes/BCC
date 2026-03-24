package Unidade4;
import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informa as 3 cartas:");
        int c1 = s.nextInt(), c2 = s.nextInt(), c3 = s.nextInt();
        
        int qtCartasBoas = 0;

        if(c1 == 1 || c1 ==  2 || c1 == 3) {
            qtCartasBoas += 1;
        }
        if(c2 == 1 || c2 == 2 || c2 == 3) {
            qtCartasBoas += 1;
        }
        if(c3 == 1 || c3 == 2 || c3 == 3) {
            qtCartasBoas += 1;
        }

        if(qtCartasBoas == 1) {
            System.out.println("TRUCO");
        }
        else if(qtCartasBoas == 2) {
            System.out.println("SEIS");
        }
        else if(qtCartasBoas == 3) {
            System.out.println("NOVE");
        }

        s.close();
    }
}
