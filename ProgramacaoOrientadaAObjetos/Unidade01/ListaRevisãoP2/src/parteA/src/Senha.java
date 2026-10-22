public class Senha {

    private int numero;
    private String setor;
    private static int totalEmitidas = 0;

    public Senha(String setor) {

        if (setor == null || setor.trim().isEmpty()) {
            throw new IllegalArgumentException("Setor obrigatório");
        }

        this.setor = setor;

        totalEmitidas++;
    }

    public int getNumero() {
        return numero;
    }

    public String getSetor() {
        return setor;
    }

    public static int getTotalEmitidas() {
        return totalEmitidas;
    }

    @Override
    public String toString() {
        return
                "Emitidas: " + totalEmitidas +
                "1 - Caixa\n2 - Gerência\n3 - Caixa";
    }

}
