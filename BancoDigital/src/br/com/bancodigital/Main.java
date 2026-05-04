package br.com.bancodigital;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Ingrid");

        Conta cc = new ContaCorrente(1, 1001, cliente);
        Conta poupanca = new ContaPoupanca(1, 2001, cliente);

        cc.depositar(500);
        cc.transferir(200, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}