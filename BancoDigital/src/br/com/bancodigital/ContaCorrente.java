package br.com.bancodigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numeroDaConta, Cliente cliente) {
        super(agencia, numeroDaConta, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfosComuns();
    }
}