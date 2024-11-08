package primjer12;

public class Datum {
	int dan;
	int mjesec;
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	public int compareTo(Datum pomocniDatum) {
		if(this.godina != pomocniDatum.godina) {
			return this.godina - pomocniDatum.godina;
		}
		else if(this.mjesec != pomocniDatum.mjesec) {
			return this.mjesec - pomocniDatum.mjesec;
		}
		else {
			return this.dan - pomocniDatum.dan;
		}
	}
	
	@Override 
	public String toString() {
		return dan+"."+mjesec+"."+godina+".";
	}
}
