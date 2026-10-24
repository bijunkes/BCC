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
        this.numero = totalEmitidas;
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
        return numero + " - " + setor;
    }

    /*
    1. O que precisa ser static e por quê?
    O atributo totalEmitidas precisa ser static porque deve ser compartilhado
    por todas as instâncias da classe Senha, todas as senhas utilizam o
    mesmo contador. Se remover o static, cada objeto terá seu próprio contador.
    Dessa forma, o contador não será compartilhado e as senhas poderão
    receber números repetidos.

    2. Por que getTotalEmitidas() também precisa ser static?
    Para chamar o método diretamente pela classe Senha.getTotalEmitidas().
    Se remover o static do método, essa chamada causará erro de compilação,
    já que métodos não estáticos precisam ser chamados a partir de um objeto.

    3. Em que linha o contador é incrementado e por quê?
    O contador é incrementado na linha totalEmitidas++;
    Essa linha fica depois da validação do setor, pois se o setor for null
    ou vazio, uma exceção será lançada antes do incremento, garantindo que
    uma senha inválida não consuma um número.
    */

}
