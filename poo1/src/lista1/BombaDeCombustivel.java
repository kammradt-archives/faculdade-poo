package lista1;

public class BombaDeCombustivel {
    private String tipoCombustivel;
    private Double valorLitro;
    private Double quantidade;

    public BombaDeCombustivel(String _tipoCombustivel, Double _valorLitro, Double _quantidade) {
        this.tipoCombustivel = _tipoCombustivel;
        this.valorLitro = _valorLitro;
        this.quantidade = _quantidade;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(Double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Double abastecerPorValor(Double valorPago){
        // Verificar se tem combustível suficiente para fazer o abastecimento

        Double litrosAbastecidos = 0.0;
        if (valorPago/getValorLitro() <= getQuantidade()) {
            litrosAbastecidos = valorPago/getValorLitro();
            Double novaQuantidade = getQuantidade() - litrosAbastecidos;

            // 'Seta' a nova quantidade de litros (reduzindo o que foi comprado)
            setQuantidade(novaQuantidade);
        } else {
            System.out.println("A bomba não tem gasolina suficiente para este valor. O máximo que pode ser comprado é: " + (getQuantidade()*getValorLitro())+ " Reais em gasolina.");
        }

        return litrosAbastecidos;
    }

    public Double abastecerPorLitro(Double litrosComprados) {
        // Verificar se tem combustível suficiente para fazer o abastecimento

        Double custoAbastecimento = 0.0;
        if (litrosComprados <= getQuantidade()) {
            custoAbastecimento = litrosComprados * getValorLitro();

            // 'Seta' a nova quantidade de litros (reduzindo o que foi comprado)
            setQuantidade(getQuantidade() - litrosComprados);
        } else {
            System.out.println("A bomba não tem gasolina suficiente. A quantidade de litros máxima ser comprada é: " + getQuantidade());
        }

        return custoAbastecimento;
    }
}
