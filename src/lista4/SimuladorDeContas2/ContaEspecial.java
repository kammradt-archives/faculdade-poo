package lista4.SimuladorDeContas2;

public class ContaEspecial extends ContaCorrente {

    private Double limite;

    public ContaEspecial(int numero, Double saldo, Cliente cliente, Double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override
    public void creditar(Double valor){
        if ((super.getSaldo() + valor) > this.limite) {
//        if ((super.getSaldo() + valor) > this.limite) {
            System.out.println("ERRO: Impossível creditar. O limite máximo atual é: " + this.limite);
        } else {
            setSaldo(getSaldo() + valor);
            System.out.println("SUCESSO: Valor creditado: "+valor+". Saldo atual: "+ getSaldo());

        }
    }
}
