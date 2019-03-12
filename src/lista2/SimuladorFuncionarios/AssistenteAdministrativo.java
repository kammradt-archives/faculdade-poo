package lista2.SimuladorFuncionarios;

public class AssistenteAdministrativo extends Assistente {
    private String turno;


    public AssistenteAdministrativo(String nome, String endereço, String telefone, String email, Double salario, int numeroMatricula, String turno) {
        super(nome, endereço, telefone, email, salario, numeroMatricula);
        this.turno = turno;
    }

    @Override
    public Double getSalario() {
        if (turno == "noturno") {
            return this.salario + 300.0; // coloquei um valor de bonusNoturno fixo em 300.0
        } else {
            return this.salario;
        }

    }
}
