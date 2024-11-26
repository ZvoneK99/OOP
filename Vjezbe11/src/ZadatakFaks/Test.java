package ZadatakFaks;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class Test {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();	//lista osobe
		ArrayList<Studij> studiji = new ArrayList<>();//lista studij
		
		Studij racunarstvo = new Studij("Racunarstvo");
		Studij strojarstvo = new Studij("Strojarstvo");
		Studij elektrotehnika = new Studij("Elektrotehnika");
		
		studiji.add(racunarstvo);
		studiji.add(strojarstvo);
		studiji.add(elektrotehnika);
		
		//Dodavanje predmeta za studije 
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
		
		for(int i=0; i<10; i++) {
			System.out.println("Unesite ime osobe "+(i+1)+".");
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime osobe "+(i+1)+".");
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite dan rođenja: ");
			int dan = ulaz.nextInt();
			
			System.out.println("Unesite mjesec rođenja: ");
			int mjesec = ulaz.nextInt();
			
			System.out.println("Unesite godinu rođenja: ");
			int godina = ulaz.nextInt();
			ulaz.nextLine();
			
			LocalDate datumZaUsporedbu = LocalDate.of(godina, mjesec, dan);
			if(datumZaUsporedbu.isAfter(LocalDate.now())) {
				System.out.println("Unijeli ste datum u budućnosti. Pokušajte ponovno.");
				i--;
				continue;
			}
			
			System.out.println("Unesite naziv studija:");
			String nazivStudija =ulaz.nextLine();
			Studij odabraniStudij = null;
			for(Studij s : studiji) {
				if(s.naziv.equalsIgnoreCase(nazivStudija)) {
					odabraniStudij = s;
					break;
				}
			}
			if(odabraniStudij == null) {
				System.out.println("Studij nije pronađen. Molimo odaberite ispravan studij.");
                i--; 
                continue;
			}
			
			
			Datum datum = new Datum(dan, mjesec, godina);
			Osoba osoba = new Osoba(ime, prezime, datum, odabraniStudij);
			
			osobe.add(osoba);
		}
		System.out.println("Osobe sortirane od najstarije do najmlađe:");
		osobe.sort(Comparator.comparing(Osoba::getDatumRođenja));
		
		for(Osoba osoba : osobe) {
			osoba.ispisiDetalje();
		}
		System.out.println("Unesite naziv studija za prikaz studenata: ");
		String uneseniStudij = ulaz.nextLine();
		
		System.out.println("Studenti na studiju "+uneseniStudij+" su");
			for(Osoba o : osobe) {
				if(o.studij.naziv.equalsIgnoreCase(uneseniStudij)) {
					o.ispisiDetalje();
				}
			}
		
		ulaz.close();
	}
	
}
