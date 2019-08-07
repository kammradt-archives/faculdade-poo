package lista2.SimuladorIngressos;

public class IngressoNormal extends Ingresso{
    public IngressoNormal(Double valor) {
        super(valor);
    }

    public Double getValor(){
        System.out.println("Ingresso Normal");
        return this.valor;
    }
}
