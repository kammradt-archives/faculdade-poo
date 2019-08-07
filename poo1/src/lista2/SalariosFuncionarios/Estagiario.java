package lista2.SalariosFuncionarios;

public class Estagiario extends Empregado{
    private Double descontos;

    public Estagiario(int codigo, String nome, String email, Double salario, Double descontos) {
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }

    @Override
    public void aumentoSalarial(int percentual){
        this.salario += (this.salario)  * percentual/100 - descontos;
    }
}
