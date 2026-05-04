package Unidade5;

import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String opcao = "s";
        
        while(opcao.equalsIgnoreCase("s")) {
            System.out.print("Nome do vendedor: ");
            String nome = s.next();

            System.out.print("Quantidade de produtos vendidos: ");
            int n = s.nextInt();

            double totalVendas = 0;

            int i = 0;
            while(i < n) {
                System.out.print("Preço do produto: ");
                double preco = s.nextDouble();

                System.out.print("QUantidade vendida: ");
                int qtde = s.nextInt();

                totalVendas += preco * qtde;
                i++;
            }

            double salario = totalVendas * 0.3;

            System.out.println("Relatório");
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);
            
            System.out.print("Deseja digitar os dados de mais um vendedor (s/n)? ");
            opcao = s.next();
        }
        
        s.close();
    }
}
