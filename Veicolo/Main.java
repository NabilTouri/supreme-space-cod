import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Autoveicolo veicolo;

        String targa, marca, modello, tipoAlimentazione;
        int annoImmatricolazione, numPasseggeri;
        double potenza;

        int scelta = 0;
        do {
            System.out.println("Scegli il tipo di veicolo:");
            System.out.println("1. Autoveicolo a benzina");
            System.out.println("2. Autoveicolo a gasolio");
            System.out.println("3. Autoveicolo a gas");
            System.out.println("4. Autoveicolo a idrogeno");
            System.out.println("5. veicolo elettrico");
            System.out.println("6. Motoveicolo");
            System.out.println("99. Esci");

            scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer di input

            switch (scelta) {
                case 1: // Autoveicolo a benzina
                    System.out.println("Inserisci la targa dell'autoveicolo a benzina:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca dell'autoveicolo a benzina:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello dell'autoveicolo a benzina:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione dell'autoveicolo a benzina:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri dell'autoveicolo a benzina:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza dell'autoveicolo a benzina (in HP):");
                    potenza = scanner.nextDouble();
                    tipoAlimentazione = "benzina";
                    veicolo = new Autoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza, tipoAlimentazione);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;

                case 2: // Autoveicolo a gasolio
                    System.out.println("Inserisci la targa dell'autoveicolo a gasolio:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca dell'autoveicolo a gasolio:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello dell'autoveicolo a gasolio:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione dell'autoveicolo a gasolio:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri dell'autoveicolo a gasolio:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza dell'autoveicolo a gasolio (in HP):");
                    potenza = scanner.nextDouble();
                    tipoAlimentazione = "gasolio";
                    veicolo = new Autoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza, tipoAlimentazione);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;

                case 3: // Autoveicolo a gas
                    System.out.println("Inserisci la targa dell'autoveicolo a gas:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca dell'autoveicolo a gas:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello dell'autoveicolo a gas:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione dell'autoveicolo a gas:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri dell'autoveicolo a gas:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza dell'autoveicolo a gas (in HP):");
                    potenza = scanner.nextDouble();
                    System.out.println("Inserisci il tipo di alimentazione dell'autoveicolo a gas:");
                    do {
                        System.out.println("1. Gpl");
                        System.out.println("2. Metano");
                        tipoAlimentazione = scanner.nextLine();
                    } while (tipoAlimentazione != "Gpl" && tipoAlimentazione != "Metano");
                    veicolo = new Autoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza, tipoAlimentazione);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;

                case 4: //Autoveicolo a idrogeno
                    System.out.println("Inserisci la targa dell'autoveicolo a idrogeno:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca dell'autoveicolo a idrogeno:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello dell'autoveicolo a idrogeno:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione dell'autoveicolo a idrogeno:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri dell'autoveicolo a idrogeno:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza dell'autoveicolo a gas (in HP):");
                    potenza = scanner.nextDouble();
                    tipoAlimentazione = "idrogeno";
                    veicolo = new Autoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza, tipoAlimentazione);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;

                case 5: // Autoveicolo elettrico
                    System.out.println("Inserisci la targa dell'autoveicolo elettrico:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca dell'autoveicolo elettrico:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello dell'autoveicolo elettrico:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione dell'autoveicolo elettrico:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri dell'autoveicolo elettrico:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza dell'autoveicolo elettrico (in HP):");
                    potenza = scanner.nextDouble();
                    tipoAlimentazione = "elettrico";
                    veicolo = new Autoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza, tipoAlimentazione);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;

                case 6: // Motoveicolo
                    System.out.println("Inserisci la targa del motoveicolo:");
                    targa = scanner.nextLine();
                    System.out.println("Inserisci la marca del motoveicolo:");
                    marca = scanner.nextLine();
                    System.out.println("Inserisci il modello del motoveicolo:");
                    modello = scanner.nextLine();
                    System.out.println("Inserisci l'anno di immatricolazione del motoveicolo:");
                    annoImmatricolazione = scanner.nextInt();
                    System.out.println("Inserisci il numero di passeggeri del motoveicolo:");
                    numPasseggeri = scanner.nextInt();
                    System.out.println("Inserisci la potenza del motoveicolo:");
                    potenza = scanner.nextDouble();
                    veicolo = new Motoveicolo(targa, marca, modello, annoImmatricolazione, numPasseggeri, potenza);
                    System.out.println("Descrizione del veicolo\n" + veicolo.toString());
                    System.out.println("Tassa annuale\n" + veicolo.calcolaTassa());
                    break;
                
                case 99:
                    System.out.println("Arrivederci!");
                    break;
                
                default:    
                    System.out.println("Scelta non valida!");
                    break;

            }
        } while (scelta != 99);

        scanner.close();
    }
}