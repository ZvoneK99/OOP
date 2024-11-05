package primjer_02;

import java.util.ArrayList;

public class ClanBiblioteke {
    String ime;
    String prezime;
    ArrayList<Knjiga> posudjeneKnjige = new ArrayList<>();

    public ClanBiblioteke(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void dodajKnjigu(Knjiga knjiga) {
        posudjeneKnjige.add(knjiga);
    }

    public void ispisiPosudjeneKnjige() {
        System.out.println("Posuđene knjige člana " + ime + " " + prezime + ":");
        for (Knjiga knjiga : posudjeneKnjige) {
            System.out.println("- " + knjiga);
        }
    }
}
