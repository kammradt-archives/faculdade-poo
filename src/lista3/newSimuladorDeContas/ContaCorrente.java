package lista3.newSimuladorDeContas;

public class ContaCorrente {
    private int numero;
    private Double saldo;
    private Cliente cliente;

    public ContaCorrente(int numero, Double saldo, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void debitar(Double valor){
        if (this.saldo < valor) {
            System.out.println("ERRO: Impossível debitar. Saldo abaixo do débito. Saldo atual: " + this.saldo);
        } else {
            this.saldo -= valor;
            System.out.println("SUCESSO: Valor debitado: "+valor+". Saldo atual: "+ this.saldo);
        }
    }

    public void creditar(Double valor){
        this.saldo += valor;
        System.out.println("SUCESSO: Valor creditado: "+valor+". Saldo atual: "+ this.saldo);

    }

}
