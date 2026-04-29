package Unidade5;
import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int j = 8;

        for(int i = 0; i < n; i++){
            System.out.println(j);
            System.out.println(j + 2);
            j *= 2;
        }

        s.close();
    }
}
