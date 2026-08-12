import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa usuario = new Pessoa();

        System.out.print("Digite sua altura: ");
        usuario.altura = s.nextDouble();

        System.out.print("Digite seu peso: ");
        usuario.peso = s.nextDouble();

        System.out.println("O seu IMC é de " + usuario.calcularImc(usuario.peso, usuario.altura));

    }
}
