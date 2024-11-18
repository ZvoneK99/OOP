package zadatak09;

public class Proizvod {
	String naziv;
	double cijena;
	int kolicina;
	
	public Proizvod(String naziv, double cijena, int kolicina) {
		this.naziv = naziv;
		this.cijena = cijena;
		this.kolicina = kolicina;
	}
	//Getter za cijenu
	public double getCijena() {
	    return cijena;
	}

	//Metoda za dodavanje količine
	public void dodajKolicinu(int kolicina) {
		this.kolicina+=kolicina;
		System.out.println("Dodali ste kolicinu: "+kolicina+", nova kolicina na stanju iznosi: "+this.kolicina);
	}
	//Metoda za smanjenje količine
	public void smanjiKolicinu(int kolicina) {
		if(this.kolicina>=kolicina) {
			this.kolicina-=kolicina;
			System.out.println("Smanjili ste kolicinu za: "+kolicina+", nova kolicina na stanju iznosi: "+this.kolicina);
		}
		else {
			System.out.println("Nema dovoljnog stanja na kolicini.");
		}
	}
	//Simulacija prodaje
	public boolean prodaj(int kolicina) {
		if(this.kolicina>=kolicina) {
			this.kolicina-=kolicina;
			return true;
		}
		return false;
	}
	//Filtriranje proizvoda po cijeni
	public boolean filtriranjeProizvoda(int min, int max) {
		if(this.cijena>min && this.cijena<max) {
			return true;
		}
		return false;
	}
	//Ispis naziva proizvoda
	public void ispisiNazivProizvoda() {
		System.out.println(naziv);
	}
	//Ispis detalja
	public void ispisiDetalje() {
		System.out.println("Naziv: "+naziv+", Cijena: "+cijena+", Količina: "+kolicina+".");
	}
}
