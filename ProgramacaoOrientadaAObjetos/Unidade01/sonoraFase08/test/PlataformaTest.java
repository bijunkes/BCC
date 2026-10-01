import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlataformaTest {

    private Plataforma plataforma;
    private Musica musica1;
    private Musica musica2;

    @BeforeEach
    void configurarCenario() {
        plataforma = new Plataforma();

        musica1 = new Musica("Bohemian Rhapsody", "Queen", 355, "A Night At The Opera");
        musica2 = new Musica("Stairway to Heaven", "Led Zeppelin", 482, "Led Zeppelin IV");

        plataforma.cadastrarMusica(musica1);
        plataforma.cadastrarMusica(musica2);
    }
    
    // PL06 - Plataforma.buscarMusica(título) e buscarMusicaPorId(id)
    @Test
    @DisplayName("Buscar música cadastrada pelo título")
    void testeBuscarMusicaPorTitulo() {
        Musica resultado = plataforma.buscarMusica("Bohemian Rhapsody");

        assertNotNull(resultado);
        assertEquals(musica1, resultado);
    }

    @Test
    @DisplayName("Buscar música cadastrada pelo ID")
    void testeBuscarMusicaPorId() {
        Musica resultado = plataforma.buscarMusica(musica1.getId());

        assertNotNull(resultado);
        assertEquals(musica1, resultado);
    }

    @Test
    @DisplayName("Buscar música por título inexistente")
    void testeBuscarMusicaPorTituloInexistente() {
        Musica resultado = plataforma.buscarMusica("Música Inexistente");

        assertNull(resultado);
    }

    @Test
    @DisplayName("Buscar música por ID inexistente")
    void testeBuscarMusicaPorIdInexistente() {
        Musica resultado = plataforma.buscarMusica(-1);

        assertNull(resultado);
    }
}
