package Unidade3;

import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = s.next();

        System.out.println("Quantidade de horas trabalhadas no mês: ");
        int horas = s.nextInt();

        System.out.println("Número de dependentes: ");
        int dep = s.nextInt();

        double salTrabalho = horas * 10;
        double salBruto = salTrabalho + dep * 60;

        double inss = salTrabalho * 0.085;
        double ir = salTrabalho * 0.05;

        double salLiquido = salTrabalho - inss - ir + dep * 60;

        System.out.println("O funcionário " + nome + " possui um sálario bruto de R$" + salBruto
                + " e um salário líquido de R$" + salLiquido);

        s.close();
    }
}
