package primjer05;

public class Datum {
	int dan;
	int mjesec;
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	@Override
	public String toString() {
		return dan+"."+mjesec+"."+godina+".";
	}
}
