package primjer_01;

public class Test {
	public static void main(String[]args) {
		Vozilo vozilo = new Vozilo("Mercedes", "C-class", 2024, 80000);
		Automobil auto = new Automobil("Ferari", "LaFerarri", 2020, 200000, 3);
		Kamion kamić = new Kamion("Volvo", "F21", 2023, 250000, 27.5);
		
		vozilo.ispisiDetalje();
		auto.ispisiDetalje();
		kamić.ispisiDetalje();
	}
}
