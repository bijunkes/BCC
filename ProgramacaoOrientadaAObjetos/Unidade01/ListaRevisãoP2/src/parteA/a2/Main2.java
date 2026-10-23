public static void main(String[] args) {

    ArrayList<Midia2> catalogo = new ArrayList<>();

    Midia2 f = new Filme("Interestelar", 20.0);
    Midia2 s = new Serie("Dark", 15.0, 3);
    Midia2 d = new Documentario("Planeta Terra", 200.0, 1);

    catalogo.add(f);
    catalogo.add(s);
    catalogo.add(d);

    double totalLegenda = 0;
    for (Midia2 m : catalogo) {
        if (m instanceof Legendavel) {
            totalLegenda += ((Legendavel) m).calcularCustoLegenda();

        }
    }

    System.out.println(totalLegenda);

}