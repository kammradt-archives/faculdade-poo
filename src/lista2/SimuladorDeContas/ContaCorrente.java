package lista2.SimuladorDeContas;

public class ContaCorrente {
    private int numero;
    protected Double saldo;
    //private Double saldo;
    private String cliente;

    public ContaCorrente(int numero, Double saldo, String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return this.saldo;
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
