package aula13_02_2019;

public class Bichinho {
    private String nome;
    private int fome;  // Min 0 (Morto) Max 10 (Satisfeito)
    private int saude; // Min 0 (Morto) Max 10 (Suadável)
    private int idade;



    public Bichinho(String _nome, int _fome, int _saude, int _idade) {
        this.nome = _nome;
        this.fome = _fome;
        this.saude = _saude;
        this.idade = _idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        if (this.fome == 0) {
            System.out.println("O seu bixinho morreu!");
        } else if (this.fome <= 5) {
            System.out.println("Estou com fome!");
        } else {
            System.out.println("Estou satisfeito!");
        }

        return fome;
    }

    public void setFome(int fome) {
        if (fome >= 0 && fome <= 10) {
            this.fome = fome;
        } else {
            System.out.println("Valores válidos: 0 até 10");
        }

    }

    public int getSaude() {
        if (this.saude== 0) {
            System.out.println("O seu bixinho morreu!");
        } else if (this.saude<= 5) {
            System.out.println("Estou doente!");
        } else {
            System.out.println("Estou muito bem!");
        }

        return saude;
    }

    public void setSaude(int saude) {
        if (saude>= 0 && saude<= 10) {
            this.saude= saude;
        } else {
            System.out.println("Valores válidos: 0 até 10");
        }

    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int verificarHumor() {
        int humor = this.saude + this.fome;

        if (humor < 10) {
            System.out.println("O seu bixinho está triste!");
        } else if (humor >= 10 && humor <= 15) {
            System.out.println("Estou ok!");
        } else {
            System.out.println("Estou muito feliz!");
        }

        return humor;
    }

}
