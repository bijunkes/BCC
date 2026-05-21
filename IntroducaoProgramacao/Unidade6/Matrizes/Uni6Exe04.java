package Unidade6.Matrizes;

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int departamento = 0;
        int funcionario = 0;

        do {
            System.out.print("Informe a quantidade de departamentos: ");
            departamento = s.nextInt();
        } while (departamento <= 0 || departamento > 10);

        do {
            System.out.print("Informe a quantidade de funcionários: ");
            funcionario = s.nextInt();
        } while (funcionario <= 0 || funcionario > 20);

        double salarios[][] = new double[departamento][funcionario];

        for (int lin = 0; lin < salarios.length; lin++) {
            for (int col = 0; col < salarios[lin].length; col++) {
                System.out.print("Informe o salário do funcionário [" + col + "] do departamento [" + lin + "]: ");
                salarios[lin][col] = s.nextDouble();
            }
        }

        System.out.println("----- Maior salário -----");
        double maiorSalario = 0;
        int maiorSalarioDepartamento = 0;
        int maiorSalarioFuncionario = 0;
        for (int lin = 0; lin < salarios.length; lin++) {
            for (int col = 0; col < salarios[lin].length; col++) {
                if (salarios[lin][col] > maiorSalario) {
                    maiorSalario = salarios[lin][col];
                    maiorSalarioDepartamento = lin;
                    maiorSalarioFuncionario = col;
                }
            }
        }
        System.out.println("Departamento: " + maiorSalarioDepartamento + "\nFuncionário: " + maiorSalarioFuncionario + "\nSalário: " + maiorSalario);

        int somaSalariosGeral = 0;
        System.out.println("----- Média salarial por departamento -----");
        for (int lin = 0; lin < salarios.length; lin++) {
            double somaSalariosPorDep = 0;
            for (int col = 0; col < salarios[lin].length; col++) {
                somaSalariosPorDep += salarios[lin][col];
                somaSalariosGeral += salarios[lin][col];
            }

            double mediaSalariosPorDep = somaSalariosPorDep / salarios[lin].length;
            System.out.println("Departamento [" + lin + "]: " + mediaSalariosPorDep);
        }

        double mediaSalariosGeral = somaSalariosGeral / (salarios.length * salarios[0].length);

        System.out.println("----- Quantidade de funcionários acima da média salarial -----");
        int funcionariosAcimaDaMedia = 0;
        for (int lin = 0; lin < salarios.length; lin++) {
            for (int col = 0; col < salarios[lin].length; col++) {
                if (salarios[lin][col] > mediaSalariosGeral) {
                    funcionariosAcimaDaMedia++;
                }
            }
        }
        System.out.println("Média salarial geral: " + mediaSalariosGeral);
        System.out.println("Quantidade funcionários: " + funcionariosAcimaDaMedia);

        s.close();
    }
}
