package Unidade6.Vetores;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtde;
        do {
            System.out.print("Informe a quantidade de pessoas: ");
            qtde = s.nextInt();

            if (qtde < 1 || qtde > 30) {
                System.out.println("Valor inválido");
            }
        } while (qtde < 1 || qtde > 30);

        String sexos[] = new String[qtde];
        int notas[] = new int[qtde];
        int idades[] = new int[qtde];

        int soma = 0;

        int somaHomens = 0;
        int qtdeHomens = 0;

        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;
        
        for (int i = 0; i < qtde; i++) {
            System.out.print("Informe o sexo (f/m): ");
            sexos[i] = s.next();

            System.out.print("informe a nota (1 a 10): ");
            notas[i] = s.nextInt();

            System.out.print("informe a idade: ");
            idades[i] = s.nextInt();

            soma += notas[i];

            if (sexos[i].equalsIgnoreCase("m")) {
                somaHomens += notas[i];
                qtdeHomens++;
            }

            if (sexos[i].equalsIgnoreCase("f")) {
                if (idades[i] < menorIdadeMulher) {
                    menorIdadeMulher = idades[i];
                    notaMulherMaisJovem = notas[i];
                }
            }
        }

        double media = (double) soma / qtde;
        double mediaHomens = 0;

        if (qtdeHomens > 0) {
            mediaHomens = (double) somaHomens / qtdeHomens;
        }

        int qtdeMulheres50 = 0;
        for (int i = 0; i < qtde; i++) {
            if (sexos[i].equalsIgnoreCase("f") && idades[i] > 50 && notas[i] > media) {
                qtdeMulheres50++;
            }
        }

        System.out.println("Nota média geral: " + media);
        System.out.println("Nota média atribuída por homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Quantidade de mulheres com mais de 50 anos deram nota superior a média: " + qtdeMulheres50);

        s.close();
    }
}
