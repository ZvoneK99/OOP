package primjer02;

public class Proizvod {
	String naziv;
	double cijena;
	String kategorija;
	
	public Proizvod(String naziv, double cijena, String kategorija) {
		this.naziv = naziv;
		this.cijena = cijena;
		this.kategorija = kategorija;
	}
	public void usporediCijene(double cijena) {
		if(this.cijena>cijena) {
			System.out.println("Proizvod ima vecu cijenu od one koju smo proslijedili.");
		}
	}

	public void ispisiDetalje() {
		System.out.println("--------------------------");
		System.out.println("Podatci o proizvodu:");
		System.out.println("Naziv proizvoda "+naziv);
		System.out.println("Cijena proivoda: "+cijena);
	}
}
