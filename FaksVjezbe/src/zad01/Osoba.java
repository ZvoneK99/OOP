// klasa osoba, a ima ime, prezime, datum rodjenja
// datum rodjenja je posebna klasa koja ima polja: dan, mjesec i godinu
// u glavnom programu napraviti niz od 10 osoba, zatraziti od korisnika unos imena, prezimena i datuma rodjenja za sve osobe
// ispisati ime, prezime i datum rodjenja, sortirane od najstarijeg do najmladjeg
// ispisati je li osoba punoljetna
// ograniciti da korisnik ne unosi gluposti (osoba rodjena u buducnosti i slicno)
// napraviti klasu studij koja ima polje naziv
// napraviti klasu predmet koja ima polje naziv predmeta, studij, godina studij
// prosiriti klasu osoba tako da cemo dodati polje studij i niz predmeti 
// kreirati niz od 10 osoba samo sto jos unosimo naziv studija i dodajemo predmete tog studija
// napraviti niz od 3 studija (elektro, rac i stroja), svakom studiju dodijeliti po 5 predmeta (inicijalizirati niz)
// unosi studij - ispisati studente po studijima, sortirane po datumu rodjenja

package zad01;

import java.util.ArrayList;
import java.util.Calendar;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	Studij studij;
	ArrayList<Predmet> predmeti;
	
	public Osoba(String ime, String prezime, Datum datumRođenja, Studij studij) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
		this.studij = studij;
		this.predmeti = new ArrayList<>();
	}
	public void ispisiPodatkeURedu() {
		System.out.println("Ime: "+ime+" "+prezime+", "+datumRođenja.ispisiDatum());
	}
	public void jeLiPunoljetna() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int starost = trenutnaGodina-this.datumRođenja.godina;
		
		if(starost>18) {
			System.out.println("Osoba je punoljetna");
		}
		else {
			System.out.println("Osoba nije punoljetna.");
		}
	}
	public void ispisiPodatke() {
		System.out.println("Ime: "+ime);
		System.out.println("Prezime: "+prezime);
		System.out.println("Datum rođenja: "+datumRođenja.ispisiDatum());
	}
}
