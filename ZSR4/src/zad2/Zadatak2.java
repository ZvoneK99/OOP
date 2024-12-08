package zad2;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<DokumentKnjiznice> dokumenti = new ArrayList<>();
        Random random = new Random();

        // Generiranje 50 objekata različitih razreda
        for (int i = 0; i < 50; i++) {
            int tipDokumenta = random.nextInt(6); // Slučajni broj od 0 do 5
            DokumentKnjiznice dokument;

            switch (tipDokumenta) {
                case 0:
                    dokument = new Knjiga(i + 1, "Knjiga " + (i + 1), "Autor " + (i + 1));
                    break;
                case 1:
                    dokument = new Casopis(i + 1, "Časopis " + (i + 1), "Kategorija " + (i + 1), random.nextInt(100));
                    break;
                case 2:
                    dokument = new DigitalniDokument(i + 1, "DigitalniDokument " + (i + 1), "CD");
                    break;
                case 3:
                    dokument = new E_Dokument(i + 1, "E-Dokument " + (i + 1), "Podatkovni sadržaj " + (i + 1));
                    break;
                case 4:
                    dokument = new Udzbenik(i + 1, "Udžbenik " + (i + 1), "Autor " + (i + 1));
                    ((Udzbenik) dokument).setPredmet("Predmet " + (i + 1));
                    break;
                case 5:
                    dokument = new Rijecnik(i + 1, "Rječnik " + (i + 1), "Autor " + (i + 1));
                    ((Rijecnik) dokument).setPrviJezik("Hrvatski");
                    ((Rijecnik) dokument).setDrugiJezik("Engleski");
                    break;
                default:
                    throw new IllegalStateException("Neočekivani tip dokumenta: " + tipDokumenta);
            }

            dokumenti.add(dokument);
        }

        // Ispis svih dokumenata
        for (DokumentKnjiznice dokument : dokumenti) {
            System.out.println(dokument);
        }
    }
}
