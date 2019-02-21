package lista2.SimuladorFuncionarios;

public class Funcionario {
    private String nome;
    private String endereço;
    private String telefone;
    private String email;
    protected Double salario;

    public Funcionario(String nome, String endereço, String telefone, String email, Double salario) {
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.email = email;
        this.salario = salario;
    }

    public void exibeDados(){
        // Usei os métodos get aqui para pegar os valores nas classes filho dinamicamente (cada uma com seus métodos particulares), e não pelos atributos fixados na superClass
        System.out.println("O nome do funcinário é: "     + getNome());
        System.out.println("O endereço do funcinário é: " + getEndereço());
        System.out.println("O telefone do funcinário é: " + getTelefone());
        System.out.println("O email do funcinário é: "    + getEmail());
        System.out.println("O salário do funcinário é: "  + getSalario());

    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Double getSalario() {
        return salario;
    }
}
