public static void main(String[] args) {

    System.out.println("Emitidas: " + Senha.getTotalEmitidas());

    Senha s1 = new Senha("Caixa");
    Senha s2 = new Senha("Gerência");
    Senha s3 = new Senha("Caixa");

    try {
        Senha invalida = new Senha("");
    } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    }

    Senha s4 = new Senha("Caixa");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);

    System.out.println("Emitidas: " + Senha.getTotalEmitidas());
}