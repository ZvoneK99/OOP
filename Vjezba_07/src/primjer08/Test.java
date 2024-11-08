package primjer08;

public class Test {
	public static void main(String[]args) {
		
		Skladiste skladiste = new Skladiste();
		
		Proizvod p1 = new Proizvod("Coca-cola", "sokovi", 2.5, 1000);
		Proizvod p2 = new Proizvod("Fanta", "sokovi", 3.0, 1500);
		Proizvod p3 = new Proizvod("Pago", "sokovi", 3.5, 900);

		p1.ispisiDetalje();
		p2.dodajNaSkladiste(300);
		p3.skiniSaSkladista(300);
		
		skladiste.dodajProizvod(p1);
		skladiste.dodajProizvod(p2);
		skladiste.pronadiProizvodPoNazivu("Fanta");
		skladiste.prikaziProizvodeIzKategorije("sokovi");

	}
}
