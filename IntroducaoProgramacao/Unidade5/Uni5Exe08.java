package Unidade5;
import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int menor = 0;
        int somaP = 0;
        int qtdeP = 0;

        for(int i = 0; i < n; i++){
            int v = s.nextInt();
            if (i == 0) {
                menor = v;
            }
            if (v < menor && v < 0) {
                menor = v;
            }
            if (v > 0) {
                somaP += v;
                qtdeP++;
            }
        }
        float media = somaP / qtdeP;

        System.out.println("Menor valor negativo: " + menor);
        System.out.println("Média dos números positivos: " + media);
        s.close();
    }
}
