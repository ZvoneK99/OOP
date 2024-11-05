package zadatak_05;

public class Testiranje {
	public static void main(String[]args) {
		Kamion kamić = new Kamion("MAN", 2018, 10);
		Motocikl motor = new Motocikl("Yamaha", 2020, "sportski");
		
		kamić.ispisiDetalje();
		motor.ispisiDetalje();
	}
	
}
