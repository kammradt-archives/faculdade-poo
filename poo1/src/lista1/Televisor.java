package lista1;

public class Televisor {
    private int volume;
    private int canal;

    public Televisor(int _volume, int _canal) {
        this.volume = _volume;
        this.canal = _canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        // Estou colocando o limite de volume = 100, apenas para fins de lógica e teste
        if (volume <= 100 && volume >= 0) {
            this.volume = volume;
        } else {
            System.out.println("Favor respeitar o limite de volume: Min 0 Max 100");
        }

    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        // Estou colocando um range de 500 canais, simulando um plano de tv por assinatura
        if (canal <= 500 && volume > 0) {
            this.canal= canal;
        } else {
            System.out.println("Favor respeitar o limite de canais assinados: Canal 1 ao 500");
        };
    }

    public void aumentarVolume(int acrescimo){
        setVolume(getVolume() + acrescimo);
    }

    public void diminuirVolume(int decrescimo){
        setVolume(getVolume() - decrescimo);
    }

}
