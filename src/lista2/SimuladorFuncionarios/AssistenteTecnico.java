package lista2.SimuladorFuncionarios;

public class AssistenteTecnico extends Assistente {
    private Double bonusSalarial;

    public AssistenteTecnico(String nome, String endereço, String telefone, String email, Double salario, int numeroMatricula, Double bonusSalarial) {
        super(nome, endereço, telefone, email, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public Double getSalario() {
        return this.salario + bonusSalarial;
    }
}
