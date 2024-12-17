package ZSR4_2;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) {
        ArrayList<DokumentKnjiznice> dokumenti = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            int tip = rand.nextInt(6);
            switch (tip) {
                case 0 -> dokumenti.add(new Knjiga(i, "Knjiga " + i, "Autor " + i));
                case 1 -> dokumenti.add(new Casopis(i, "Casopis " + i, "Kategorija " + i, rand.nextInt(100)));
                case 2 -> dokumenti.add(new DigitalniDokument(i, "DigitalniDokument " + i, "CD"));
                case 3 -> dokumenti.add(new E_Dokument(i, "E_Dokument " + i, "Sadržaj " + i));
                case 4 -> dokumenti.add(new Udzbenik(i, "Udzbenik " + i, "Autor " + i, "Predmet " + i));
                case 5 -> dokumenti.add(new Rjecnik(i, "Rijecnik " + i, "Autor " + i, "HR", "EN"));
            }
        }

        for (DokumentKnjiznice dokument : dokumenti) {
            System.out.println(dokument);
        }
    }
}
