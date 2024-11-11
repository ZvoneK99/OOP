package primjer03;

public class Testiranje {
    public static void main(String[] args) {
        // Studiji
        Studij rac = new Studij("Računarstvo");
        Studij str = new Studij("Strojarstvo");
        Studij elekt = new Studij("Elektrotehnika");

        // Predmeti
        Predmet mtm = new Predmet("Matematika", rac, 3);
        Predmet fiz = new Predmet("Fizika", str, 1);
        Predmet oop = new Predmet("OOP", rac, 2);
        Predmet oeie = new Predmet("OEiE", elekt, 1);

        // Datum i osobe
        Datum datumRodjenja = new Datum(2, 9, 1999);
        Osoba osoba1 = new Osoba("Zvone", "Kozul", datumRodjenja, rac);

        Datum datumRodjenja1 = new Datum(31, 3, 2004);
        Osoba osoba2 = new Osoba("Gabi", "Grbesic", datumRodjenja1, str);

        osoba1.dodajPredmet(fiz);
        osoba1.dodajPredmet(mtm);
        // Provjera ispravnosti datuma za osoba1
        if (!datumRodjenja.ispravnostDatume()) {
            System.out.println("Unos datuma rođenja za osobu1 je pogrešan.");
        } else {
            osoba1.ispisiDetalje();
        }

        // Provjera ispravnosti datuma za osoba2
        if (!datumRodjenja1.ispravnostDatume()) {
            System.out.println("Unos datuma rođenja za osobu2 je pogrešan.");
        } else {
            osoba2.ispisiDetalje();
        }
    }
}
