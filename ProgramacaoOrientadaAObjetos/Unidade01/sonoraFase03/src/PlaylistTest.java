import org.junit.jupiter.api.*;

public class PlaylistTest {

    private Usuario usuario;
    private Playlist playlist;
    private Musica musica1;
    private Musica musica2;
    private Musica musica3;

    @BeforeEach
    void configurarCenario() {
        usuario = new Usuario("Bianca", "bianca@email.com");
        playlist = new Playlist("Minha Playlist", usuario);

        musica1 = new Musica("Bohemian Rhapsody", "Queen", 355);
        musica2 = new Musica("Here Comes the Sun", "The Beatles", 185);
        musica3 = new Musica("Another Brick in the Wall", "Pink Floyd", 210);

        playlist.adicionar(musica1);
        playlist.adicionar(musica2);
        playlist.adicionar(musica3);
    }    

    // PL03 - Playlist.adicionar(música)
    @Test
    @DisplayName("Adicionar música em playlist vazia")
    void testeAdicionarMusica() {
        Playlist playlistVazia = new Playlist("Playlist Vazia", usuario);

        Musica musica = new Musica("Imagine", "John Lennon", 183);

        assertTrue(playlistVazia.adicionar(musica));
        assertEquals(1, playlistVazia.getQuantidade());
    }

    @Test
    @DisplayName("Adicionar música em playlist com espaço")
    void testeAdicionarMusicaPlaylistVaga() {
        Musica musica4 = new Musica("Imagine", "John Lennon", 183);

        assertTrue(playlist.adicionar(musica4));
        assertEquals(4, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Tentar adicionar música com playlist cheia")
    void testeAdicionarMusicaPlaylistCheia() {
        for (int i = 4; i <= 100; i++) {
            Musica musica = new Musica(
                "Música " + i,
                "Artista " + i,
                200
            );

            assertTrue(playlist.adicionar(musica));
        }

        Musica musicaExtra = new Musica(
            "Música Extra",
            "Artista Extra",
            200
        );

        assertFalse(playlist.adicionar(musicaExtra));
        assertEquals(100, playlist.getQuantidade());
    }

    // PL04 - Playlist.getNaPosicao(indice)
    @Test
    @DisplayName("Buscar música na primeira posição")
    void testeBuscarPrimeiraMusica() {
        assertEquals(musica1, playlist.getNaPosicao(0));
    }

    @Test
    @DisplayName("Buscar posição com índice negativo")
    void testeBuscarIndiceNegativo() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            playlist.getNaPosicao(-1);
        });
    }

    @Test
    @DisplayName("Buscar posição além da quantidade")
    void testeBuscarIndiceAlemQuantidade() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            playlist.getNaPosicao(3);
        });
    }

    // PL05 - Playlist.removerNaPosicao(indice)
    @Test
    @DisplayName("Remover música de uma posição válida")
    void testeRemoverMusica() {
        playlist.removerNaPosicao(1);

        assertEquals(musica3, playlist.getNaPosicao(1));
        assertEquals(2, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Remover a primeira música")
    void testeRemoverMusicaPrimeiraPosicao() {
        playlist.removerNaPosicao(0);

        assertEquals(musica2, playlist.getNaPosicao(0));
        assertEquals(2, playlist.getQuantidade());
    }

    @Test
    @DisplayName("Remover usando índice negativo")
    void testeRemoverIndiceNegativo() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            playlist.removerNaPosicao(-1);
        });
    }

    @Test
    @DisplayName("Remover usando índice além da quantidade")
    void testeRemoverIndiceAlemQuantidade() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            playlist.removerNaPosicao(3);
        });
    }
    
}