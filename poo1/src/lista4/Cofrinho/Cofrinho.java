package lista4.Cofrinho;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Cofrinho {
    private List<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList();
    }

    public void addMoeda(Moeda moeda) {
        this.moedas.add(moeda);
    }

    public Double calculaTotal() {
        return moedas.stream().mapToDouble(Moeda::getValor).sum();
    }

    public int quantasMoedas(){
        return this.moedas.size();
    }

    public String verificarMaior(){
        return moedas.stream().max(comparing(Moeda::getValor)).get().getNome();
    }

}



