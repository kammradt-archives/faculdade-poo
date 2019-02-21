package lista2.SimuladorIngressos;

public class IngressoVip extends Ingresso {
    private Double adicional;

    public IngressoVip(Double valor, Double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    public Double getValor() {
        return this.valor + adicional;
    }
}
