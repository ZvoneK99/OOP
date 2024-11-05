package primjer_02;

import java.util.ArrayList;

public class Biblioteka {
    ArrayList<Knjiga> knjige = new ArrayList<>();
    ArrayList<ClanBiblioteke> clanovi = new ArrayList<>();

    public void dodajKnjigu(Knjiga knjiga) {
        knjige.add(knjiga);
    }

    public void dodajClana(ClanBiblioteke clan) {
        clanovi.add(clan);
    }

    public boolean posudiKnjigu(ClanBiblioteke clan, Knjiga knjiga) {
        if (knjiga.isDostupno()) {  // Provjera dostupnosti knjige
            knjiga.setDostupno(false);  // Ažuriraj knjigu na "nedostupno"
            clan.dodajKnjigu(knjiga);  // Dodaj knjigu članu
            System.out.println("Knjiga '" + knjiga.naslov + "' je posuđena članu " + clan.ime + " " + clan.prezime + ".");
            return true;  // Uspješna posudba
        } else {
            System.out.println("Knjiga '" + knjiga.naslov + "' trenutno nije dostupna.");
            return false;  // Neuspješna posudba jer knjiga nije dostupna
        }
    }
}
