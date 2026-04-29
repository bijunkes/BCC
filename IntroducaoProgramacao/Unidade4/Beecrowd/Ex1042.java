package Unidade4.Beecrowd;
import java.util.Scanner;

public class Ex1042 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int v1 = s.nextInt(), v2 = s.nextInt(), v3 = s.nextInt();
        int menor = 0, medio = 0, maior = 0;

        if (v1 > v2 && v2 > v3) {
            maior = v1; medio = v2; menor = v3;
        } else if (v1 > v3 && v3 > v2) {
            maior = v1; medio = v3; menor = v2;
        } else if (v2 > v1 && v1 > v3) {
            maior = v2; medio = v1; menor = v3;
        } else if (v2 > v3 && v3 > v1) {
            maior = v2; medio = v3; menor = v1;
        } else if (v3 > v1 && v1 > v2) {
            maior = v3; medio = v1; menor = v2;
        } else if (v3 > v2 && v2 > v1) {
            maior = v3; medio = v2; menor = v1;
        }

        System.out.println(menor);
        System.out.println(medio);
        System.out.println(maior);
        System.out.println();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        s.close();
    }
}
