/*napisati program koji sadrzi klasu osoba a ima sljedeca polja ime prezime  i datum rođenja
 	datum rođenja je posebna klasa koja ima polja dan mjesec godina
 	u glavnom programu napraviti niz od 10 osoba zatraziti od korisnika unos imena prezimena i datuma rođenja
 	nakon toga ispisati ime prezime i datum rođenja sortirane od najstarijeg do najmlađeg */
 	
 	/*Drugi dio:nastavak->napraviti klasu studij, koja u sebi ima naziv napraviti klasu predmet koja ima polje naziv predmeta, studij, godina studija
 	prosiriti klasu osoba tako da cemo joj dodati polje studij i niz predmeti, kreirati niz 10 studenata(napravljeno) osim ovih podataka sto smo unili 
 	unosimo naziv studija i dodajemo predmete s tog studija
 	mozda bodovi za zadatak;*/

package primjer_06;

import java.util.List;
public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;
	Studij studij;
	List<Predmet> predmeti;

	public Osoba(String ime, String prezime, Datum datumRođenja, Studij studij, List<Predmet> predmeti) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
		this.studij = studij;
		this.predmeti = predmeti;
	}
 	
	public boolean jePunoljetna() {
		int trenutnaGodina = java.time.LocalDate.now().getYear();
		return (trenutnaGodina - datumRođenja.godina) >=18;
	}
	
public void ispisiDetalje() {
	System.out.println("Ime i prezime: "+ime+" "+prezime);
	System.out.println("Datum rođenja: "+datumRođenja);
	System.out.println("Studij: "+studij);
	System.out.println("Predmeti: "+predmeti);
	 for (Predmet predmet : predmeti) {
         System.out.println("- " + predmet);
     }
	System.out.println("Punoljetna: "+(jePunoljetna()? "Da" : "Ne"));
	}
}

