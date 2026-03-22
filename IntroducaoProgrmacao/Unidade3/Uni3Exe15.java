package Unidade3;
import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int centenas = n / 100;
        int dezenas = (n - centenas * 100) / 10;
        int unidades = (n - centenas * 100 - dezenas * 10);

        System.out.println(centenas + " centena(S) " + dezenas + " dezena(s) " + unidades + " unidade(s)");

        s.close();
    }
}
