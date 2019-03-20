package lista4.EstudoDeCaso;

public class TriAtleta extends Pessoa implements Ciclista, Corredor, Nadador{

    public TriAtleta(String nome, String endereco) {
        super(nome, endereco);
    }

    @Override
    public void aquecer() {
        System.out.println("O amigo: " + super.getNome() + " está aquerendo.");
    }

    @Override
    public void pedalar() {
        System.out.println("O amigo: " + super.getNome() + " está pedalando.");
    }

    @Override
    public void nadar() {
        System.out.println("O amigo: " + super.getNome() + " está nadando.");
    }

    @Override
    public void correr() {
        System.out.println("O amigo: " + super.getNome() + " está correndo.");
    }
}
