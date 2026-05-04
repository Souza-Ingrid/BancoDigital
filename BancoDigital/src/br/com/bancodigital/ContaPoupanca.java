package br.com.bancodigital;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numeroDaConta, Cliente cliente) {
        super(agencia, numeroDaConta, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        imprimirInfosComuns();
    }
}