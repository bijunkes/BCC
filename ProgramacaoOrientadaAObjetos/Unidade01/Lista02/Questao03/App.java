package ProgramacaoOrientadaAObjetos.Unidade01.Lista02.Questao03;

public class App {
    
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setTitular("Titular01");
        conta01.depositar(1000);
        conta01.depositar(700);
        System.out.println("Saldo Conta01: " + conta01.getSaldo());

        ContaBancaria conta02 = new ContaBancaria();
        conta02.setTitular("Titular02");
        conta02.depositar(5000);
        conta02.sacar(3000);
        System.out.println("Saldo Conta02: " + conta02.getSaldo());

        conta02.transferir(conta01, 1800);
        System.out.println("Saldos após transferência");
        System.out.println(conta01.getTitular() + " -- Saldo: R$" + conta01.getSaldo());
        System.out.println(conta02.getTitular() + " -- Saldo: R$" +conta02.getSaldo());
    }

}
