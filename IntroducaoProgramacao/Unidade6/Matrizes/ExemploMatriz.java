package Unidade6.Matrizes;

import java.util.Scanner;

public class ExemploMatriz {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);

        System.out.print("Imforme a quantidade de alunos da turma: ");
        int qtdeAlunos = s.nextInt();

        System.out.print("Informe a quantidade de notas: ");
        int qtdeNotas = s.nextInt();

        int[][] notas = new int[qtdeAlunos][qtdeNotas];

        for (int lin = 0; lin < notas.length; lin++) {
            for (int col = 0; col < notas[lin].length; col++) {
                System.out.print("Informe a nota [" + col + "] do aluno [" + lin + "]: ");
                notas[lin][col] = s.nextInt();
            }
        }

        int somaGeral = 0;

        for (int aluno = 0; aluno < notas.length; aluno++) {
            int somaAluno = 0;

            for (int nota = 0; nota < notas[aluno].length; nota++) {
                int notaAluno = notas[aluno][nota];
                somaAluno += notaAluno;
                somaGeral += notaAluno;
            }

            int media = somaAluno / notas[aluno].length;
            System.out.println("A média do aluno [" + aluno + "]: " + media);
        }

        int mediaGeral = somaGeral / (notas.length * notas[0].length);
        System.out.println("A média geral da turma é: " + mediaGeral);
        
        s.close();
    }
}
