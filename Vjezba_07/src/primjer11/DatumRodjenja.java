package primjer11;

public class DatumRodjenja {
	int dan;
	int mjesec;
	int godina;
	
	public DatumRodjenja(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	public int compareTo(DatumRodjenja drugiDatum) {
		if(this.godina != drugiDatum.godina) {
			return this.godina - drugiDatum.godina;
		}
		else if(this.mjesec != drugiDatum.mjesec)	{
			return this.mjesec - drugiDatum.mjesec;
		}
		else {
			return this.dan - drugiDatum.dan;
		}
	}
	
	@Override
	public String toString() {
		return dan+"."+mjesec+"."+godina+".";
	}
}
