package Unidade4.Beecrowd;

public class a {
    public static void main(String[] args) {

        // Cenario A: tipo = 2, valor = 150.0

// Cenario B: tipo = 1, valor = 80.0

int tipo = 1/* veja o cenario */;

double valor = 80.0/* veja o cenario */;

double limite;

String categoria;

 

switch (tipo) {

    case 1: limite = 100.0; categoria = "Basico";  break;

    case 2: limite = 200.0; categoria = "Premium"; break;

    default: limite = 0.0; categoria = "Invalido"; break;

}

 

double uso = (valor / limite) * 100;

 

if (uso >= 90) {

    System.out.println(categoria + ": uso CRITICO (" + uso + "%)");

} else if (uso >= 70) {

    System.out.println(categoria + ": uso ALTO (" + uso + "%)");

} else {

    System.out.println(categoria + ": uso NORMAL (" + uso + "%)");

}
    }
}
