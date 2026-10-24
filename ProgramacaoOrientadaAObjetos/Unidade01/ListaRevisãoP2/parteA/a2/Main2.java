public static void main(String[] args) {

    ArrayList<Midia> catalogo = new ArrayList<>();

    Midia f = new Filme("Interestelar", 20.0);
    Midia s = new Serie("Dark", 15.0, 3);
    Midia d = new Documentario("Planeta Terra", 18.0);

    catalogo.add(f);
    catalogo.add(s);
    catalogo.add(d);

    double totalLegenda = 0;
    for (Midia m : catalogo) {
        if (m instanceof Serie) {
            totalLegenda += ((Serie) m).calcularCustoLegenda();

        }
    }
    System.out.println("Total: " + totalLegenda);

    totalLegenda = 0;
    for (Midia m : catalogo) {
        if (m instanceof Legendavel) {
            totalLegenda += ((Legendavel) m).calcularCustoLegenda();

        }
    }
    System.out.println("Total: " + totalLegenda);

    /*
    a) Por que declarar as variáveis como Midia?
    É aplicado o conceito do polimorfismo, código passa a depender da classe
    abstrata Midia, e não das classes concretas. Assim podemos trocar a
    implementação (Filme, Serie, Documentario etc.) sem alterar o restante do código.

    b) O documentário entrou no total usando o código do colega?
    Não. O código verifica apenas m instanceof Serie.
    Como Documentario não é Serie, mesmo implementando Legendavel, ele fica
    de fora da soma.

    c) Como corrigir?
    O instanceof deve usar a interface m instanceof Legendavel.
    O cast também deve ser para a interface (Legendavel) m.
    Assim qualquer classe que implemente Legendavel entra no cálculo.
    */

}