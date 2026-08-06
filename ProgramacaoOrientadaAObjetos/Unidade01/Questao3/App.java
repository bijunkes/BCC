import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa usuarios[] = new Pessoa[3];

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Pessoa();

            System.out.print("Altura pessoa " + i + ": ");
            usuarios[i].altura = s.nextDouble();

            System.out.print("Peso pessoa " + i + ": ");
            usuarios[i].peso = s.nextDouble();
        }

        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i].calcularImc(usuarios[i].altura, usuarios[i].peso));
        }
    }
    
}
