package lista2.SalariosFuncionarios;

public class Empregado {
    private int codigo;
    private String nome;
    private String email;
    protected Double salario;

    public Empregado(int codigo, String nome, String email, Double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void aumentoSalarial(int percentual){
        this.salario += (this.salario)  * percentual/100;
    }
}
