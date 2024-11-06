package primjer_04;

public class EBook extends Knjiga {
	private String format;
	private double velicinaDatoteke;
	
	public EBook(String naslov, String autor, int godinaIzdanja, boolean dostupna, String format, double velicinaDatoteke) {
		super(naslov, autor, godinaIzdanja, dostupna);
		this.format = format;
		this.velicinaDatoteke = velicinaDatoteke;
	}
	public String getFormat() {
		return this.format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public double getVelicinaDatoteke() {
		return this.velicinaDatoteke;
	}
	public void setVelicinaDatoteke(double velicinaDatoteke) {
		this.velicinaDatoteke = velicinaDatoteke;
	}
	@Override
	public void ispisiDetalje() {
		String stanje = getDostupna() ? "Dostupna" : "Nedostupna";
		System.out.println("-----Detalji o EBook-----");
		System.out.println("Naslov knjige: "+getNaslov());
		System.out.println("Autor: "+getAutor());
		System.out.println("Godina izdanja: "+getGodinaIzdanja());
		System.out.println("Knjiga je trenutno: "+stanje);
		System.out.println("Format EBook-a: "+format);
		System.out.println("Velicina EBook datoteke: "+velicinaDatoteke);
	}
}
