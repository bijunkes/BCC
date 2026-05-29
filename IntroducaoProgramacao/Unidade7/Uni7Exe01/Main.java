package Unidade7.Uni7Exe01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Aluno[] alunos = new Aluno[5];

        System.out.println("=== CADASTRO ===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Aluno " + (i+1) + " - Nome: ");
            String nome = s.next();
            System.out.print("Aluno " + (i+1) + " - Nota: ");
            double nota = s.nextDouble();

            alunos[i] = new Aluno(nome, nota);
        }

        System.out.println("=== RESULTADO ===");
        for (int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i].nome + " - " + alunos[i].nota + " - " + alunos[i].situacao());
        }

        s.close();
    }
}
