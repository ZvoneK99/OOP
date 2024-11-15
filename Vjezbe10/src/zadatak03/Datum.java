package zadatak03;

public class Datum implements Comparable<Datum> {
	private int dan; 
	private int mjesec;
	private int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	
	//Getteri za dan,mjesec,godina;
	public int getDan() {
		return this.dan;
	}
	public int getMjesec() {
		return this.mjesec;
	}
	public int getGodina() {
		return this.godina;
	}
	@Override
	public String toString() {
		return dan+"."+mjesec+"."+godina+".";
	}
	
	//Uspoređivanje datuma
	public int compareTo(Datum drugiDatum) {
		if(this.godina != drugiDatum.godina) {
			return Integer.compare(godina, drugiDatum.godina);
		}
		else if(this.mjesec != drugiDatum.mjesec) {
			return Integer.compare(mjesec, drugiDatum.mjesec);
		}
		else {
			return Integer.compare(dan, drugiDatum.dan);
		}
	}
}
