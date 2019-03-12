package lista3.newSimuladorDeContas;

//Não entendi absolutamente nada do que é para essa classe fazer, vou fazer igual seu exemplo

import java.time.LocalDate;

public class ContaInvestimento extends ContaCorrente {
        private int diaInvestimento;
        private int periodo;

    public ContaInvestimento(int numero, Double saldo, String cliente, int diaInvestimento, int periodo) {
        super(numero, saldo, cliente);
        this.diaInvestimento = diaInvestimento;
        this.periodo = periodo;
    }

    public void atualizar_saldo(){
        LocalDate hoje = LocalDate.now();
        if (hoje.getDayOfMonth() == (this.diaInvestimento+periodo)){
            setSaldo(getSaldo() * 1.2);
        }
        else {
            System.out.println("Ainda n dia do investimento");
        }
    }

}
