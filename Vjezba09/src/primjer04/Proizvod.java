package primjer04;

public class Proizvod {
	String naziv;
	double cijena;
	int kolicina;
	
	public Proizvod(String naziv, double cijena, int kolicina) {
		this.naziv = naziv;
		this.cijena = cijena;
		this.kolicina = kolicina;
	}
	public void dodajKolicinu(int kolicina) {
		this.kolicina+=kolicina;
		System.out.println("Kolicina sada iznosi: "+this.kolicina);
	}
	public void samanjiKolicinu(int kolicina) {
		if(this.kolicina<kolicina) {
			System.out.println("Nema dovoljno proizvoda na stanju");
		}
		else {
			this.kolicina-=kolicina;
			System.out.println("Kolicina je smanjena za: "+kolicina);
		}
	}
	public void ispisiPodatke() {
		System.out.println("Naziv proizvoda: "+naziv+".");
		System.out.println("Cijena proizvoda: "+cijena+" KM.");
		System.out.println("Kolicina na stanju: "+kolicina+".");
	}
}
