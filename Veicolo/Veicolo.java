public abstract class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int annoImmatricolazione;
    private int numPasseggeri;

    public Veicolo(String targa, String marca, String modello, int annoImmatricolazione, int numPasseggeri) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.annoImmatricolazione = annoImmatricolazione;
        this.numPasseggeri = numPasseggeri;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public int getNumPasseggeri() {
        return numPasseggeri;
    }

    public abstract double calcolaTassa();
}