package primjer01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Osoba {
    private String ime;
    private String prezime;
    private Datum datumRođenja;

    // Konstruktor
    public Osoba(String ime, String prezime, Datum datumRođenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.datumRođenja = datumRođenja;
    }

    // Getter za datum rođenja (korisno za sortiranje)
    public Datum getDatumRođenja() {
        return datumRođenja;
    }

    // Metoda za ispis informacija
    @Override
    public String toString() {
        return "Ime: " + ime + ", Prezime: " + prezime + ", Datum rođenja: " + datumRođenja;
    }

    // Glavni program
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite koliko osoba želite unijeti:");
        int brojOsoba = ulaz.nextInt();
        ulaz.nextLine(); // Čišćenje ulaznog buffera

        // Unos podataka za osobe
        for (int i = 0; i < brojOsoba; i++) {
            System.out.println("Unesite ime za osobu " + (i + 1) + ":");
            String ime = ulaz.nextLine();

            System.out.println("Unesite prezime za osobu " + (i + 1) + ":");
            String prezime = ulaz.nextLine();

            System.out.println("Unesite dan rođenja: ");
            int dan = validirajUnosBroja(ulaz);

            System.out.println("Unesite mjesec rođenja: ");
            int mjesec = validirajUnosBroja(ulaz);

            System.out.println("Unesite godinu rođenja: ");
            int godina = validirajUnosBroja(ulaz);

            Datum datum = new Datum(dan, mjesec, godina);
            osobe.add(new Osoba(ime, prezime, datum));
        }

        // Sortiranje po datumu rođenja
        osobe.sort(Comparator.comparing(Osoba::getDatumRođenja));

        // Ispis svih osoba
        System.out.println("\nOsobe sortirane po datumu rođenja:");
        for (Osoba o : osobe) {
            System.out.println(o);
        }

        ulaz.close();
    }

    // Metoda za validaciju unosa broja
    private static int validirajUnosBroja(Scanner ulaz) {
        while (!ulaz.hasNextInt()) {
            System.out.println("Molimo unesite ispravan broj:");
            ulaz.next(); // Preskoči nevažeći unos
        }
        return ulaz.nextInt();
    }
}
