package Unidade5;

public class Uni5Exe10 {
    public static void main(String[] args) {
        int total = 0;

        for(int i = 0; total < 10; i++){
            int quadrado = i * i;

            int divisor = 1;

            while(divisor <= quadrado) {
                divisor *= 10;
            }

            divisor /= 100;

            if (divisor > 0) {
                int parte1 = quadrado / divisor;
                int parte2 = quadrado % divisor;

                if (parte1 + parte2 == i){
                    System.out.println(parte1 + " + " + parte2 + " = " + i + " -> " + quadrado);
                    total++;
                }
            }
        }
    }
}
