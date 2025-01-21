package Zadatak8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Kreiranje studija
        Studij racunarstvo = new Studij("Računarstvo");
        Studij elektrotehnika = new Studij("Elektrotehnika");

        // Kreiranje predmeta za Računarstvo
        Predmet osnove = new Predmet("Osnove programiranja", 6);
        Predmet algoritmi = new Predmet("Algoritmi i strukture podataka", 8);

        // Kreiranje predmeta za Elektrotehniku
        Predmet krugovi = new Predmet("Električni krugovi", 5);
        Predmet signali = new Predmet("Signali i sustavi", 7);

        // Kreiranje studenata
        Student s1 = new PreddiplomskiStudent("Marko", 20, 3.5, 2);
        Student s2 = new DiplomskiStudent("Ana", 23, 4.0, "Računalne mreže");
        Student s3 = new DoktorskiStudent("Ivan", 30, 4.5, 5);
        Student s4 = new PreddiplomskiStudent("Marta", 21, 3.8, 3);

        // Dodavanje studenata na predmete
        osnove.dodajStudenta(s1);
        osnove.dodajStudenta(s2);

        algoritmi.dodajStudenta(s3);
        algoritmi.dodajStudenta(s4);

        krugovi.dodajStudenta(s1);
        krugovi.dodajStudenta(s4);

        signali.dodajStudenta(s2);
        signali.dodajStudenta(s3);

        // Dodavanje predmeta na studije
        racunarstvo.dodajPredmetNaStudij(osnove);
        racunarstvo.dodajPredmetNaStudij(algoritmi);

        elektrotehnika.dodajPredmetNaStudij(krugovi);
        elektrotehnika.dodajPredmetNaStudij(signali);

        // Ispis predmeta i studenata za svaki studij
        ispisPredmetaStudenata(racunarstvo);
        ispisPredmetaStudenata(elektrotehnika);

        // Računanje ukupnog broja ECTS bodova za svaki studij
        ukupnoECTSStudij(racunarstvo);
        ukupnoECTSStudij(elektrotehnika);
    }

    public static void ispisPredmetaStudenata(Studij s) {
        System.out.println("\nIspis predmeta na studiju: " + s.getNazivStudija());
        for (Predmet p : s.getPredmeti()) {
            System.out.println("Predmet: " + p.getNaziv());
        }

        System.out.println("\nIspis studenata na studiju: " + s.getNazivStudija());
        for (Predmet p : s.getPredmeti()) {
            System.out.println("Predmet: " + p.getNaziv());
            for (Student student : p.getStudenti()) {
                System.out.println(student);
            }
        }
    }

    public static void ukupnoECTSStudij(Studij s) {
        int ukupnoECTS = 0;
        System.out.println("\nRačunanje ukupnog broja ECTS bodova za studij: " + s.getNazivStudija());
        for (Predmet p : s.getPredmeti()) {
            for (Student student : p.getStudenti()) {
                ukupnoECTS += p.getEctsBodovi();
            }
        }
        System.out.println("Ukupni broj ECTS bodova za studij '" + s.getNazivStudija() + "': " + ukupnoECTS);
    }
}
