package lista3.ClassesAbstratas;

public abstract class FuncionarioAbs {
    private String nome;
    private double salario;

    public FuncionarioAbs(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    abstract void aumentaSalario();

    @Override
    public String toString() {
        return "O funcinário se chama: " + this.nome + "\n" +
                "e tem salário de: " + this.salario;


    }
}

