package lista2.SimuladorPessoas;

public class Pobre extends PessoaListaDois {
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public void trabalhar(){
        System.out.println("Estou trabalhando para o estado opressor ...................");
    }
}
