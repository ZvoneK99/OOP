package zadatak_04;

public class Testiranje {
	public static void main(String[]args) {
		Vozilo voz = new Vozilo("Mercedes", 1996);
		Automobil auto = new Automobil("BMW", 2000, 5);
		Kamion kamić = new Kamion("Volvo", 2010, 15.6);
		
		voz.ispisiDetalje();
		auto.ispisiDetalje();
		kamić.ispisiDetalje();
	}
}
