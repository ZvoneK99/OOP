package zadatak2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Osoba {
	String ime;
	String prezime;
	LocalDate datumRodjenja;
	
	public Osoba(String ime, String prezime, LocalDate datumRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodjenja = datumRodjenja;
	}
	public String getIme() {
		return this.ime;
	}
	public String getPrezime() {
		return this.prezime;
	}
	@Override
	public String toString() {
		return "Ime i prezime: "+ime+" "+prezime+", Datum rođenja: "+datumRodjenja+".";
	}
	
	public static Osoba unosPodataka() {
		Scanner ulaz = new Scanner(System.in);
			
				System.out.println("Unesite ime i prezime osobe ");
				String unosImenaPrezimena = ulaz.nextLine();
				
				String[] imePrezimeDijelovi = unosImenaPrezimena.split(" ");
			    String ime = imePrezimeDijelovi[0];
			    String prezime = imePrezimeDijelovi.length > 1 ? imePrezimeDijelovi[1] : "";

				
				System.out.println("Unesite datum rođenja u formatu dd.MM.yyyy");
				String unosDatuma = ulaz.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
				
				LocalDate datumRodjenja = LocalDate.parse(unosDatuma, formatter);
				
				LocalDate danas = LocalDate.now();
				
				if(datumRodjenja.isAfter(danas)) {
					System.out.println("Unijeli ste datum u budučnosti.");
				}
			return new Osoba(ime, prezime, datumRodjenja);
	}
}
