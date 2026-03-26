package Unidade4;

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int v1 = s.nextInt(), v2 = s.nextInt(), v3 = s.nextInt();
        int opcao = s.nextInt();

        int menor = 0, medio = 0, maior = 0;

        if (v1 < v2 && v2 < v3) {
            menor = v1;
            medio = v2;
            maior = v3;
        }
        else if (v1 < v3 && v3 < v2) {
            menor = v1;
            medio = v3;
            maior = v2;
        } 
        else if (v2 < v1 && v1 < v3) {
            menor = v2;
            medio = v1;
            maior = v3;
        }
        else if (v2 < v3 && v3 < v1) {
            menor = v2;
            medio = v3;
            maior = v1;
        }
        else if (v3 < v1 && v1 < v2) {
            v3 = menor = v3;
            v1 = medio = v1;
            v2 = maior = v2;
        }
        else if (v3 < v2 && v2 < v1) {
            menor = v3;
            medio = v2;
            maior = v1;
        }

        switch (opcao) {
            case 1:
                System.out.println(menor + " " + medio + " " + maior);
                break;

            case 2:
                System.out.println(maior + " " + medio + " " + menor);
                break;

            case 3:
                System.out.println(medio + " " + maior + " " + menor);
                break;
        }

        s.close();
    }
}
