package lista4.SimuladorDeContas3;

public class ContaPoupanca extends ContaCorrente implements Investimento {
    private Double saldoMinino;

    public ContaPoupanca(int numero, Double saldo, Double saldoMinino) {
        super(numero, saldo);
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
    @Override
    public void reajustarSaldo() {
        setSaldo(getSaldo() * 1.05);
    }
}
