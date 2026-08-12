public class Pessoa {

    double altura;
    double peso;

    public double calcularImc(double a, double p) {
        return p / (a * a);
    }

}