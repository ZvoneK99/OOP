package zadatak4;

import java.util.Scanner;

public class Rodjendan {
	String ime;
	String prezime;
	Datum datumRođenja;
	
	public Rodjendan(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
	
	public static void main (String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime: ");
		String ime = ulaz.nextLine();
		
		System.out.println("Unesite prezime: ");
		String prezime = ulaz.nextLine();
		
		System.out.println("Unesite dan: ");
		int dan = ulaz.nextInt();
		
		System.out.println("Unesite mjesec:");
		int mjesec = ulaz.nextInt();
		
		System.out.println("Unesite godinu: ");
		int godina = ulaz.nextInt();
		Datum datum = new Datum(dan, mjesec, godina);
		datum.ispisiDatum();
		datum.izracunDanaDoRođendana();
	}
}
