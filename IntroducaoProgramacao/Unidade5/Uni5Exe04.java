package Unidade5;

public class Uni5Exe04 {
    public static void main(String[] args) {
        double s = 0.0;
        for(int i = 1; i <= 20; i++) {
            s += (2.0 * i + 1) / (i * (i + 1));
        }
        System.out.println(s);
    }
}
