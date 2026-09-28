public class Musica {

    private static int contador = 1;


    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducoes;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título da música não pode ser nulo ou vazio.");
        }
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do artista não pode ser nulo ou vazio.");
        }
        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException("A duração da música deve ser maior que zero.");
        }
        this.id = contador++;
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
    }

    public static void resetarIds() {
        contador = 1;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }
    
    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes += 1;
    }

    public String getDuracaoFormatada() {
        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

}
