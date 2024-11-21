package primjer01;

import java.util.Calendar;

public class Osoba implements Comparable<Osoba> {
	String ime;
	int godine;
	
	public Osoba(String ime, int godine) {
		this.ime = ime;
		this.godine = godine;
	}
	public void ispisiDetalje() {
		System.out.println("Ime: "+ime+", Godine: "+godine+".");
	}
	@Override
	public int compareTo(Osoba o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public double godineOsobe() {
		double trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		double godinaRođenja = trenutnaGodina-godine;
		return trenutnaGodina-godinaRođenja;
	}
}
