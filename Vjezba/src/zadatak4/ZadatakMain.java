package zadatak4;

import java.util.ArrayList;

public class ZadatakMain {
    public static void main(String[] args) {
        ArrayList<DokumentKnjiznice> dokumenti = new ArrayList<>();

        // Dodavanje različitih dokumenata
        dokumenti.add(new Knjiga(1, "Matematika 1", "Autor A", true));
        dokumenti.add(new Knjiga(2, "Roman B", "Autor B", false));
        dokumenti.add(new Casopis(3, "Znanost", "Tehnologija", 45));
        dokumenti.add(new DigitalniDokument(4, "Programiranje u Javi", "PDF"));

        // Ispis svih dokumenata
        for (DokumentKnjiznice dokument : dokumenti) {
            System.out.println(dokument);
            System.out.println("Je li potreban polog: " + dokument.jeLiPotrebanPolog());
            System.out.println("Iznos pologa: " + dokument.dajIznosPologa() + " EUR\n");
        }
    }
}
