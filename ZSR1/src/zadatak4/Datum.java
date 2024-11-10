package zadatak4;

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
	
	public void ispisiDatum() {
		System.out.println(dan+"."+mjesec+"."+godina+".");
	}
	
	public void izracunDanaDoRođendana() {
		Calendar danas = Calendar.getInstance();
		Calendar sljedeciRodjendan = Calendar.getInstance();
		sljedeciRodjendan.set(Calendar.DAY_OF_MONTH, this.dan);
		sljedeciRodjendan.set(Calendar.MONTH, this.mjesec-1);
		sljedeciRodjendan.set(Calendar.YEAR, danas.get(Calendar.YEAR));
		
		if(sljedeciRodjendan.before(danas)) {
			sljedeciRodjendan.add(Calendar.YEAR, 1);
		}
		long razlikaUDanima=(sljedeciRodjendan.getTimeInMillis()-danas.getTimeInMillis())/(1000*60*60*24);
		System.out.println("Sljedeci rodjendan je za: "+razlikaUDanima+" dana.");
	}
}
