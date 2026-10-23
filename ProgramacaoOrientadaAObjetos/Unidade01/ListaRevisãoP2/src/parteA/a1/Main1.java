public static void main(String[] args) {

    System.out.println("Emitidas: " + Senha.getTotalEmitidas());

    Senha s1 = new Senha("Caixa");
    Senha s2 = new Senha("Gerência");
    Senha s3 = new Senha("Caixa");
    // Senha s4e = new Senha(null);
    Senha s4 = new Senha("Caixa");

    System.out.println("Emitidas: " + Senha.getTotalEmitidas());
}