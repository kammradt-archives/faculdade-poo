package lista2.SimuladorPessoas;

public class Rica extends PessoaListaDois{
    private Double dinheiro;

    public Rica(String nome, int idade, Double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public void fazCompras(){
        System.out.println("Adoro fazer compras");
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
