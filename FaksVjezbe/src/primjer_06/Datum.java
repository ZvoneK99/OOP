package primjer_06;

public class Datum implements Comparable<Datum> {
	int dan;
	int mjesec; 
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	
	public boolean jeDatumValjan() {
		if(mjesec < 1 || mjesec >12) {
			return false;
		}
		int[] daniUMjesecu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(mjesec == 2 && jePrijestupnaGodina()) {
			daniUMjesecu[1] = 29;
		}
		if(dan<1 || dan>daniUMjesecu[mjesec-1]) {
			return false;
		}
		return true;
	}
	
	private boolean jePrijestupnaGodina() {
		return(godina%4 == 0 && godina % 100 != 0) || (godina % 400 == 0);
	}
	public String ispisiDatum() {
		return dan+"."+mjesec+"."+godina;
	}
	public int compareTo(Datum drugiDatum) {
		if(this.godina != drugiDatum.godina) {
			return this.godina - drugiDatum.godina;
		}
		else if(this.mjesec != drugiDatum.mjesec) {
			return this.mjesec - drugiDatum.mjesec;
		}
		else {
			return this.dan - drugiDatum.dan;
		}
	}
	@Override
	public String toString() {
	    return dan + "." + mjesec + "." + godina;
	}


}