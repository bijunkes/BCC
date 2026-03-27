package Unidade4;
import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Idade dos irmãos: ");
        int i1 = s.nextInt(), i2 = s.nextInt(), i3 = s.nextInt();

        if(i1 == i2 && i2 == i3) {
            System.out.println("TRIGÊMEOS");
        } else if (i1 == i2 || i1 == i3 || i2 == i3) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }

        s.close();
    }
}
