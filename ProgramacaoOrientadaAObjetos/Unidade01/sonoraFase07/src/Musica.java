public class Musica extends  Conteudo{

    private static int contador = 1;

    private String artista;
    private String album;
    private int reproducoes;

    public Musica(String titulo, String artista, int duracaoSegundos, String album) {
        super(titulo, duracaoSegundos);

        setArtista(artista);
        setAlbum(album);
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do artista não pode ser nulo ou vazio.");
        }

        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        if (album == null || album.trim().isEmpty()) {
            throw new IllegalArgumentException("O álbum não pode ser nulo ou vazio.");
        }

        this.album = album;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes += 1;
        super.reproduzir();
    }

    public String getDuracaoFormatada() {
        int minutos = getDuracaoSegundos() / 60;
        int segundos = getDuracaoSegundos() % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

    @Override
    public String toString() {
        return super.toString() + " - " + artista + " (" + album + ")";
    }

}
