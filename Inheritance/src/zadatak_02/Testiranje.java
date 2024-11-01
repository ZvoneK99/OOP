package zadatak_02;

public class Testiranje {
	public static void main(String[]args) {
		Osoba osoba1 = new Osoba("Ante", 25);
		Zaposlenik zaposlenik1 = new Zaposlenik("Zvone", 63, "Front-End developer");
		
		osoba1.ispisiDetalje();
		zaposlenik1.ispisiDetalje();
	}
}
