package zadatak07;

public class Datum implements Comparable<Datum>{
	int dan;
	int mjesec;
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	
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
	@Override
	public String toString() {
		return dan+"."+mjesec+"."+godina+".";
	}
}
