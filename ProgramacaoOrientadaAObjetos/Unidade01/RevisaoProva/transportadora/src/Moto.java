/** FINAL: classe final NAO pode ser estendida (class X extends Moto NAO compila). */
public final class Moto extends Veiculo {

    public Moto(String placa) { super(placa); }

    @Override
    public double calcularFrete(double km) { return km * 2.5; }

    public String entregaExpressa() { return "Moto " + getPlaca() + " em entrega expressa!"; }

    public void revisao() {
        setKmRodados(0);                       // usa o setter PROTECTED da superclasse
    }
}
