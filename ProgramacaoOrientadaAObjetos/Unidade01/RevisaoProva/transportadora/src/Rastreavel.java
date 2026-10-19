/** INTERFACE: so assinaturas (+ metodo default com corpo). Variavel do tipo interface pode ser polimorfica. */
public interface Rastreavel {
    String getLocalizacao();

    default String rastrear() {               // default: a classe NAO precisa implementar
        return "Localizacao: " + getLocalizacao();
    }
}
