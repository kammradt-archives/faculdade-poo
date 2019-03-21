package lista4.SimuladorDeContas3;

public class Main {
    public static void main(String[] args) {
        Cliente vini = new Cliente("Vinicius", "1902839120");
        ContaEspecial conta = new ContaEspecial(0, 1000.0, 2200.0);
        ContaInvestimento conta2 = new ContaInvestimento(2, 3000.0, 2, 3);

        vini.addConta(conta);
        vini.addConta(conta2);
        vini.imprimeContas();

        Cliente joao = new Cliente("Joao", "2222222222");
        joao.imprimeContas();
    }
}
