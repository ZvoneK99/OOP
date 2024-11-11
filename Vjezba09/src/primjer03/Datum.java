package primjer03;

import java.util.Calendar;

public class Datum {
	int dan;
	int mjesec;
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	//Metoda provjerava je li osoba punoljetna
	public boolean jePunoljetan() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		int starost = trenutnaGodina - this.godina;
		if(starost>18) {
			return true;
		}
		else {
			return false;
		}
	}
	//Metoda za provjeru ispravnosti datuma
	public boolean ispravnostDatume() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		if(this.godina>trenutnaGodina) {
			System.out.println("Unos godine je pogrešan.");
			return false;
		}			
			if(this.mjesec<1 || this.mjesec>12) {
				System.out.println("Unos mjeseca je pogresan: ");
				return false;
			}
				
				if(dan<1 || dan>31) {
					System.out.println("Taj dan u mjesecu ne postoji.");
					return false;
				}
				return true;
	}
	@Override
	public String toString() {
		return dan+"."+mjesec+"."+godina;
	}
	
}
