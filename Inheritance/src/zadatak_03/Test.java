package zadatak_03;

public class Test {
	public static void main(String[]args) {
		Vozilo voz1 = new Vozilo("Mercedes", 2020);
		Automobil auto1 = new Automobil("BMW", 2025, 5);
		
		voz1.ispisiDetalje();
		auto1.ispisiDetalje();
	}
}
