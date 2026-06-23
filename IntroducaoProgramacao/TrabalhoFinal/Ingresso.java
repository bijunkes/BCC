package TrabalhoFinal;

public class Ingresso {
    // Atributos
    float precoFinal;
    String tipo;

    //Construtor
    Ingresso(Poltrona poltrona, int tipo) {
        float preco = poltrona.preco;

        if (tipo == 2) {
            precoFinal = preco / 2;
            this.tipo = "Meia-entrada"; // this.tipo para não sobrepor parâmetro do construtor
        } else {
            precoFinal = preco;
            this.tipo = "Inteira";
        }
    }
}
