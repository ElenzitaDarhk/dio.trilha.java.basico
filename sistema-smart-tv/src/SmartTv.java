
public class SmartTv {

    private boolean ligada = false;
    private int canal = 1;
    private int volume = 10;

    public boolean verificarLigada() {
        return ligada;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public int getCanal() {
        return canal;
    }

    public void aumentarCanal() {
        this.canal = ++canal;
    }

    public void diminuirCanal() {
        this.canal = --canal;
    }

    public void escolherCanal(int canal) {
        this.canal = canal;
    }

    /**
     * @return int return the volume
     */
    public int getVolume() {
        return volume;
    }

    public void aumentarVolume() {
        this.volume = ++volume;
    }

    public void dimunuirVolume() {
        this.volume = --volume;
    }

}
