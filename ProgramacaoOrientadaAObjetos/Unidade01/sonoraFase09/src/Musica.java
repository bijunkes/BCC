public class Musica extends Conteudo{

    private String artista;
    private String album;

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

    @Override
    public String getCreditos() {
        return super.getCreditos() + " - " + artista + " (" + album + ")";
    }

}
