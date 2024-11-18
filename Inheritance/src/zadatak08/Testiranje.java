package zadatak08;

public class Testiranje {
	public static void main(String[]args) {
		Automobil a1 = new Automobil("BMW", 2020, 5);
		Kamion k1 = new Kamion("Volvo", 2010, 20);
		
		a1.ispisiDetalje();
		k1.ispisiDetalje();
	}
}
