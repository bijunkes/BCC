package Unidade6.Matrizes;
import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int notas[][] = new int[3][5];

        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[lin].length; col++) {
                System.out.print("Nota [" + col + "] do aluno [" + lin + "]: ");
                notas[lin][col] = s.nextInt();
            }
        }

        int somaAluno = 0;
        System.out.println("----- Média por aluno -----");

        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[lin].length; col++) {
                somaAluno += notas[lin][col];
            }
            float mediaAluno = (float) somaAluno / notas[lin].length;
            System.out.println("Média do aluno [" + lin + "]: " + mediaAluno);
            somaAluno = 0;
        }

        int somaProva = 0;
        System.out.println("----- Média por prova -----");

        for (int col = 0; col < notas[0].length; col++) {
            for (int lin = 0; lin < notas.length; lin++) {
                somaProva += notas[lin][col];
            }
            float mediaProva = (float) somaProva / notas.length;
            System.out.println("Média da prova [" + col + "]: " + mediaProva);
            somaProva = 0;
        }

        s.close();
    }
}
