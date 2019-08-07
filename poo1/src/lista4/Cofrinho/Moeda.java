package lista4.Cofrinho;

public class Moeda {
    private Double valor;
    private String nome;

    public Moeda(Double valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
