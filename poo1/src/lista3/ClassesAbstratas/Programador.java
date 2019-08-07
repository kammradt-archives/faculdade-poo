package lista3.ClassesAbstratas;

public class Programador extends FuncionarioAbs{

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentaSalario() {
        setSalario(getSalario() * 1.2);
    }
}
