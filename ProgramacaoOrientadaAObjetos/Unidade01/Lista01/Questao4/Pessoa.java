public class Pessoa {

    String nome;
    double altura;
    double peso;

    public double calcularImc() {
        return peso / (altura * altura);
    }

    String exibirInformacoes() {
        return "Nome: " + nome + "\nAltura: " + altura + "\nPeso: " + peso + "\nIMC: " + calcularImc();
    }

}
