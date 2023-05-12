import java.util.Calendar;

public class Autoveicolo extends Veicolo {
    private double potenza;
    private String tipoAlimentazione;

    public Autoveicolo(String targa, String marca, String modello, int annoImmatricolazione, int numPasseggeri, double potenza, String tipoAlimentazione) {
        super(targa, marca, modello, annoImmatricolazione, numPasseggeri);
        this.potenza = potenza;
        this.tipoAlimentazione = tipoAlimentazione;
    }

    public double getPotenza() {
        return potenza;
    }

    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    public double calcolaTassa() {
        double tassa = 0.0;
        int annoCorrente = Calendar.getInstance().get(Calendar.YEAR);
        int anniDalImmatricolazione = annoCorrente - getAnnoImmatricolazione();
        double costoPotenza = 0.0;

        // Calcola costo della potenza
        if (tipoAlimentazione.equals("benzina")) {
            costoPotenza = 2.5;
        } else if (tipoAlimentazione.equals("gasolio")) {
            costoPotenza = 2.5;
        } else if (tipoAlimentazione.equals("GPL") && anniDalImmatricolazione > 5) {
            costoPotenza = 0.75;
        } else if (tipoAlimentazione.equals("metano") && anniDalImmatricolazione > 5) {
            costoPotenza = 0.5;
        } else if (tipoAlimentazione.equals("idrogeno")) {
            costoPotenza = 0.1 * anniDalImmatricolazione;
        }

        // Calcola la tassa
        if (tipoAlimentazione.equals("elettrico")) {
            tassa = 0.0;
        } else {
            tassa = costoPotenza * potenza;
        }

        return tassa;
    }

    public String toString() {
        String s = "";
        s = "Targa" + getTarga() + "\n" + "Marca: " + getMarca() + "\n" + "Modello: " + getModello() + "\n" + "Anno di immatricolazione: " + getAnnoImmatricolazione() + "\n" + "Numero passeggeri: " + getNumPasseggeri() + "\n" + "Potenza: " + getPotenza() + "\n" + "Tipo alimentazione: " + getTipoAlimentazione() ;
        return s;
    }

}
