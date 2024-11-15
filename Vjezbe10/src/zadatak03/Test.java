package zadatak03;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>(5);

		osobe.add(new Osoba("Ivan", "Ivić", new Datum(15, 5, 2000)));
		osobe.add(new Osoba("Ana", "Anić", new Datum(20, 10, 1995)));
		osobe.add(new Osoba("Marko", "Marić", new Datum(5, 12, 1988)));
		osobe.add(new Osoba("Lucija", "Lucić", new Datum(1, 5, 1999)));
		osobe.add(new Osoba("Petar", "Perić", new Datum(30, 8, 2003)));

		//Ispis svih osoba iz liste
		System.out.println("Ispis osoba iz liste:");
		for(Osoba o : osobe) {
			o.ispisiDetalje();
		}
		System.out.println("----------------------------------------------------");
		
		//Pronalazak najmlađe osobe
		Osoba najmlađaOsoba = osobe.get(0);
		for(Osoba o : osobe) {
				if(o.getDatumRođenja().compareTo(najmlađaOsoba.getDatumRođenja())>0) {
					najmlađaOsoba = o;
			}
		}
		System.out.println("Najmlađa osoba je:");
		najmlađaOsoba.ispisiDetalje();
	
		Scanner scanner = new Scanner(System.in);

		// Unos mjeseca od korisnika
		System.out.println("Unesite mjesec (1-12) za filtriranje osoba:");
		int trazeniMjesec = scanner.nextInt();

		System.out.println("Osobe rođene u mjesecu " + trazeniMjesec + ":");
		// Iteracija kroz listu osoba
		for (Osoba o : osobe) {
		    // Provjera je li osoba rođena u traženom mjesecu
		    if (o.getDatumRođenja().getMjesec() == trazeniMjesec) {
		        o.ispisiDetalje(); // Ispis podataka o osobi
		    }
		}

		scanner.close();

	}

}
