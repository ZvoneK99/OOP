package zad01;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ArrayList<Osoba> osobe = new ArrayList<>(); // Inicijalizacija liste osoba
        ArrayList<Studij> studiji = new ArrayList<>(); // Inicijalizacija liste studija
        
        // Kreiranje studija
        Studij racunarstvo = new Studij("Racunarstvo");
        Studij strojarstvo = new Studij("Strojarstvo");
        Studij elektrotehnika = new Studij("Elektrotehnika");
        
        studiji.add(racunarstvo);
        studiji.add(strojarstvo);
        studiji.add(elektrotehnika);

        // Dodavanje predmeta za svaki studij
        racunarstvo.dodajPredmet(new Predmet("Programiranje", racunarstvo, 1));
        racunarstvo.dodajPredmet(new Predmet("Matematika", racunarstvo, 1));
        racunarstvo.dodajPredmet(new Predmet("Baze podataka", racunarstvo, 2));
        racunarstvo.dodajPredmet(new Predmet("Računalne mreže", racunarstvo, 2));
        racunarstvo.dodajPredmet(new Predmet("OOP", racunarstvo, 3));
        
        strojarstvo.dodajPredmet(new Predmet("Mehanika", strojarstvo, 1));
        strojarstvo.dodajPredmet(new Predmet("Termodinamika", strojarstvo, 2));
        strojarstvo.dodajPredmet(new Predmet("Materijali", strojarstvo, 2));
        strojarstvo.dodajPredmet(new Predmet("Konstrukcije", strojarstvo, 3));
        strojarstvo.dodajPredmet(new Predmet("Hidraulika", strojarstvo, 3));
        
        elektrotehnika.dodajPredmet(new Predmet("Osnove elektrotehnike", elektrotehnika, 1));
        elektrotehnika.dodajPredmet(new Predmet("Elektronika", elektrotehnika, 2));
        elektrotehnika.dodajPredmet(new Predmet("Signalni sustavi", elektrotehnika, 2));
        elektrotehnika.dodajPredmet(new Predmet("Elektromagnetizam", elektrotehnika, 3));
        elektrotehnika.dodajPredmet(new Predmet("Automatika", elektrotehnika, 3));

        Scanner ulaz = new Scanner(System.in);

        // Unos podataka za 10 osoba
        for (int i = 0; i < 10; i++) {
            System.out.println("Unesite ime osobe " + (i + 1) + ":");
            String ime = ulaz.nextLine();

            System.out.println("Unesite prezime osobe " + (i + 1) + ":");
            String prezime = ulaz.nextLine();

            System.out.println("Unesite godinu rođenja:");
            int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
            int godina = ulaz.nextInt();
            
            if (godina > trenutnaGodina) {
                System.out.println("Unijeli ste pogrešnu godinu.");
                i--; // Ponovni unos 
                ulaz.nextLine();
                continue;
            }
            
            System.out.println("Unesite mjesec rođenja:");
            int mjesec = ulaz.nextInt();
            
            if (mjesec < 1 || mjesec > 12) {
                System.out.println("Unijeli ste nepostojeći mjesec.");
                i--; 
                ulaz.nextLine();
                continue;
            }
            
            System.out.println("Unesite dan rođenja:");
            int dan = ulaz.nextInt();
            
            if (dan < 1 || dan > 31) {
                System.out.println("Unijeli ste pogrešan dan.");
                i--; 
                ulaz.nextLine(); 
                continue;
            }

            ulaz.nextLine(); // Čišćenje ulaznog toka

            System.out.println("Unesite naziv studija:");
            String nazivStudij = ulaz.nextLine();
            Studij odabraniStudij = null;
            for (Studij s : studiji) {
                if (s.naziv.equalsIgnoreCase(nazivStudij)) {
                    odabraniStudij = s;
                    break;
                }
            }
            
            if (odabraniStudij == null) {
                System.out.println("Studij nije pronađen. Molimo odaberite ispravan studij.");
                i--; // Ponovni unos za istu osobu
                continue;
            }
            
            Datum datum = new Datum(dan, mjesec, godina); // Kreiranje objekta datum
            Osoba osoba = new Osoba(ime, prezime, datum, odabraniStudij);
            osobe.add(osoba);
        }

        // Sortiranje osoba
        osobe.sort(Comparator.comparing(o -> o.datumRođenja));
        System.out.println("Osobe sortirane od najstarije do najmlađe su:");
        for (Osoba o : osobe) {
            o.ispisiPodatkeURedu();
            o.jeLiPunoljetna();
        }
        
        // Unos studija za ispis studenata
        System.out.println("Unesite naziv studija za prikaz studenata:");
        String uneseniStudij = ulaz.nextLine();
        
        System.out.println("Studenti na studiju " + uneseniStudij + " sortirani po datumu rođenja su:");
        osobe.stream()
             .filter(o -> o.studij.naziv.equalsIgnoreCase(uneseniStudij))
             .sorted(Comparator.comparing(o -> o.datumRođenja))
             .forEach(Osoba::ispisiPodatkeURedu);
        
        ulaz.close();
    }
}
