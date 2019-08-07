package lista2.SimuladorDeContas;

public class ContaPoupanca extends ContaCorrente{
    private Double saldoMinino;

    public ContaPoupanca(int numero, Double saldo, String cliente, Double saldoMinino) {
        super(numero, saldo, cliente);
        this.saldoMinino = saldoMinino;
    }

    @Override
    public void debitar(Double valor){
        if (this.saldo - valor < this.saldoMinino) {
            System.out.println("ERRO: Impossível debitar. Saldo restante abaixo mínimo.");
        } else {
            this.saldo -= valor;
            System.out.println("SUCESSO: Valor debitado: "+valor+". Saldo atual: "+ this.saldo);
        }
    }

    public Double getSaldoMinino() {
        return saldoMinino;
    }
}
