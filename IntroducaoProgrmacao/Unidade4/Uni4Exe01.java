package Unidade4;
import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horaMes = s.nextInt();

        System.out.println("Entre o valor pago por hora: ");
        float horasValor = s.nextFloat();

        float salarioTotal = horaMes * horasValor;

        if(horaMes > 160) {
            float salarioExtra = (horaMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        } 
        
        System.out.println("O salário total é: " + salarioTotal);

        s.close();
    }
}
