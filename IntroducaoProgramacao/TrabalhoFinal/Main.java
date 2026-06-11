package TrabalhoFinal;

import TrabalhoFinal.Sala;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        Sala sala = new Sala(10, 10);
        sala.preencher(15);

        int opcao;



        do {
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    sala.exibir();
                    break;
            
                default:
                    break;
            }
        } while (opcao != 0);

        System.out.print("\nAutoatendimento encerrado.");

        s.close();
    }
}
