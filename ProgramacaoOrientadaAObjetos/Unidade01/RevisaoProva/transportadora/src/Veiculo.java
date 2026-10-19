/**
 * CLASSE ABSTRATA: nao pode ser instanciada (new Veiculo() NAO compila).
 * Tem atributos, metodos prontos e metodo abstrato. Implementa a interface Rastreavel (realizacao: ..|>).
 * GENERALIZACAO: o que Caminhao e Moto tem em comum foi movido para ca.
 */
public abstract class Veiculo implements Rastreavel {
    private String placa;                     // private: subclasse NAO acessa direto
    private double kmRodados;

    public Veiculo(String placa) {            // construtor COM parametro (sem construtor padrao!)
        this.placa = placa;
    }

    public String getPlaca() { return placa; }
    public double getKmRodados() { return kmRodados; }

    // PROTECTED (# no UML): acessivel pela classe, pelo pacote e pelas SUBCLASSES
    protected void setKmRodados(double km) {
        if (km < 0) throw new IllegalArgumentException("Km invalido");
        this.kmRodados = km;
    }

    public void rodar(double km) {
        setKmRodados(kmRodados + km);
    }

    public abstract double calcularFrete(double km);   // abstrato: sem corpo, subclasse concreta DEVE implementar

    @Override
    public String getLocalizacao() { return "Patio"; }

    // Metodos da classe Object sobrescritos
    @Override
    public String toString() { return "Veiculo[" + placa + ", " + kmRodados + "km]"; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Veiculo)) return false;
        return placa.equals(((Veiculo) o).placa);
    }

    @Override
    public int hashCode() { return placa.hashCode(); }
}
