package Unidade5;

import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, nulos = 0, brancos = 0, total = 0;

        int voto;

        do {
            System.out.print("Digite o voto (1-6, 0 = sair): ");
            voto = s.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                c1++;
            } else if (voto == 2) {
                c2++;
            } else if (voto == 3) {
                c3++;
            } else if (voto == 4) {
                c4++;
            } else if (voto == 5) {
                nulos++;
            } else if (voto == 6) {
                brancos++;
            } else {
                System.out.println("Inválido");
                continue;
            }
            total++;

        } while(true);

        if (total > 0) {
            double percNulos = nulos * 100.0 / total;
            double percBrancos = brancos * 100.0 / total;

            System.out.println("Resultado");
            System.out.println("Candidato 1: " + c1);
            System.out.println("Candidato 2: " + c2);
            System.out.println("Candidato 3: " + c3);
            System.out.println("Candidato 4: " + c4);
            System.out.println("Votos nulos: " + nulos);
            System.out.println("Votos em branco: " + brancos);
            System.out.println("Percentual nulos: " + percNulos + "%");
            System.out.println("Percentual brancos: " + percBrancos + "%");
        } else {
            System.out.println("Nenhum voto registrado.");
        }

        s.close();
    }
}
