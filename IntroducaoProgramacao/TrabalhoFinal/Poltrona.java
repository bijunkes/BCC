package TrabalhoFinal;

public class Poltrona {
    // Atributos
    String simbolo;
    boolean ocupado;
    float preco;
    String descricao;

    // Construtor
    Poltrona(int fileira, float precoDefinido) {
        simbolo = "-";
        ocupado = false;
        preco = precoDefinido;

        // Define a descrição com base na fileira
        if (fileira <= 1) {
            descricao = "Frente";
        } else if (fileira <= 7) {
            descricao = "Meio";
        } else {
            descricao = "VIP";
        }
    }

    // Método para ocupar poltrona
    void ocupar() {
        ocupado = true;
        simbolo = "#";
    }
}