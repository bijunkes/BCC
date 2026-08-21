package ProgramacaoOrientadaAObjetos.Unidade01.sonoraFase01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Plataforma plataforma = new Plataforma();
        
        Musica m1 = new Musica("Would?", "Alice in Chains", 354);
        Musica m2 = new Musica("Man in the Box", "Alice in Chains", 65);
        Musica m3 = new Musica("Rooster", "Alice in Chains", 600);

        plataforma.cadastrarMusica(m1);
        plataforma.cadastrarMusica(m2);
        plataforma.cadastrarMusica(m3);

        Usuario u1 = new Usuario("Fulano", "fulano@email.com");
        Usuario u2 = new Usuario("Ciclano", "ciclano@email.com");

        plataforma.cadastrarUsuario(u1);
        plataforma.cadastrarUsuario(u2);

        int opcao;

        Playlist playlistTeste = new Playlist("Alice in Chains", u1);
        playlistTeste.adicionar(m1);
        playlistTeste.adicionar(m2);
        playlistTeste.adicionar(m3);

        playlistTeste.reproduzirTudo();

        for (int i = 0; i < playlistTeste.getQuantidade(); i++) {
            Musica musica = playlistTeste.getNaPosicao(i);

            System.out.println(
                musica.getTitulo() +
                ": " +
                musica.getReproducoes() +
                " reproduções"
            );
        }

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
                "8 - Sair");

            if (s.hasNextInt()) {
                opcao = s.nextInt();
                s.nextLine();
            } else {
                System.out.println("Digite apenas números.");
                s.nextLine();
                opcao = -1;
            }

            switch (opcao) {

                case 1:
                    System.out.print("Título: ");
                    String titulo = s.nextLine();

                    System.out.print("Artista: ");
                    String artista = s.nextLine();

                    System.out.print("Duração em segundos: ");
                    int duracao = s.nextInt();

                    Musica musica = new Musica(titulo, artista, duracao);

                    if (plataforma.cadastrarMusica(musica)) {
                        System.out.println("Música cadastrada com sucesso.");
                    } else {
                        System.out.println("Não foi possível cadastrar a música.");
                    }

                    break;
                
                case 2:
                    System.out.print("Nome: ");
                    String nome = s.nextLine();

                    System.out.print("Email: ");
                    String email = s.nextLine();

                    Usuario usuario = new Usuario(nome, email);

                    if (plataforma.cadastrarUsuario(usuario)) {
                        System.out.println("Usuário cadastrado com sucesso.");
                    } else {
                        System.out.println("Não foi possível cadastrar o usuário.");
                    }

                    break;

                case 3:
                    System.out.print("Nome da playlist: ");
                    String nomePlaylist = s.nextLine();

                    Playlist playlist = new Playlist(nomePlaylist, u1);

                    int idMusica;

                    do {
                        System.out.print("ID da música (0 para finalizar): ");

                        if (s.hasNextInt()) {
                            idMusica = s.nextInt();
                            
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
                            
                        } else {
                            System.out.println("Digite apenas números.");
                            s.nextLine();
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

                    if (s.hasNextInt()) {
                        int id = s.nextInt();

                        Musica musicaEncontrada = plataforma.buscarMusica(id);

                        if (musicaEncontrada != null) {
                            System.out.println("Música encontrada:");
                            System.out.println("ID: " + musicaEncontrada.getId());
                            System.out.println("Título: " + musicaEncontrada.getTitulo());
                            System.out.println("Artista: " + musicaEncontrada.getArtista());
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    } else {
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

                    if (s.hasNextInt()) {
                        int id = s.nextInt();

                        Musica musicaReproduzir = plataforma.buscarMusica(id);

                        if (musicaReproduzir != null) {
                            musicaReproduzir.reproduzir();

                            System.out.println("Reproduzindo: " + musicaReproduzir.getTitulo());

                            System.out.println("Reproduções: " + musicaReproduzir.getReproducoes());
                        } else {
                            System.out.println("Música não encontrada.");
                        }
                    } else {
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
            
                default:
                    break;
            }

        } while (opcao != 8);

        s.close();

    }    
}
