package lista1;

public class Pessoa {
    private String nome;
    private int idade;
    private Double peso;
    private Double altura;

    public Pessoa(String _nome, int _idade, Double _peso, Double _altura) {
        this.nome   = _nome;
        this.idade  = _idade;
        this.peso   = _peso;
        this.altura = _altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void envelhecer() {
        this.idade++;
        if (this.idade < 21) {
            crescer();
        }
    }

    public void engordar(Double pesoEngordado) {
        this.peso += pesoEngordado;
    }

    public void emagrecer(Double pesoPerdido) {
        this.peso += pesoPerdido;
    }

    private void crescer() {
        this.altura += 0.05;
    }

}
