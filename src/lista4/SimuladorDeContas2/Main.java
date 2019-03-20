package lista4.SimuladorDeContas2;

public class Main {
    public static void main(String[] args) {
        Cliente vini = new Cliente("Vini", "09933322277");
        ContaPoupanca cp = new ContaPoupanca(0, 1000., vini, 500.);
        System.out.println(cp.getSaldo());
        cp.reajustarSaldo();
        System.out.println(cp.getSaldo());

        Cliente kamm = new Cliente("Kamm", "349857834523");
        ContaInvestimento ci = new ContaInvestimento(1, 2000., kamm, 4, 2);
        System.out.println(ci.getSaldo());
        ci.reajustarSaldo();
        System.out.println(ci.getSaldo());


    }

}
