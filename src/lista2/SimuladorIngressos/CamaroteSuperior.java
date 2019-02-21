package lista2.SimuladorIngressos;

public class CamaroteSuperior extends IngressoVip{
    private String localizacao;

    public CamaroteSuperior(Double valor, Double adicional, String localizacao) {
        super(valor, adicional);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
