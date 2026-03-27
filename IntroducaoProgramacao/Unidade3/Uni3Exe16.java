package Unidade3;
import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor total da compra: ");
        int valorCompra = s.nextInt();
        
        System.out.println("Valor total dado pelo cliente: ");
        int valorDado = s.nextInt();

        int troco = valorDado - valorCompra;

        int notasCem = troco / 100;
        int notasDez = (troco - 100 * notasCem) / 10;
        int notasUm = troco - 100 * notasCem - 10 * notasDez;
        System.out.println("Quantidade de 100: " + notasCem + "\nQuantidade de 10: " + notasDez + "\nQuantidade de 1: " + notasUm);

        int qtdeNotas = notasCem + notasDez + notasUm;

        System.out.println("O número de notas de troco é: " + qtdeNotas);

        s.close();
    }
}
