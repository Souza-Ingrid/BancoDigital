package br.com.bancodigital;

public abstract class Conta {

    private int agencia;
    private int numeroDaConta;
    private double saldo;
    private Cliente cliente;

    public Conta() {
    }

    public Conta(int agencia, int numeroDaConta, Cliente cliente) {
        this.agencia = agencia;
        this.numeroDaConta = numeroDaConta;
        this.cliente = cliente;
    }

    public void depositar(double valor){
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void transferir(double valor, Conta destino) {
        if (sacar(valor)) {
            destino.depositar(valor);
        }
    }

    public double getSaldo() {
        return saldo;
    }
    public abstract void imprimirExtrato();

    public int getAgencia() {
        return agencia;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Agencia: " + getAgencia());
        System.out.println("Conta: " + getNumeroDaConta());
        System.out.println("Saldo: " + getSaldo());
    }
}

