package Unidade5;

import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtdeMenor10 = 0;
        int qtdeEntre10 = 0;
        int qtdeMaior20 = 0;

        int totalCompra = 0;
        int totalVenda = 0;
        int totalLucro = 0;

        for(int i = 1; i <= 3; i++) {
            System.out.print("Preço de compra - Produto " + i + ": ");
            int pc = s.nextInt();

            System.out.print("Preço de venda - Produto " + i + ": ");
            int pv = s.nextInt();

            if ((pv - pc) / pc * 100 < 10) {
                qtdeEntre10++;
            } else if ((pv - pc) / pc * 100 >= 10 || (pv - pc) / pc * 100 <= 20) {
                qtdeEntre10++;
            } else if ((pv - pc) / pc * 100 > 20) {
                qtdeMaior20++;
            } 

            totalCompra += pc;
            totalVenda += pv;
            totalLucro += (pv - pc);
        }

        System.out.println("Quantidade de mercadoria com lucro menor que 10%: " + qtdeMenor10);
        System.out.println("Quantidade de mercadoria com lucro entre 10% e 20%: " + qtdeEntre10);
        System.out.println("Quantidade de mercadoria com lucro maior que 20%: " + qtdeMaior20);
        System.out.println("Valor total de compra: R$" + totalCompra);
        System.out.println("Valor total de veneda: R$" + totalVenda);
        System.out.println("Valor total de lucro: R$" + totalLucro);

        s.close();
    }
}
