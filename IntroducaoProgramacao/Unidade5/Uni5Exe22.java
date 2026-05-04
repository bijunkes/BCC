package Unidade5;

public class Uni5Exe22 {
    public static void main(String[] args) {
        double s = 2000.0;
        double aumento = 0.015;
        int a = 1996;

        while(a <= 2026) {
            s += s * aumento;
            aumento *= 2;
            a++;
        }

        System.out.println("Salário atual: " + s);
    }
}
