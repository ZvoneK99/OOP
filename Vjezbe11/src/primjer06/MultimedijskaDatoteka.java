package primjer06;

public class MultimedijskaDatoteka {
	public String naziv;
	private double velicina;
	public boolean otvorena;
	public static int brojDatoteka = 0;
	
	//prazan konstruktor
	public MultimedijskaDatoteka() {
		brojDatoteka++;
		this.naziv = "Nova Datoteka "+brojDatoteka;
		this.velicina = 0.0;
		this.otvorena = false;
	}
	//Konstruktor sa parametrima
	public MultimedijskaDatoteka(String naziv, double velicina) {
		brojDatoteka++;
		this.naziv = naziv;
		this.velicina = velicina;
		this.otvorena = false;
	}
	
	//Getter i setter za private velicina;
	public double getVelicina() {
		return this.velicina;
	}
	public void setVelicina(double velicina) {
		this.velicina = velicina;
	}
	
	//metoda za otvaranje
	public void otvori() {
		this.otvorena = true;
	}
	//metoda za zatvaranje
	public void zatvori() {
		this.otvorena = false;
	}
	//metoda za ispis
	public void ispisiDetalje() {
		String status = otvorena ? "Otvorena" : "Zatvorena";
		System.out.println("Naziv: "+naziv+", Veličina: "+velicina+", Status datoteke: "+status+".");
	}
	public static int brojKreiranihDatoteka() {
		return brojDatoteka;
	}
	
}
