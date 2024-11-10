package Datumi;

public class Datum {
	int dan;
	int mjesec;
	int godina;
	
	public Datum(int dan, int mjesec, int godina) {
		this.dan = dan;
		this.mjesec = mjesec;
		this.godina = godina;
	}
	public boolean jePrijestupnaGodina() {		
		return (godina % 4 == 0 && (godina % 100 != 0 || godina % 400 == 0));
	}
	public String ispisiDatumTekstualno() {
		String[] mjeseci = {"siječanj", "veljača", "ožujak", "travanj", "svibanj", "lipanj", "srpanj", "kolovoz", "rujan", "listopad",
				"studeni", "prosinac"};
		
	return dan+"."+mjeseci[mjesec-1]+"."+godina+".";
	}
}
