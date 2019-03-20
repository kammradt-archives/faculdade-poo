package lista4.SimuladorDeContas2;

public class ContaPoupanca extends ContaCorrente {
    private Double saldoMinino;

    public ContaPoupanca(int numero, Double saldo, Cliente cliente, Double saldoMinino) {
        super(numero, saldo, cliente);
        this.saldoMinino = saldoMinino;
    }

    @Override
    public void debitar(Double valor){
        if (super.getSaldo() - valor < this.saldoMinino) {
            System.out.println("ERRO: Impossível debitar. Saldo restante abaixo mínimo.");
        } else {
            super.setSaldo(getSaldo() - valor);
            System.out.println("SUCESSO: Valor debitado: "+valor+". Saldo atual: "+ getSaldo());
        }
    }

    public Double getSaldoMinino() {
        return saldoMinino;
    }
}
