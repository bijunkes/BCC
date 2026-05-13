package Unidade6;
import java.util.Scanner;

/**
 * Sistema de notas de turma;
 * 
 * Crie um programa que:
 * 1. Leia as notas de 10 alunos (vetor de double)
 * 2. Calcule a média da turma
 * 3. Mostre quais alunos ficaram acima da média
 * 4. Mostre a maior e a menor nota
 * 
 * Bônus: Ordene as notas do maior para o menor

*/

public class Uni6Exe00 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double[] notas = new double[3];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota [" + i + "]: ");
            double nota = s.nextDouble();
            notas[i] = nota;

            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Média da turma: " + media);

        System.out.println("Alunos acima a média: ");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("- O aluno [" + i + "] tem nota: " + notas[i]);
            }
        }

        // double maior = Double.MIN_VALUE;
        // double menor = Double.MAX_VALUE;

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                // Ordenação decrescente
                if (notas[j] < notas[j + 1]) {
                    double troca = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = troca;
                }
            }
        }

        System.out.println("Notas ordenadas de forma decrescente: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("- Nota [" + i + "]: " + notas[i]);
        }

        s.close();
    }
}
