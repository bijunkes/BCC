package Unidade5;

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String nomes18 = "";
        int nomes20 = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String nome = s.next();

            System.out.print("Idade: ");
            int idade = s.nextInt();

            if (idade == 18) {
                if (nomes18.isEmpty()) {
                    nomes18 = nome;
                } else {
                    nomes18 += " e " + nome;
                }
            }

            if (idade > 20) {
                nomes20++;
            }
        }

        System.out.println("\nNomes dos alunos que tem 18 anos: " + nomes18);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + nomes20);

        s.close();
    }
}
