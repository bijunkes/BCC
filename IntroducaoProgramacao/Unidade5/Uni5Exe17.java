package Unidade5;

import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int numeroMaisBaixo = 0;
        float alturaMaisBaixo = 0f;

        int numeroMaisAlto = 0;
        float alturaMaisAlto = 0f;

        int qtdeAltura = 0;
        float somaAltura = 0f;

        while(true) {
            System.out.print("Nº de inscrição: ");
            int n = s.nextInt();

            if (n == 0) {
                break;
            }

            System.out.print("Altura: ");
            float a = s.nextFloat();

            if(qtdeAltura == 0) {
                alturaMaisAlto = a;
                alturaMaisBaixo = a;
                numeroMaisAlto = n;
                numeroMaisBaixo = n;
            } else {
                if (a > alturaMaisAlto) {
                    alturaMaisAlto = a;
                    numeroMaisAlto = n;
                }
                if (a <alturaMaisBaixo) {
                    alturaMaisBaixo = a;
                    numeroMaisBaixo = n;
                }
            }

            somaAltura += a;
            qtdeAltura++;
        }

        double media = somaAltura / qtdeAltura;
        System.out.println("O atleta mais baixo tem " + alturaMaisBaixo + "m e o seu número de inscrição é " + numeroMaisBaixo);
        System.out.println("O atleta mais alto tem " + alturaMaisAlto + "m e o seu número de inscrição é " + numeroMaisAlto);
        System.out.println("A altura média do grupo de atletas é: " + media);
        
        s.close();
    }
}
