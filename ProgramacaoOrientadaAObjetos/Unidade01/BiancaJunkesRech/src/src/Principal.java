public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Bianca", "000000000");
        PacoteViagem pacote = new PacoteViagem(cliente, "Gramado", "Brasil");

        Hospedagem hospedagem = new Hospedagem("Hotel Serra", 300, 3);
        Passeio passeio1 = new Passeio("Tour das vinícolas", 120, 5);
        Passeio passeio2 = new Passeio("Snowland", 200, 2);

        pacote.adicionarServico(hospedagem);
        pacote.adicionarServico(passeio1);
        pacote.adicionarServico(passeio2);

        for (ServicoTuristico servico : pacote.getServicos()) {
            System.out.println(servico);
        }

        System.out.println("\nValor total: R$ " + pacote.calcularValorTotal());
        System.out.println("Total reembolsável: R$ " + pacote.calcularTotalReembolso());

    }

}
