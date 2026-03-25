package Unidade4;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Notas");
        float n1 = s.nextFloat(), n2 = s.nextFloat(), n3 = s.nextFloat(), ex = s.nextFloat();

        float media = (n1 + n2 * 2 + n3 * 3 + ex) / 7;

        if(media >= 9.0) {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: A. Aprovado");
        } else if(media >= 7.5 && media < 9.0) {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: B. Aprovado");
        } else if(media >= 6.0 && media < 7.5) {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: C. Aprovado");
        } else if(media >= 4.0 && media < 6.0) {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: D. Reprovado");
        } else {
            System.out.println("A média de aproveitamento foi: " + media + ". Conceito: E. Reprovado");
        }

        s.close();
    }
}
