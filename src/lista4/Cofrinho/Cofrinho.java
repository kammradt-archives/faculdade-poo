package lista4.Cofrinho;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList moedas;

    public Cofrinho() {
        this.moedas = new ArrayList();
    }

    public void addMoeda(Moeda moeda) {
        this.moedas.add(moeda);
    }


    public Double calculaTotal() {
        Double soma = 0.0;
        for (Object moeda : this.moedas) soma += ((Moeda) moeda).getValor();

        return soma;
    }

    public int quantasMoedas(){
        return this.moedas.size();
    }

    public String verificarMaior(){
        Moeda maior = new Moeda(0.0,"Teste");
        for (Object m : moedas) {
            Moeda moeda = (Moeda) m;
            if (moeda.getValor() > maior.getValor()){
                maior = moeda;
            }
        }
        return maior.getNome();
    }

}



