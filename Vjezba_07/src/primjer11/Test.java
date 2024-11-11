package primjer11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Unesite ime:");
            String ime = ulaz.nextLine();

            System.out.println("Unesite prezime:");
            String prezime = ulaz.nextLine();

            System.out.println("Unesite dan rođenja:");
            int dan = ulaz.nextInt();

            System.out.println("Unesite mjesec rođenja:");
            int mjesec = ulaz.nextInt();

            System.out.println("Unesite godinu rođenja:");
            int godina = ulaz.nextInt();
            ulaz.nextLine(); // Očisti ulazni buffer

            DatumRodjenja datum = new DatumRodjenja(dan, mjesec, godina);
            osobe.add(new Osoba(ime, prezime, datum));
        }

        // Sortiranje osoba po datumu rođenja od najstarijeg do najmlađeg
        osobe.sort((o1, o2) -> o1.datumRođenja.compareTo(o2.datumRođenja));

        // Ispis osoba
        System.out.println("Osobe sortirane od najstarijeg do najmlađeg:");
        for (Osoba osoba : osobe) {
            osoba.ispisiDetalje();
        }

        ulaz.close();
    }
}
