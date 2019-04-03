package lista4.EstudoDeCaso;

public class Main {
    public static void main(String[] args) {
        TriAtleta tri = new TriAtleta("Vinicius", "Rua top");
        System.out.println(tri.getNome());
        System.out.println(tri.getEndereco());
        tri.aquecer();
        tri.correr();
        tri.nadar();
        tri.pedalar();

    }
}
