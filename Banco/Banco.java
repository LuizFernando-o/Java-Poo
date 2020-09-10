package p3.banco;

public class Banco {

    private int conta;
    private double saldo;

    public Banco(int conta) {

        this.conta = conta;
        this.saldo = 0;
    }

    public void depositar(double deposito) {

        if (deposito >= 0) {
            this.saldo += deposito;
        }else{
            System.out.println("Deposito negado!");
        }
    }

    public void sacar(double num) {
        if (num > 0 && num <= this.saldo) {
            this.saldo -= num;
        }else{
            System.out.println("Saque negado!");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getConta() {
        return this.conta;
    }

}
