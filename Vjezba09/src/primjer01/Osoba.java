package primjer01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	
	public Osoba(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	public void podatciOOsobi() {
		System.out.println("Ime osobe: "+ime);
		System.out.println("Prezime osobe: "+prezime);
		System.out.println("Datum rođenja osobe: "+datumRođenja.ispisiDatum());
	}
	public static void main(String[]args) {
		//Ispis podatak iz 2.zadatka
		Datum datum = new Datum(2, 9, 1999);
		Osoba o1 = new Osoba("Zvone", "Kozul", datum);
		o1.podatciOOsobi();
		
		//3.Zadatak
		ArrayList<Osoba> osobe = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite koliko osoba zelite uniti:");
		for(int i=0; i<3; i++) {
			System.out.println("Unesite ime za osobu "+(i+1));
			String ime = ulaz.nextLine();
			
			System.out.println("Unesite prezime za osobu "+(i+1));
			String prezime = ulaz.nextLine();
			
			System.out.println("Unesite dan rođenja: ");
			int dan = ulaz.nextInt();
			
			System.out.println("Unesite mjesec rođenja: ");
			int mjesec = ulaz.nextInt();
			
			System.out.println("Unesite godinu rođenja");
			int godina = ulaz.nextInt();
			ulaz.nextLine();
			Datum noviDatum = new Datum(dan, mjesec, godina);
			osobe.add(new Osoba(ime, prezime, noviDatum));

		}
		osobe.sort(Comparator.comparing(o -> o.datumRođenja));

		for(Osoba o : osobe) {
			o.podatciOOsobi();
		}
		
	}
}
