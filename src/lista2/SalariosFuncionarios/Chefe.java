package lista2.SalariosFuncionarios;

public class Chefe extends Empregado{
    private Double beneficios;

    public Chefe(int codigo, String nome, String email, Double salario, Double beneficios) {
        super(codigo, nome, email, salario);
        this.beneficios = beneficios;
    }

    @Override
    public void aumentoSalarial(int percentual){
        this.salario += (this.salario)  * percentual/100 + beneficios;
    }
}
