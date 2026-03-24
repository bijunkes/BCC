package Unidade4;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Dia do vencimento: ");
        int dv = s.nextInt();

        System.out.println("Dia do pagamento");
        int dp = s.nextInt();

        System.out.println("Valor da prestação");
        int vp = s.nextInt();

        if(dp <= dv) {
            System.out.println("O pagamento está em dia. Valor da prestação = R$" + vp * 0.9);
        }
        else if(dp + 5 <= dp) {
            System.out.println("O pagamento está atrasado há menos de 5 dias. Valor da prestação = R$" + vp);
        }
        else if(dp + 5 > dp) {
            int multa = ((dp - dv) * 2);
            System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" + (vp + multa));
        }

        s.close();
    }
}
