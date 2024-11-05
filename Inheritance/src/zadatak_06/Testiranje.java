package zadatak_06;

public class Testiranje {
	public static void main(String[]args) {
		Osoba osoba1 = new Osoba("Zvone", "Kožul", 1999);
		Pacijent pacijent1 = new Pacijent("Ante", "Bubalo", 2005, 196, "nadutost");
		Liječnik lijecnik1 = new Liječnik("Jozo", "Kraljevic", 1985, "kardiologija", 22);
		
		osoba1.ispisiDetalje();
		pacijent1.ispisiDetalje();
		lijecnik1.ispisiDetalje();
	}
}
