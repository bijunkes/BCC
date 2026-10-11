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

        plataforma.cadastrarConteudo(musica1);
        plataforma.cadastrarConteudo(musica2);
    }
    
    // PL06 - Plataforma.buscarConteudo(título) e buscarbuscarConteudo(id)
    @Test
    @DisplayName("Buscar conteúdo cadastrado pelo título")
    void testeBuscarConteudoPorTitulo() {
        Conteudo resultado = plataforma.buscarConteudo("Bohemian Rhapsody");

        assertNotNull(resultado);
        assertEquals(musica1, resultado);
    }

    @Test
    @DisplayName("Buscar conteúdo cadastrado pelo ID")
    void testeBuscarConteudoPorId() {
        Conteudo resultado = plataforma.buscarConteudo(musica1.getId());

        assertNotNull(resultado);
        assertEquals(musica1, resultado);
    }

    @Test
    @DisplayName("Buscar conteúdo por título inexistente")
    void testeBuscarConteudoPorTituloInexistente() {
        Conteudo resultado = plataforma.buscarConteudo("Música Inexistente");

        assertNull(resultado);
    }

    @Test
    @DisplayName("Buscar conteúdo por ID inexistente")
    void testeBuscarConteudoPorIdInexistente() {
        Conteudo resultado = plataforma.buscarConteudo(-1);

        assertNull(resultado);
    }
}
