package lista3.ClassesAbstratas;

public class Gerente extends FuncionarioAbs{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    void aumentaSalario() {
        setSalario(getSalario() * 1.1);
    }
}
