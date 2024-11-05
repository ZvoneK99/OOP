/*napisati program koji sadrzi klasu osoba a ima sljedeca polja ime prezime  i datum rođenja
 	datum rođenja je posebna klasa koja ima polja dan mjesec godina
 	u glavnom programu napraviti niz od 10 osoba zatraziti od korisnika unos imena prezimena i datuma rođenja
 	nakon toga ispisati ime prezime i datum rođenja sortirane od najstarijeg do najmlađeg uz to cemo ispisati je li osoba punoljetna
 	ograničiti da korisnik ne unosi gluposti npr da je osoba rođena 2030*/

package primjer_06;

public class Osoba {
	String ime;
	String prezime;
	Datum datumRođenja;

	public Osoba(String ime, String prezime, Datum datumRođenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.datumRođenja = datumRođenja;
	}
 	
	public boolean jePunoljetna() {
		int trenutnaGodina = java.time.LocalDate.now().getYear();
		return (trenutnaGodina - datumRođenja.godina) >=18;
	}
	
public void ispisiDetalje() {
	System.out.println("Ime i prezime: "+ime+" "+prezime);
	System.out.println("Datum rođenja: "+datumRođenja);
	System.out.println("Punoljetna: "+(jePunoljetna()? "Da" : "Ne"));
	}
}

