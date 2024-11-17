package zadatak08;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Scanner;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Studij> studiji = new ArrayList<>();
		
		Studij racunarstvo = new Studij("Računarstvo");
		racunarstvo.dodajPredmet(new Predmet("Programiranje", racunarstvo, 1));
		racunarstvo.dodajPredmet(new Predmet("Matematika", racunarstvo, 1));
		racunarstvo.dodajPredmet(new Predmet("Algoritmi", racunarstvo, 2));
		racunarstvo.dodajPredmet(new Predmet("Baze podataka", racunarstvo, 2));
		racunarstvo.dodajPredmet(new Predmet("Računalne mreže", racunarstvo, 3));
		
		Studij strojarstvo = new Studij("Strojarstvo");
		strojarstvo.dodajPredmet(new Predmet("Mehanika", strojarstvo, 1));
		strojarstvo.dodajPredmet(new Predmet("Termodinamika", strojarstvo, 1));
		strojarstvo.dodajPredmet(new Predmet("Materijali", strojarstvo, 2));
		strojarstvo.dodajPredmet(new Predmet("Konstrukcije", strojarstvo, 3));
		strojarstvo.dodajPredmet(new Predmet("Hidraulika", strojarstvo, 3));
		
		Studij elektrotehnika = new Studij("Elektrotehnika");
		elektrotehnika.dodajPredmet(new Predmet("Osnove elektrotehnike", elektrotehnika, 1));
		elektrotehnika.dodajPredmet(new Predmet("Elektronika", elektrotehnika, 2));
		elektrotehnika.dodajPredmet(new Predmet("Signalni sustavi", elektrotehnika, 2));
		elektrotehnika.dodajPredmet(new Predmet("Elektromagnetizam", elektrotehnika, 3));
		elektrotehnika.dodajPredmet(new Predmet("Automatika", elektrotehnika, 3));
		
		studiji.add(racunarstvo);
		studiji.add(strojarstvo);
		studiji.add(elektrotehnika);
		
		Predmet matematika = new Predmet("Matematika", racunarstvo, 3);
		
		ArrayList<Osoba> osobe = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			System.out.println("Unesite ime osobe: "+(i+1));
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime osobe: "+(i+1));
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite dan rođenja: ");
			int dan = ulaz.nextInt();
			ulaz.nextLine();
			if(dan<1 || dan>31) {
				System.out.println("Taj dan ne postoji.");
				i--;
			}
			else {
				System.out.println("Unesite mjesec rođenja: ");
				int mjesec = ulaz.nextInt();
				ulaz.nextLine();
				if(mjesec<1 || mjesec>12) {
					System.out.println("Taj mjesec ne postoji.");
					i--;
				}
				else {
					System.out.println("Unesite godinu rođenja: ");
					int godina = ulaz.nextInt();
					ulaz.nextLine();
					int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
					if(godina>trenutnaGodina) {
						System.out.println("Ne mozete unijeti godinu u budućosti.");
						i--;
						}
					System.out.println("Unesite naziv studija (Računarstvo, Strojarstvo, Elektrotehnika).");
					String odabraniStudij = ulaz.nextLine();
					Studij studij = null;
					for(Studij s : studiji) {
						if(s.naziv.equalsIgnoreCase(odabraniStudij)) {
							studij = s;
							break;
						}
					}
					if(studij == null) {
						System.out.println("Studij nije pronađen, pokušajte ponovno.");
						i--;
						continue;
					}
					ArrayList<Predmet> predmetiOsobe = new ArrayList<>();
					for(int j=0; j<3; j++) {
						int randomIndex = (int) (Math.random()*studij.predmeti.size());
						predmetiOsobe.add(studij.predmeti.get(randomIndex));
					}
					Datum datum = new Datum(dan, mjesec, godina);
					Osoba osoba = new Osoba(ime, prezime, datum, studij, predmetiOsobe);
					osobe.add(osoba);
						}
				}
			}
		System.out.println("Podatci o osobama: ");
		for(Osoba o : osobe) {
			o.ispisiDetalje();
			}
		ulaz.close();
		
		System.out.println("Osobe sortirane od najstarije do najmlađe:");
		osobe.sort(Comparator.comparing(o -> o.datumRođenja));
		for(Osoba o : osobe) {
			o.ispisiImePrezime();
		}
	}
}
