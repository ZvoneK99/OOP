package Zadatak12;
import java.util.ArrayList;

public class ZdravstveniCentar {
    public static void main(String[] args) {
        // Kreiranje odjela
        Odjel kardiologija = new Odjel("Kardiologija");
        Odjel pediatrija = new Odjel("Pediatrija");

        // Kreiranje zaposlenika
        Lijecnik drAna = new Lijecnik("Dr. Ana", 45, 5000, "Kardiolog", 0);
        Lijecnik drMarko = new Specijalist("Dr. Marko", 50, 6000, "Internist", 3, 0); // Specijalist
        MedicinskaSestra sestraIvana = new MedicinskaSestra("Sestra Ivana", 35, 3000, 10);

        Lijecnik drPero = new Lijecnik("Dr. Pero", 40, 5500, "Pediatar", 0);
        MedicinskaSestra sestraAna = new MedicinskaSestra("Sestra Ana", 30, 2800, 8);

        // Dodavanje zaposlenika na odjele
        kardiologija.dodajZaposlenika(drAna);
        kardiologija.dodajZaposlenika(drMarko);
        kardiologija.dodajZaposlenika(sestraIvana);

        pediatrija.dodajZaposlenika(drPero);
        pediatrija.dodajZaposlenika(sestraAna);

        // Kreiranje pacijenata
        Pacijent pacijentIvan = new Pacijent("Ivan", 30, 101, drAna);
        Pacijent pacijentMarija = new Pacijent("Marija", 25, 102, drAna);

        Pacijent pacijentPetar = new Pacijent("Petar", 8, 201, drPero);
        Pacijent pacijentMarta = new Pacijent("Marta", 10, 202, drPero);

        // Dodavanje pacijenata na odjele
        kardiologija.dodajPacijenta(pacijentIvan);
        kardiologija.dodajPacijenta(pacijentMarija);

        pediatrija.dodajPacijenta(pacijentPetar);
        pediatrija.dodajPacijenta(pacijentMarta);

        // Kreiranje termina pregleda
        TerminPregleda termin1 = new TerminPregleda(pacijentIvan, drAna, "20.01.2025");
        TerminPregleda termin2 = new TerminPregleda(pacijentPetar, drPero, "21.01.2025");

        // Ispis svih zaposlenika i pacijenata na odjelima
        System.out.println("\n--- Odjel: Kardiologija ---");
        kardiologija.ispisiZaposlenike();
        kardiologija.ispisiPacijente();

        System.out.println("\n--- Odjel: Pediatrija ---");
        pediatrija.ispisiZaposlenike();
        pediatrija.ispisiPacijente();

        // Računanje i ispis ukupnih troškova plaća za svaki odjel
        System.out.println("\nUkupni troškovi plaća na odjelu Kardiologija: " + kardiologija.izracunajUkupneTroskovePlaca());
        System.out.println("Ukupni troškovi plaća na odjelu Pediatrija: " + pediatrija.izracunajUkupneTroskovePlaca());

        // Ispis detalja termina pregleda
        System.out.println("\n--- Detalji termina pregleda ---");
        termin1.ispisiDetaljeTermina();
        termin2.ispisiDetaljeTermina();
    }
}
