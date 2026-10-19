public class Main {
    public static void main(String[] args) {

        System.out.println("=== 1. CONSTRUTORES EM CASCATA (Pessoa -> Motorista) ===");
        Motorista joao = new Motorista("Joao", "CNH123");
        Motorista chefe = new Motorista("Carla", "CNH999");

        System.out.println("\n=== 2. ASSOCIACAO 0..1 e REFLEXIVA ===");
        System.out.println(joao.situacao());               // veiculoAtual == null
        joao.setSupervisor(chefe);                         // reflexiva
        System.out.println("Supervisor de Joao: " + joao.getSupervisor());

        System.out.println("\n=== 3. HERANCA + ABSTRATA + INTERFACE ===");
        // Veiculo v = new Veiculo("X");  // ERRO: classe abstrata
        Caminhao cam = new Caminhao("ABC-1234");
        Moto moto = new Moto("MOT-9999");
        joao.setVeiculoAtual(cam);
        System.out.println(joao.situacao());

        System.out.println("\n=== 4. SOBRESCRITA + super + protected ===");
        cam.rodar(100);                                    // Caminhao.rodar -> super.rodar
        moto.rodar(40);
        System.out.println(cam + " | " + moto);            // toString
        moto.revisao();                                    // usa setKmRodados protected
        System.out.println("Moto apos revisao: " + moto.getKmRodados() + "km");
        System.out.println("equals por placa: " + cam.equals(new Caminhao("ABC-1234")));

        System.out.println("\n=== 5. ASSOCIACAO BIDIRECIONAL + ARRAYLIST (limite 0..3) ===");
        Cliente ana = new Cliente("Ana");
        Pacote p1 = new Pacote("Livros", 5);
        Pacote p2 = new Pacote("Notebook", 3);
        ana.adicionarPacote(p1);
        ana.adicionarPacote(p2);
        System.out.println("Remetente do pacote 1: " + p1.getRemetente());
        try {
            cam.embarcar(p1);
            cam.embarcar(p2);
            cam.embarcar(new Pacote("Mesa", 20));
            cam.embarcar(new Pacote("Cadeira", 8));        // 4o pacote -> excecao
        } catch (IllegalStateException e) {
            System.out.println("Erro esperado: " + e.getMessage());
        }

        System.out.println("\n=== 6. AGREGACAO + POLIMORFISMO + INSTANCEOF/DOWNCASTING ===");
        Frota frota = new Frota();
        frota.adicionar(cam);                              // partes ja existiam
        frota.adicionar(moto);
        System.out.println("Frete total 100km: R$ " + frota.calcularFreteTotal(100));
        frota.tratarEspecificos();

        System.out.println("\n=== 7. INTERFACE (variavel polimorfica + default) ===");
        Rastreavel r = cam;                                // variavel do tipo interface
        System.out.println(r.rastrear());                  // default usando getLocalizacao()
        Rastreavel r2 = moto;
        System.out.println(r2.rastrear());

        System.out.println("\n=== 8. COMPOSICAO + DEPENDENCIA ===");
        Entrega entrega = new Entrega("Curitiba", "Sao Paulo", cam, 400);
        System.out.println(new GeradorRecibo().gerar(entrega));
    }
}
