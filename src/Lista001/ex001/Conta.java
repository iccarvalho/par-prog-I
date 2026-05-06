package Lista001.ex001;

public class Conta {
    public int numeroConta, agencia;
    public String nomeCliente;
    public double saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(double valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depósito concluído!");
        }
    }

    public void sacar(double valor){
        if(this.status && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque concluído!");
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public void encerrarConta(){
        if(this.saldo > 0){
            System.out.println("Você deve sacar todo o valor em depositado antes de encerrar sua conta!");
        } else{
            this.status = false;
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public String toString(){
        return "\nNúmero da conta: " + this.numeroConta +
                "\nAgência: " + this.agencia +
                "\nNome do cliente: " + this.nomeCliente +
                "\nSaldo: " + this.saldo +
                "\nStatus: " + ((this.status) ? "Ativo\n" : "Conta encerrada\n");
    }
}
