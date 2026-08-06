public class Pessoa {

    String nome;
    double altura;
    double peso;

    public double calcularImc(double a, double p) {
        return p / (a * a);
    }

    String
     exibirInformacoes() {
        return "Nome: " + nome + "\nAltura: " + altura + "\nPeso: " + peso;
    }

}
