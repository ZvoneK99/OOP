package primjer05;

public class Test {
	public static void main(String[]args) {
		Vozilo v1 = new Vozilo();
		Vozilo v2 = new Vozilo("Mercedes", "C-Klasa", 2024, 150000);
		
		v1.ispisiDetalje();
		v2.ispisiDetalje();
		
		v2.setCijena(40000);
		System.out.println("Nova cijena za " + v2.marka + " " + v2.model + ": " + v2.getCijena() + " EUR");
	}
}
