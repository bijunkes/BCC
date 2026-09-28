import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Plataforma plataforma = new Plataforma();
        
        Musica m1 = null;
        Musica m2 = null;
        Musica m3 = null;

        Podcast p1 = null;

        try {
            m1 = new Musica("Would?", "Alice in Chains", 354, "Dirt");
            m2 = new Musica("Man in the Box", "Alice in Chains", 652, "Facelift");
            m3 = new Musica("Rooster", "Alice in Chains", 600,"Dirt");
            p1 = new Podcast("Tudo sobre Alice in Chains", 1800, "Bianca J.", 5);

            plataforma.cadastrarMusica(m1);
            plataforma.cadastrarMusica(m2);
            plataforma.cadastrarMusica(m3);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar músicas: " + e.getMessage());
        }

        // Parte D (Sonora 05)
        System.out.println("DEMONSTRAÇÃO DA HERANÇA");

        m1.reproduzir();
        m2.reproduzir();
        p1.reproduzir();

        System.out.println();

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(p1);

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
        playlistTeste.adicionar(m1);
        playlistTeste.adicionar(m2);
        playlistTeste.adicionar(m3);

        playlistTeste.reproduzirTudo();

        // 4. Pedir getNaPosicao de uma posição que não existe e mostrar que agora vem IndexOutOfBoundsException (tratada), e não null.
        try {
            Musica m = playlistTeste.getNaPosicao(1000);
            m.reproduzir();

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
        Musica buscouNegativo = plataforma.buscarMusica(-1);

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
                    "11 - Sair");
            
            // 7. No menu, digitar uma letra onde se espera um número e mostrar que o programa avisa e pede de novo, sem cair.
            try {
                System.out.print("Escolha uma opção: ");
                opcao = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida. Digite apenas números.");
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

                        if (plataforma.cadastrarMusica(musica)) {
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

                    int idMusica;

                    do {
                        System.out.print("ID da música (0 para finalizar): ");

                        String entrada = s.nextLine();

                            try {
                                idMusica = Integer.parseInt(entrada);

                                if (idMusica != 0) {
                                    Musica buscaMusica = plataforma.buscarMusica(idMusica);

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

                        Musica musicaEncontrada = plataforma.buscarMusica(id);

                        if (musicaEncontrada != null) {
                            System.out.println("Música encontrada:");
                            System.out.println("ID: " + musicaEncontrada.getId());
                            System.out.println("Título: " + musicaEncontrada.getTitulo());
                            System.out.println("Artista: " + musicaEncontrada.getArtista());
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("ID inválido.");
                    }

                    break;

                case 5:
                    System.out.print("Digite o título: ");
                    String tituloBusca = s.nextLine();

                    Musica musicaEncontrada = plataforma.buscarMusica(tituloBusca);

                    if (musicaEncontrada != null) {
                        System.out.println("Música encontrada:");
                        System.out.println("ID: " + musicaEncontrada.getId());
                        System.out.println("Título: " + musicaEncontrada.getTitulo());
                        System.out.println("Artista: " + musicaEncontrada.getArtista());
                    } else {
                        System.out.println("Música não encontrada.");
                    }

                    break;

                case 6:
                    System.out.print("Digite o ID: ");

                    try {
                        int id = Integer.parseInt(s.nextLine());

                        Musica musicaReproduzir = plataforma.buscarMusica(id);

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
                        
                        Musica musicaAcervo = plataforma.buscarMusica(id);

                        if (musicaAcervo != null) {
                            System.out.println(musicaAcervo.getId() +
                            "\n| " + musicaAcervo.getTitulo() +
                            "\n| " + musicaAcervo.getArtista() +
                            "\n| " + musicaAcervo.getDuracaoFormatada() +
                            "\n| " + musicaAcervo.getReproducoes() + " reproduções\n");
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
            
                default:
                    break;
            }

        } while (opcao != 11);

        s.close();

    }    
}
