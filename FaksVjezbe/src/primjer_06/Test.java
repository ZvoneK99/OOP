package primjer_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>(10);
        Scanner ulaz = new Scanner(System.in);
        int brojPogresnihDatuma = 0;

        for (int i = 1; i <= 2; i++) {
            System.out.print("Unesite ime: ");
            String ime = ulaz.nextLine();

            System.out.print("Unesite prezime: ");
            String prezime = ulaz.nextLine();

            System.out.print("Unesite dan rođenja: ");
            int dan = ulaz.nextInt();

            System.out.print("Unesite mjesec rođenja: ");
            int mjesec = ulaz.nextInt();

            System.out.print("Unesite godinu rođenja: ");
            int godina = ulaz.nextInt();
            ulaz.nextLine();

            Datum datumRođenja = new Datum(dan, mjesec, godina);
            if (!datumRođenja.jeDatumValjan()) {
                System.out.println("Unijeli ste nevaljan datum. Molimo unesite ispravan datum.");
                brojPogresnihDatuma++;
                continue;
            }

            System.out.print("Unesite ime studija: ");
            String nazivStudija = ulaz.nextLine();
            Studij studij = new Studij(nazivStudija);

            ArrayList<Predmet> predmeti = new ArrayList<>();
            for (int j = 1; j <= 5; j++) {
                System.out.print("Unesite naziv predmeta: ");
                String nazivPredmeta = ulaz.nextLine();
                System.out.print("Unesite godinu studija za predmet:");
                int godinaStudija = ulaz.nextInt();
                ulaz.nextLine();
                predmeti.add(new Predmet(nazivPredmeta, studij, godinaStudija));
            }

            Osoba osoba = new Osoba(ime, prezime, datumRođenja, studij, predmeti);
            osobe.add(osoba);
        }

        ulaz.close();
        osobe.sort((osoba1, osoba2) -> osoba1.datumRođenja.compareTo(osoba2.datumRođenja));

        System.out.println("Popis osoba od najstarije do najmlađe:");
        for (Osoba osoba : osobe) {
            osoba.ispisiDetalje();
            if (osoba.jePunoljetna()) {
                System.out.println("Osoba je punoljetna.");
            } else {
                System.out.println("Osoba nije punoljetna.");
            }
            System.out.println("-------------------------");
        }

        System.out.println("Broj unosa s nevaljanim datumima: " + brojPogresnihDatuma);
    }
}
