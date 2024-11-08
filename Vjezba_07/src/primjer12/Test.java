package primjer12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    ArrayList<Zaposlenik> zaposlenici;

    public Test() {
        this.zaposlenici = new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite podatke o zaposlenicima");

        for (int i = 0; i < 5; i++) {
            System.out.println("Unesite ime zaposlenika: ");
            String ime = ulaz.nextLine();

            System.out.println("Unesite prezime zaposlenika: ");
            String prezime = ulaz.nextLine();

            System.out.println("Unesite dan rođenja: ");
            int dan = ulaz.nextInt();

            System.out.println("Unesite mjesec rođenja: ");
            int mjesec = ulaz.nextInt();

            System.out.println("Unesite godinu rođenja: ");
            int godina = ulaz.nextInt();
            ulaz.nextLine(); // Čisti ulazni buffer

            // Kreiraj objekt Datum i Zaposlenik, pa ga dodaj u listu
            Datum datumZaposlenja = new Datum(dan, mjesec, godina);
            Zaposlenik zaposlenik = new Zaposlenik(ime, prezime, datumZaposlenja);
            zaposlenici.add(zaposlenik);
        }

        // Zatvori Scanner na kraju
        ulaz.close();

        // Sortiraj zaposlenike prema datumu zaposlenja od najstarijeg do najmlađeg
        zaposlenici.sort((z1, z2) -> z1.datumZaposlenja.compareTo(z2.datumZaposlenja));

        // Ispis zaposlenika nakon sortiranja
        System.out.println("Zaposlenici sortirani po datumu zaposlenja:");
        for (Zaposlenik z : zaposlenici) {
            System.out.println(z.ime + " " + z.prezime + " - Datum rođenja: " + z.datumZaposlenja);
        }
    ulaz.close();
    }
    
}
