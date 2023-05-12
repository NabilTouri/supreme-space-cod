public class Motoveicolo extends Veicolo {
    private double potenza;

    public Motoveicolo(String targa, String marca, String modello, int annoImmatricolazione, int numPasseggeri, double potenza) {
        super(targa, marca, modello, annoImmatricolazione, numPasseggeri);
        this.potenza = potenza;
    }

    public double getPotenza() {
        return potenza;
    }

    public double calcolaTassa() {
        return potenza * 1.5;
    }

    public String toString() {
        String s = "";
        s = "Targa" + getTarga() + "\n" + "Marca: " + getMarca() + "\n" + "Modello: " + getModello() + "\n" + "Anno di immatricolazione: " + getAnnoImmatricolazione() + "\n" + "Numero passeggeri: " + getNumPasseggeri() + "\n" + "Potenza: " + getPotenza() + "\n" + "Tipo alimentazione: " + "benzina" ;
        return s;
    }
}