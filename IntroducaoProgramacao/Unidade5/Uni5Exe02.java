package Unidade5;

public class Uni5Exe02 {
    public static void main(String[] args) {
        int pares = 0;
        int impares = 0;
        for(int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                pares += i;
            } else {
                impares += i;
            }
        }
        System.out.println("Soma dos números pares: " + pares);
        System.out.println("Soma dos números ímpares: " + impares);
    }
}
