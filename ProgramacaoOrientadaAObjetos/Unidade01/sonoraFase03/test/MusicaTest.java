import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MusicaTest {

    // PL01 Validar Musica.getDuracaoFormatada() com diferentes durações em segundos
    @Test
    @DisplayName("Duração com minutos e segundos")
    void testeGetDuracaoFormatada125s() {
        Musica musica = new Musica("Título Qualquer", "Artista Qualquer", 125);
        assertEquals("02:05", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Duração redonda em minutos")
    void testeGetDuracaoFormatada90s() {
        Musica musica = new Musica("Título Qualquer", "Artista Qualquer", 90);
        assertEquals("01:30", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Menos de um minuto, com zero à esquerda")
    void testeGetDuracaoFormatada5s() {
        Musica musica = new Musica("Título Qualquer", "Artista Qualquer", 5);
        assertEquals("00:05", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Dois dígitos nos minutos")
    void testeGetDuracaoFormatada600s() {
        Musica musica = new Musica("Título Qualquer", "Artista Qualquer", 600);
        assertEquals("10:00", musica.getDuracaoFormatada());
    }

    @Test
    @DisplayName("Valor logo abaixo de dez minutos")
    void testeGetDuracaoFormatada599s() {
        Musica musica = new Musica("Título Qualquer", "Artista Qualquer", 599);
        assertEquals("09:59", musica.getDuracaoFormatada());
    }

    // PL02 Validar construtor de Musica com dados inválidos
    @Test
    @DisplayName("Título vazio deve ser rejeitado")
    void testeConstrutorMusicaTituloVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Musica("", "Queen", 355);
        });
    }

    @Test
    @DisplayName("Título nulo deve ser rejeitado")
    void testeConstrutorMusicaTituloNulo() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Musica(null, "Queen", 355);
        });
    }

    @Test
    @DisplayName("Artista vazio deve ser rejeitado")
    void testeConstrutorMusicaArtistaVazio() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Musica("Bohemian Rhapsody", "", 355);
        });
    }

    @Test
    @DisplayName("Duração zero deve ser rejeitada")
    void testeConstrutorMusicaDuracaoZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Musica("Bohemian Rhapsody", "Queen", 0);
        });
    }

    @Test
    @DisplayName("Duração negativa deve ser rejeitada")
    void testeConstrutorMusicaDuracaoNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Musica("Bohemian Rhapsody", "Queen", -5);
        });
    }

    @Test
    @DisplayName("Dados válidos criam a música")
    void testeConstrutorMusicaDadosValidos() {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
        assertEquals("Bohemian Rhapsody", musica.getTitulo());
        assertEquals("Queen", musica.getArtista());
        assertEquals(355, musica.getDuracaoSegundos());
        assertTrue(musica.getId() > 0);
    }

    // PL07 - Musica.reproduzir()
    @Test
    @DisplayName("Reproduzir música uma vez")
    void testeReproduzirMusicaUmaVez() {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);

        musica.reproduzir();
        assertEquals(1, musica.getReproducoes());
    }

    @Test
    @DisplayName("Reproduzir música duas vezes")
    void testeReproduzirMusicaDuasVez() {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);

        musica.reproduzir();
        musica.reproduzir();
        assertEquals(2, musica.getReproducoes());
    }

    @Test
    @DisplayName("Reproduzir música várias vezes")
    void testeReproduzirMusicaVariassVezes() {
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);
        assertEquals(0, musica.getReproducoes());

        for (int i = 0; i < 5; i++) {
            musica.reproduzir();
        }
        assertEquals(5, musica.getReproducoes());
    }

    // PL08 - Bônus - Contadores de ID
    @Test
    @DisplayName("IDs de músicas são sequenciais")
    void testeContadorIdMusica() {
        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 355);
        Musica musica2 = new Musica("Stairway to Heaven", "Led Zeppelin", 482);
        Musica musica3 = new Musica("Hotel California", "Eagles", 390);

        assertEquals(1, musica1.getId());
        assertEquals(2, musica2.getId());
        assertEquals(3, musica3.getId());
    }

    @Test
    @DisplayName("IDs de usuários são independentes dos IDs de músicas")
    void testeContadorIdUsuarioseMusicas() {
        Usuario usuario1 = new Usuario("Bianca", "bianca@email.com");
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 355);

        assertEquals(1, usuario1.getId());
        assertEquals(1, musica.getId());
    }

    @Test
    @DisplayName("Criar novas músicas após usuários")
    void testeCriarNovasMusicasAposUsuarios() {
        Usuario usuario1 = new Usuario("Bianca", "bianca@email.com");
        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", 355);

        Usuario usuario2 = new Usuario("Carlos", "carlos@email.com");
        Musica musica2 = new Musica("Stairway to Heaven", "Led Zeppelin", 482);

        assertEquals(1, usuario1.getId());
        assertEquals(1, musica1.getId());
        
        assertEquals(2, usuario2.getId());
        assertEquals(2, musica2.getId());
    }
}