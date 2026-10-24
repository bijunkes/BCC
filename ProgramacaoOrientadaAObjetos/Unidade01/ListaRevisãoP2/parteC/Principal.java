public class Principal {

    public static void main(String[] args) {

        System.out.println(
                "Itens criados: " + ItemSetup.getTotalItens()
        );

        Cliente cliente = new Cliente(
                "Marina Souza",
                "123.456.789-00"
        );

        Orcamento orcamento = new Orcamento(
                cliente,
                "Blumenau",
                7
        );

        ItemSetup placa = new Peca(
                "Placa de vídeo",
                2500.0,
                1
        );

        ItemSetup monitor = new Peca(
                "Monitor 27 polegadas",
                1200.0,
                3
        );

        ItemSetup montagem = new Montagem(
                "Montagem e cabeamento",
                80.0,
                2
        );

        ItemSetup software = new Software(
                "Sistema operacional",
                300.0,
                2
        );

        orcamento.adicionarItem(placa);
        orcamento.adicionarItem(monitor);
        orcamento.adicionarItem(montagem);
        orcamento.adicionarItem(software);

        System.out.println(
                "Solicitante: "
                        + orcamento.getSolicitante().getNome()
        );

        System.out.println(
                "Entrega: " + orcamento.getCidadeEntrega()
                        + ", em " + orcamento.getPrazoEntrega()
                        + " dias"
        );

        for (ItemSetup item : orcamento.getItens()) {
            System.out.println(item);
        }

        System.out.println(
                "Valor total: R$ " + orcamento.calcularValorTotal()
        );

        System.out.println(
                "Garantia estendida: R$ "
                        + orcamento.calcularTotalGarantia()
        );

        try {
            orcamento.adicionarItem(placa);
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            ItemSetup montagemInvalida = new Montagem(
                    "Montagem inválida",
                    80.0,
                    0
            );
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(
                "Itens criados: " + ItemSetup.getTotalItens()
        );
    }
}

/*
    Por que o contador termina em 4, mesmo existindo somente 3 itens válidos?
    A montagem inválida chama super(descricao, precoBase) primeiro.
    O construtor de ItemSetup valida o preço e incrementa totalItens.
    Depois, o construtor de Montagem valida as horas e lança a exceção.
    Portanto, o código 4 já foi consumido quando a validação das horas falha.

    Na A1, a validação do setor ocorria no próprio construtor Senha,
    antes de incrementar o contador. Aqui, a validação que falha está
    na subclasse, depois da execução bem-sucedida do construtor da
    superclasse. Por isso, a posição da validação faz diferença.

    ---

    Se a garantia não chegar a R$ 951,00 após adicionar Software,
    isso indica que o instanceof está verificando uma classe concreta,
    como Peca, em vez da interface ComGarantia.

    O correto é usar:
    if (item instanceof ComGarantia) {
        total += ((ComGarantia) item).calcularGarantiaEstendida();
    }

    Assim, qualquer classe que implemente ComGarantia, incluindo
    Peca e Software, terá sua garantia calculada sem precisar
    alterar o código de Orcamento.
*/