package lista1;


public class Bola {
    private String cor;
    private int circunferencia;
    private String material;


    public Bola(String _cor, int _circunferencia, String _material) {
        this.cor = _cor;
        this.circunferencia = _circunferencia;
        this.material = _material;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(int circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }



}


