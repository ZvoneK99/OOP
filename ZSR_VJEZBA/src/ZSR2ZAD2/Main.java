package ZSR2ZAD2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<2; i++) {
			System.out.println("Unesite ime i prezime ");
			String imePrezime = ulaz.nextLine();
			
			String[] ime_prezime = imePrezime.split(" ");
			String ime = ime_prezime[0];
			String prezime = ime_prezime[1];
			
			System.out.println("Unesite datum rođenja");
			String datum = ulaz.nextLine();
			
			Osoba osoba = new Osoba(ime, prezime, datum);
			osobe.add(osoba);
		}
		osobe.sort(Comparator.comparing(Osoba::getPrezime));
		
		System.out.println("Osobe sortirane abecedno su: ");
		for(Osoba osoba : osobe) {
			System.out.println(osoba);
		}
	}
}
