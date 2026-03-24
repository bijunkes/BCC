package Unidade4;
import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Idade dos homens:");
        int h1 = s.nextInt(), h2 = s.nextInt();

        System.out.println("Idade das mulheres:");
        int m1 = s.nextInt(), m2 = s.nextInt();

        int soma = 0;
        int prod = 0;

        if(h1 > h2 && m1 < m2) {
            soma = h1 + m1;
        } else if(h1 > h2 && m2 < m1) {
            soma = h1 +  m2;
        } else if(h2 > h1 && m1 < m2) {
            soma = h2 + m1;
        } else {
            soma = h2 + m2;
        }

        if(m1 > m2 && h1 < h2) {
            prod = h1 * m1;
        } else if(m1 > m2 && h2 < h1) {
            prod = m1 *  h2;
        } else if(m2 > m1 && h1 < h2) {
            prod = m2 * h1;
        } else {
            prod = h2 * m2;
        }

        System.out.println("Soma: " + soma + " Produto: " + prod);

        s.close();
    }
}
