package lista2.SimuladorFuncionarios;

public class Assistente extends Funcionario{
    private int numeroMatricula;

    public Assistente(String nome, String endereço, String telefone, String email, Double salario, int numeroMatricula) {
        super(nome, endereço, telefone, email, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        System.out.println("O nome do funcinário é: " + this.numeroMatricula);
        return numeroMatricula;
    }
}
