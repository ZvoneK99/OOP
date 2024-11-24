package primjer05;

public class Test {
	public static void main(String[]args) {
		Vozilo v1 = new Vozilo();
		Vozilo v2 = new Vozilo("Mercedes", "C-Klasa", 2024, 150000);
		
		
		Automobil a1 = new Automobil();
		Automobil a2 = new Automobil("BMW", "M5", 2024, 25000,5, "dizel");
	//	v1.ispisiDetalje();
		//v2.ispisiDetalje();
		
		a1.ispisiDetalje();
		a2.ispisiDetalje();
		
		//v2.setCijena(40000);
		//System.out.println("Nova cijena za " + v2.marka + " " + v2.model + ": " + v2.getCijena() + " EUR");
	}
}
