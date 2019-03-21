package lista4.Cofrinho;

public class Main {
    public static void main(String[] args) {
        Moeda cinco_centavos     = new Moeda(0.05, "Moeda de cinco centavos");
        Moeda dez_centavos       = new Moeda(0.10, "Moeda de dez centavos");
        Moeda cinquenta_centavos = new Moeda(0.5,  "Moeda de cinquenta centavos");
        Moeda um_real            = new Moeda(1.,   "Moeda de um real");

        Cofrinho cofrinho = new Cofrinho();
        cofrinho.addMoeda(cinco_centavos    );
        cofrinho.addMoeda(dez_centavos      );
        cofrinho.addMoeda(cinquenta_centavos);
        cofrinho.addMoeda(um_real           );

        System.out.println(cofrinho.calculaTotal());
        System.out.println(cofrinho.quantasMoedas());
        System.out.println(cofrinho.verificarMaior());

    }
}
