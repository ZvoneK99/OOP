package primjer01;

public class Datum {
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
			return Integer.compare(this.godina, drugiDatum.godina);
		}
		else if(this.mjesec != drugiDatum.mjesec) {
			return Integer.compare(this.mjesec, drugiDatum.mjesec);
		}
		else {
			return Integer.compare(this.dan, drugiDatum.dan);
		}
	}

	public String ispisiDatum() {
		return dan+"."+mjesec+"."+godina+".";
		}
	public static void main(String[]args) {
		Datum datum = new Datum(2, 9, 1999);
		System.out.println(datum.ispisiDatum());
	}
	
}
