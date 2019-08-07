package lista1;

public class Quadrado {
    private int lado;

    public Quadrado(int _lado) {
        this.lado = _lado;

    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcArea() {
        return this.lado * this.lado;
    }
}
