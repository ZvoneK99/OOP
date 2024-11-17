package zadatak07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		ArrayList<Studij> studiji = new ArrayList<>();
		
		Studij racunarstvo = new Studij("Računarstvo");
		Studij strojarstvo = new Studij("Strojarstvo");
		Studij elektrotehnika = new Studij("Elektrotehnika");
		
		studiji.add(racunarstvo);
		studiji.add(strojarstvo);
		studiji.add(elektrotehnika);
		
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
		
	        for(Studij studij : studiji) {
	        	studij.ispisiPredmete();
	        }
		
		
		Scanner ulaz = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("Unesite ime osobe "+(i+1));
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime osobe "+(i+1));
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite dan rođenja: ");
			int dan = ulaz.nextInt();
			
			System.out.println("Unesite mjesec rođenja: ");
			int mjesec = ulaz.nextInt();
			
			System.out.println("Unesite godinu rođenja: ");
			int godina = ulaz.nextInt();
			ulaz.nextLine();
			Datum datum = new Datum(dan, mjesec, godina);
			Osoba osoba = new Osoba(ime, prezime, datum);
			
			osobe.add(osoba);
			
		}
		System.out.println("Ispis osoba: ");
		for(Osoba o : osobe) {
			o.ispisiDetalje();

		}
		osobe.sort(Comparator.comparing(o -> o.datumRođenja));
		//osobe.sort(Comparator.comparing(Osoba::getDatumRođenja).reversed());->od najmlađe do najstarije
		System.out.println("Osobe sortirane od najstarije do najmlađe su: ");
		for(Osoba o : osobe) {
			o.ispisiImePrezime();
		}
		ulaz.close();
	}
}
