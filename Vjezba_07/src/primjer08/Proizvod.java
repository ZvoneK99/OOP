package primjer08;

public class Proizvod {
	String naziv;
	String kategorija;
	double cijena;
	int kolicinaNaSkladistu;
	
	public Proizvod(String naziv, String kategorija, double cijena, int kolicinaNaSkladistu) {
		this.naziv = naziv;
		this.kategorija = kategorija;
		this.cijena = cijena;
		this.kolicinaNaSkladistu = kolicinaNaSkladistu;
	}
	public void dodajNaSkladiste(int kolicina) {
		kolicinaNaSkladistu+=kolicina;
		System.out.println("Nova kolicina na skladistu je: "+kolicinaNaSkladistu);
	}
	public void skiniSaSkladista(int kolicina) {
		if(kolicinaNaSkladistu<kolicina) {
			System.out.println("Kolicina na skladistu je "+kolicinaNaSkladistu+", a vi ste zatrazili kolicinu "+kolicina+", nazalost nemoguce.");
			return;
		}
		else {
			kolicinaNaSkladistu-=kolicina;
			System.out.println("Nova kolicina na skladistu je: "+kolicinaNaSkladistu);
		}
	}
	public void ispisiDetalje() {
		System.out.println("-----------------");
		System.out.println("Naziv: "+naziv);
		System.out.println("Kaegorija: "+kategorija);
		System.out.println("Cijena: "+cijena);
		System.out.println("Kolicina na skladistu: "+kolicinaNaSkladistu);
		System.out.println("-----------------");
	}
}
