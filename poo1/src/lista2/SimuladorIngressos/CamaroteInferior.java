package lista2.SimuladorIngressos;

// Não faz mais sentido a inferior herdar da IngressoNormal já que só a superior tem adicional?
public class CamaroteInferior extends IngressoNormal {
    private String localizacao;

    public CamaroteInferior(Double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
