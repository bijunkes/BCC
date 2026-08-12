package ProgramacaoOrientadaAObjetos.Unidade01.Lista02.Questao01;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa usuarios[] = new Pessoa[3];

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Pessoa();

            System.out.print("Nome pessoa " + i + ": ");
            usuarios[i].setNome(s.next());

            System.out.print("Altura pessoa " + i + ": ");
            usuarios[i].setAltura(s.nextDouble());

            System.out.print("Peso pessoa " + i + ": ");
            usuarios[i].setPeso(s.nextDouble());
        }

        for (int i = usuarios.length-1; i >= 0; i--) {
            System.out.println(usuarios[i].exibirInformacoes());
        }
    }
    
}

