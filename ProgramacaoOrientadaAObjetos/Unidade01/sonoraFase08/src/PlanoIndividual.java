public class PlanoIndividual extends PlanoPago {

    private double precoMensal;

    public PlanoIndividual(double precoMensal) {
        super("Individual", 1, precoMensal);
    }

    @Override
    public double calcularMensalidade() {
        return precoMensal;
    }

    // Caso eu levar o metodo calcularMensalidade() para
    // a superclasse, aplicando o processo de generalização
    // a classe Plano Individual não irá possuir membro algum,
    // então esta classe pode se promovida para ser superclasse
    // das demais classes.
}