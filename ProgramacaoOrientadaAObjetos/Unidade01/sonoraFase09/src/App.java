import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Plataforma plataforma = new Plataforma();
        ArrayList<Playlist> playlists = new ArrayList<>();

        Conteudo c = new Podcast(
                "Tecnologia Hoje",
                1800,
                "Bianca",
                1
        );
        // Tipo estático: Conteudo.
        // Tipo dinâmico: Podcast.
        // c.getApresentador();
        // Não compila porque getApresentador() existe em Podcast,
        // mas não está declarado na classe Conteudo.
        plataforma.cadastrarConteudo(c);

        Anuncio anuncio = new Anuncio(
                "Torrefacao Serrana",
                "Cafe da Serra",
                15,
                20.0
        );

        plataforma.cadastrarAnuncio(anuncio);
        
        Musica m1 = null;
        Musica m2 = null;
        Musica m3 = null;
        Podcast p1 = null;

        try {
            m1 = new Musica("Would?", "Alice in Chains", 354, "Dirt");
            m2 = new Musica("Man in the Box", "Alice in Chains", 652, "Facelift");
            m3 = new Musica("Rooster", "Alice in Chains", 600, "Dirt");

            p1 = new Podcast(
                    "Tudo sobre Alice in Chains",
                    1800,
                    "Bianca J.",
                    5
            );

            plataforma.cadastrarConteudo(m1);
            plataforma.cadastrarConteudo(m2);
            plataforma.cadastrarConteudo(m3);
            plataforma.cadastrarConteudo(p1);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar conteúdos: " + e.getMessage());
        }

        // DEMONSTRAÇÃO Instância de Classes Abstratas
        // Conteudo conteudo = new Conteudo("teste", 0);
        // java: Conteudo is abstract; cannot be instantiated
        // Plano plano = new Plano("teste", 0);
        // java: Plano is abstract; cannot be instantiated
        // PlanoPago planoPago = new PlanoPago("teste", 0, 0);
        // java: PlanoPago is abstract; cannot be instantiated

        System.out.println("DEMONSTRAÇÃO DA HERANÇA");

        m1.reproduzir();
        m1.reproduzir();

        m2.reproduzir();
        m2.reproduzir();
        m2.reproduzir();

        p1.reproduzir();
        p1.reproduzir();

        System.out.println();

        System.out.println(m1.getCreditos());
        System.out.println("Reproduções: " + m1.getReproducoes());

        System.out.println();

        System.out.println(m2.getCreditos());
        System.out.println("Reproduções: " + m2.getReproducoes());

        System.out.println();

        System.out.println(p1.getCreditos());
        System.out.println("Reproduções: " + p1.getReproducoes());

        // 1. Tentar cadastrar uma música com título vazio e mostrar que a IllegalArgumentException foi lançada e tratada (o programa avisa e continua vivo).
        try {
            Musica m4 = new Musica("", "X", 100, "Álbum X");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar música: " + e.getMessage());
        }

        // 2. Tentar cadastrar uma música com duração zero ou negativa e mostrar o mesmo comportamento. 
        try {
            Musica m5 = new Musica("Y", "Z", -5, "Álbum Y");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar música: " + e.getMessage());
        }

        Usuario u1 = null;
        Usuario u2 = null;

        try {
            u1 = new Usuario("Fulano", "fulano@email.com");
            u2 = new Usuario("Ciclano", "ciclano@email.com");

            plataforma.cadastrarUsuario(u1);
            plataforma.cadastrarUsuario(u2);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar usuários: " + e.getMessage());
        }

        // 3. Tentar cadastrar um usuário com e-mail sem @ e mostrar a exceção sendo tratada.
        try {
            Usuario u3 = new Usuario("Beltrano", "beltranoemail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar usuário: " + e.getMessage());
        }

        Playlist playlistTeste = new Playlist("Alice in Chains", u1);

        // DEMONSTRAÇÃO FASE 09: polimorfismo, interfaces e receita
        System.out.println("\nDEMONSTRAÇÃO DO POLIMORFISMO E DAS INTERFACES");

        u2.assinar(new PlanoIndividual(19.90));

        Playlist mista = new Playlist("Mista", u1);
        mista.adicionar(m1);
        mista.adicionar(p1);
        mista.adicionar(m2);
        mista.adicionar(m3);

        System.out.println("Duração total da playlist mista: "
                + mista.getDuracaoTotalSegundos() + "s");

        System.out.println("\nReproduzindo a playlist mista (sem anúncios):");
        mista.reproduzirTudo();

        System.out.printf("%nReceita mensal ANTES: R$ %.2f%n",
                plataforma.calcularReceitaMensal());

        System.out.println("\nTocando para o usuário gratuito (u1):");
        plataforma.tocarPlaylist(u1, mista);

        System.out.printf("%nReceita mensal DEPOIS: R$ %.2f%n",
                plataforma.calcularReceitaMensal());

        System.out.println("\nTocando para o usuário Individual (u2), sem anúncios:");
        plataforma.tocarPlaylist(u2, mista);

        playlistTeste.adicionar(m1);
        playlistTeste.adicionar(m2);
        playlistTeste.adicionar(m3);

        playlistTeste.reproduzirTudo();

        // 4. Pedir getNaPosicao de uma posição que não existe e mostrar que agora vem IndexOutOfBoundsException (tratada), e não null.
        try {
            Conteudo c1 = playlistTeste.getNaPosicao(1000);
            c1.reproduzir();

        } catch (NumberFormatException e) {
            System.out.println("A posição precisa ser um número.");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Essa posição não existe na playlist.");
        }

        try {
            playlistTeste.removerNaPosicao(-1);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro ao remover música: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        // 5. Encher a playlist e tentar adicionar a 101a, mostrando que adicionar ainda devolve false (isto continua sendo retorno, não exceção). 
        Playlist playlistLimite = new Playlist("Teste limite", u1);

        for (int i = 0; i < 100; i++) {
            playlistLimite.adicionar(m1);
        }

        boolean adicionou101 = playlistLimite.adicionar(m1);

        System.out.println("Tentativa de adicionar a 101ª música: " + adicionou101);

        // 6. Buscar uma música por um id que não existe e mostrar que ainda vem null (também continua retorno). 
        Conteudo buscouNegativo = plataforma.buscarConteudo(-1);

        System.out.println("Tentativa de buscar música com id -1: " + buscouNegativo);

        int opcao = 0;

        do {

            System.out.println(
                    "\n===== SONORA =====\n" +
                    "1 - Cadastrar música manualmente\n" +
                    "2 - Cadastrar usuário\n" +
                    "3 - Criar playlist e adicionar músicas\n" +
                    "4 - Buscar música por id\n" +
                    "5 - Buscar música por título\n" +
                    "6 - Reproduzir uma música\n" +
                    "7 - Listar acervo\n" +
                    "8 - Seguir usuário\n" +
                    "9 - Deixar de seguir usuário\n" +
                    "10 - Listar quem um usuário segue\n" +
                    "11 - Trocar de plano\n" +
                            "12 - Cadastrar anúncio\n" +
                            "13 - Adicionar podcast a uma playlist\n" +
                            "14 - Tocar playlist para um usuário\n" +
                            "15 - Listar episódios por apresentador\n" +
                            "16 - Exibir receita mensal\n" +
                            "17 - Sair");
            
            // 7. No menu, digitar uma letra onde se espera um número e mostrar que o programa avisa e pede de novo, sem cair.
            try {
                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite apenas números.");
                opcao = 0;
                continue; // Volta direto ao menu
            } finally {
                System.out.println("-------------------");
            }
            // 9. Mostrar o finally executando tanto num caso de sucesso quanto num caso de erro. 

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = s.nextLine();

                    System.out.print("Artista: ");
                    String artista = s.nextLine();

                    System.out.print("Duração em segundos: ");
                    String entradaDuracao = s.nextLine();

                    System.out.print("Álbum: ");
                    String album = s.nextLine();

                    // 8. Disparar um bloco com múltiplos catch e provocar duas exceções diferentes para mostrar cada catch agindo.
                    try { 
                        int duracao = Integer.parseInt(entradaDuracao);

                        Musica musica = new Musica(titulo, artista, duracao, album);

                        if (plataforma.cadastrarConteudo(musica)) {
                            System.out.println("Música cadastrada com sucesso.");
                        } else {
                            System.out.println("Não foi possível cadastrar a música.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("A duração precisa ser um número.");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao cadastrar música: " + e.getMessage());
                    }
                    break;
                
                case 2:
                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Email: ");
                    String email = s.nextLine();

                    try {
                        Usuario usuario = new Usuario(nome, email);

                        if (plataforma.cadastrarUsuario(usuario)) {
                            System.out.println("Usuário cadastrado com sucesso.");
                        } else {
                            System.out.println("Não foi possível cadastrar o usuário.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Nome da playlist: ");
                    String nomePlaylist = s.nextLine();

                    Playlist playlist = new Playlist(nomePlaylist, u1);
                    playlists.add(playlist);

                    int idMusica;

                    do {
                        System.out.print("ID da música (0 para finalizar): ");

                        String entrada = s.nextLine();

                            try {
                                idMusica = Integer.parseInt(entrada);

                                if (idMusica != 0) {
                                    Conteudo buscaMusica = plataforma.buscarConteudo(idMusica);

                                    if (buscaMusica != null) {
                                        if (playlist.adicionar(buscaMusica)) {
                                            System.out.println("Música adicionada com sucesso.");
                                        } else {
                                            System.out.println("Não foi possível adicionar a música à playlist.");
                                        }
                                    } else {
                                        System.out.println("Música não encontrada.");
                                    }
                                }

                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números.");
                                idMusica = -1;
                            }

                    } while (idMusica != 0);

                    System.out.println("\n===== Playlist =====");
                    System.out.println("Nome: " + playlist.getNome());
                    System.out.println("Dono: " + playlist.getDono().getNome());
                    System.out.println("Quantidade: " + playlist.getQuantidade());
                    System.out.println("Duração total: " + playlist.getDuracaoTotalSegundos() + " segundos");

                    break;

                case 4:
                    System.out.print("Digite o ID: ");

                    try {
                        int id = Integer.parseInt(s.nextLine());

                        Conteudo musicaEncontrada = plataforma.buscarConteudo(id);

                        if (musicaEncontrada != null) {
                            System.out.println("Conteúdo encontrado:");
                            System.out.println("ID: " + musicaEncontrada.getId());
                            System.out.println("Título: " + musicaEncontrada.getTitulo());

                            if (musicaEncontrada instanceof Musica) {
                                Musica musica = (Musica) musicaEncontrada;
                                System.out.println("Artista: " + musica.getArtista());
                            } else if (musicaEncontrada instanceof Podcast) {
                                Podcast podcast = (Podcast) musicaEncontrada;
                                System.out.println("Apresentador: " + podcast.getApresentador());
                                System.out.println("Episódio: " + podcast.getNumeroEpisodio());
                            }
                        } else {
                            System.out.println("Conteúdo não encontrado.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido.");
                    }

                    break;

                case 5:
                    System.out.print("Digite o título: ");
                    String tituloBusca = s.nextLine();

                    Conteudo conteudoEncontrado = plataforma.buscarConteudo(tituloBusca);

                    if (conteudoEncontrado != null) {
                        System.out.println("ID: " + conteudoEncontrado.getId());
                        System.out.println("Título: " + conteudoEncontrado.getTitulo());

                        if (conteudoEncontrado instanceof Musica) {
                            Musica musica = (Musica) conteudoEncontrado;
                            System.out.println("Artista: " + musica.getArtista());
                            System.out.println("Álbum: " + musica.getAlbum());

                        } else if (conteudoEncontrado instanceof Podcast) {
                            Podcast podcast = (Podcast) conteudoEncontrado;
                            System.out.println("Apresentador: " + podcast.getApresentador());
                            System.out.println("Episódio: " + podcast.getNumeroEpisodio());
                        }
                    } else {
                        System.out.println("Conteúdo não encontrado.");
                    }
                    break;

                case 6:
                    System.out.print("Digite o ID: ");

                    try {
                        int id = Integer.parseInt(s.nextLine());

                        Conteudo musicaReproduzir = plataforma.buscarConteudo(id);

                        if (musicaReproduzir != null) {
                            musicaReproduzir.reproduzir();

                            System.out.println("Reproduzindo: " + musicaReproduzir.getTitulo());

                            System.out.println("Reproduções: " + musicaReproduzir.getReproducoes());
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido.");
                    }

                    break;

                case 7:
                    System.out.println("\n===== Acervo =====");

                    for (int id = 0; id <= 500; id++) {

                        Conteudo conteudoEncontrado2 = plataforma.buscarConteudo(id);

                        if (conteudoEncontrado2 != null) {
                            System.out.println("ID: " + conteudoEncontrado2.getId());
                            System.out.println("Título: " + conteudoEncontrado2.getTitulo());

                            if (conteudoEncontrado2 instanceof Musica) {
                                Musica musica = (Musica) conteudoEncontrado2;
                                System.out.println("Artista: " + musica.getArtista());
                                System.out.println("Álbum: " + musica.getAlbum());

                            } else if (conteudoEncontrado2 instanceof Podcast) {
                                Podcast podcast = (Podcast) conteudoEncontrado2;
                                System.out.println("Apresentador: " + podcast.getApresentador());
                                System.out.println("Episódio: " + podcast.getNumeroEpisodio());
                            }
                        } else {
                            System.out.println("Conteúdo não encontrado.");
                        }
                    }

                    break;

                case 8:
                    System.out.print("Digite o ID do usuário que irá seguir: ");

                    try {
                        int idSeguidor = Integer.parseInt(s.nextLine());

                        System.out.print("Digite o ID do usuário que será seguido: ");
                        int idSeguido = Integer.parseInt(s.nextLine());

                        Usuario seguidor = plataforma.buscarUsuario(idSeguidor);
                        Usuario seguido = plataforma.buscarUsuario(idSeguido);

                        if (seguidor == null || seguido == null) {
                            System.out.println("Um ou ambos os usuários não foram encontrados.");
                            break;
                        }

                        try {
                            seguidor.seguir(seguido);
                            System.out.println(
                                    seguidor.getNome() + " agora segue " + seguido.getNome() + "."
                            );
                        } catch (IllegalArgumentException e) {
                            System.out.println("Não foi possível seguir: " + e.getMessage());
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Os IDs precisam ser números.");
                    }

                    break;

                case 9:
                    System.out.print("Digite o ID do usuário: ");

                    try {
                        int idSeguidor = Integer.parseInt(s.nextLine());

                        System.out.print("Digite o ID do usuário que deseja deixar de seguir: ");
                        int idSeguido = Integer.parseInt(s.nextLine());

                        Usuario seguidor = plataforma.buscarUsuario(idSeguidor);
                        Usuario seguido = plataforma.buscarUsuario(idSeguido);

                        if (seguidor == null || seguido == null) {
                            System.out.println("Um ou ambos os usuários não foram encontrados.");
                            break;
                        }

                        seguidor.deixarDeSeguir(seguido);

                        System.out.println(
                                seguidor.getNome() + " deixou de seguir " + seguido.getNome() + "."
                        );

                    } catch (NumberFormatException e) {
                        System.out.println("Os IDs precisam ser números.");
                    }

                    break;

                case 10:
                    System.out.print("Digite o ID do usuário: ");

                    try {
                        int idUsuario = Integer.parseInt(s.nextLine());

                        Usuario usuario = plataforma.buscarUsuario(idUsuario);

                        if (usuario == null) {
                            System.out.println("Usuário não encontrado.");
                            break;
                        }

                        System.out.println("\n===== Usuários seguidos por " + usuario.getNome() + " =====");

                        if (usuario.getQuantidadeSeguindo() == 0) {
                            System.out.println("Este usuário não segue ninguém.");
                        } else {
                            for (int i = 0; i < usuario.getQuantidadeSeguindo(); i++) {
                                Usuario seguido = usuario.getSeguindoNaPosicao(i);

                                System.out.println(
                                        seguido.getId() + " - " + seguido.getNome()
                                );
                            }
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("O ID precisa ser um número.");
                    }

                    break;

                case 11:
                    try {
                        System.out.print("Digite o ID do usuário: ");
                        int idUsuario = Integer.parseInt(s.nextLine());

                        Usuario usuario = plataforma.buscarUsuario(idUsuario);

                        if (usuario == null) {
                            System.out.println("Usuário não encontrado.");
                            break;
                        }

                        System.out.println("\n===== Plano =====");
                        System.out.println("1 - Gratuito");
                        System.out.println("2 - Individual");
                        System.out.println("3 - Família");
                        System.out.println("4 - Ver plano atual");

                        System.out.print("Escolha uma opção: ");
                        int opcaoPlano = Integer.parseInt(s.nextLine());

                        switch (opcaoPlano) {

                            case 1:
                                usuario.assinar(new PlanoGratuito());
                                System.out.println("Plano alterado para Gratuito.");
                                break;

                            case 2:
                                System.out.print("Preço mensal: R$ ");
                                double precoIndividual = Double.parseDouble(s.nextLine());

                                usuario.assinar(new PlanoIndividual(precoIndividual));
                                System.out.println("Plano alterado para Individual.");
                                break;

                            case 3:
                                System.out.print("Preço mensal base: R$ ");
                                double precoFamilia = Double.parseDouble(s.nextLine());

                                System.out.print("Quantidade de membros (1 a 6): ");
                                int membros = Integer.parseInt(s.nextLine());

                                usuario.assinar(new PlanoFamilia(precoFamilia, membros));
                                System.out.println("Plano alterado para Família.");
                                break;

                            case 4:
                                System.out.println("\n===== Plano atual =====");
                                System.out.println(usuario.getPlano().resumo());
                                break;

                            default:
                                System.out.println("Opção de plano inválida.");
                                break;
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Não foi possível alterar o plano: " + e.getMessage());
                    }

                    break;

                case 12:
                    try {
                        System.out.print("Nome do anunciante: ");
                        String anunciante = s.nextLine();

                        System.out.print("Título do anúncio: ");
                        String tituloAnuncio = s.nextLine();

                        System.out.print("Duração em segundos: ");
                        int duracaoAnuncio = Integer.parseInt(s.nextLine());

                        System.out.print("Valor por mil impressões: R$ ");
                        double valorPorMil = Double.parseDouble(s.nextLine());

                        Anuncio novoAnuncio = new Anuncio(
                                anunciante,
                                tituloAnuncio,
                                duracaoAnuncio,
                                valorPorMil
                        );

                        plataforma.cadastrarAnuncio(novoAnuncio);
                        System.out.println("Anúncio cadastrado com sucesso!");

                    } catch (NumberFormatException e) {
                        System.out.println("Duração e valor precisam ser números.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro ao cadastrar anúncio: " + e.getMessage());
                    }
                    break;

                case 13:
                    try {
                        if (playlists.isEmpty()) {
                            System.out.println("Nenhuma playlist cadastrada.");
                            break;
                        }

                        System.out.println("===== Playlists =====");
                        for (int i = 0; i < playlists.size(); i++) {
                            System.out.println(i + " - " + playlists.get(i).getNome());
                        }

                        System.out.print("Índice da playlist: ");
                        int indicePlaylist = Integer.parseInt(s.nextLine());

                        if (indicePlaylist < 0 || indicePlaylist >= playlists.size()) {
                            throw new IllegalArgumentException("Playlist inexistente.");
                        }

                        System.out.print("ID do podcast: ");
                        int idPodcast = Integer.parseInt(s.nextLine());

                        Conteudo conteudo = plataforma.buscarConteudo(idPodcast);

                        if (!(conteudo instanceof Podcast)) {
                            throw new IllegalArgumentException(
                                    "O ID informado não corresponde a um podcast cadastrado."
                            );
                        }

                        Playlist playlistEscolhida = playlists.get(indicePlaylist);

                        if (playlistEscolhida.adicionar(conteudo)) {
                            System.out.println("Podcast adicionado à playlist!");
                        } else {
                            System.out.println("Não foi possível adicionar. A playlist pode estar cheia.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Digite números válidos para o índice e o ID.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 14:
                    try {
                        if (playlists.isEmpty()) {
                            System.out.println("Nenhuma playlist cadastrada.");
                            break;
                        }

                        System.out.print("ID do usuário ouvinte: ");
                        int idOuvinte = Integer.parseInt(s.nextLine());

                        Usuario ouvinte = plataforma.buscarUsuario(idOuvinte);

                        if (ouvinte == null) {
                            throw new IllegalArgumentException("Usuário não encontrado.");
                        }

                        System.out.println("===== Playlists =====");
                        for (int i = 0; i < playlists.size(); i++) {
                            System.out.println(i + " - " + playlists.get(i).getNome());
                        }

                        System.out.print("Índice da playlist: ");
                        int indicePlaylist = Integer.parseInt(s.nextLine());

                        if (indicePlaylist < 0 || indicePlaylist >= playlists.size()) {
                            throw new IllegalArgumentException("Playlist inexistente.");
                        }

                        Playlist playlistEscolhida = playlists.get(indicePlaylist);

                        if (playlistEscolhida.getQuantidade() == 0) {
                            System.out.println("A playlist está vazia.");
                            break;
                        }

                        plataforma.tocarPlaylist(ouvinte, playlistEscolhida);

                    } catch (NumberFormatException e) {
                        System.out.println("Digite números válidos para o ID e o índice.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;

                case 15:
                    System.out.print("Nome do apresentador: ");
                    String apresentador = s.nextLine().trim();

                    if (apresentador.isEmpty()) {
                        System.out.println("O nome do apresentador não pode ficar vazio.");
                        break;
                    }

                    plataforma.listarEpisodiosDe(apresentador);
                    break;

                case 16:
                    System.out.printf(
                            "Receita mensal da plataforma: R$ %.2f%n",
                            plataforma.calcularReceitaMensal()
                    );
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 17);

        s.close();

    }    
}
