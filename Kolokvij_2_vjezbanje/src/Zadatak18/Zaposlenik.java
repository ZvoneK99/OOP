package Zadatak18;

public class Zaposlenik extends Osoba {
	String odjel;
	int brojGodinaRadnogStaza;
	
	public Zaposlenik(int ID, String imePrezime, String odjel, int brojGodinaRadnogStaza) {
		super(ID, imePrezime);
		this.odjel = odjel;
		this.brojGodinaRadnogStaza = brojGodinaRadnogStaza;
	}
	public Zaposlenik(Zaposlenik z) {
		super(z);
		this.odjel = z.odjel;
		this.brojGodinaRadnogStaza = z.brojGodinaRadnogStaza;
	}
	
	public String ispisiDetalje() {
		return "Odjel: "+odjel+" Broj godina radnog staza: "+brojGodinaRadnogStaza; 
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString()).append("Odjel ").append(odjel).append("Broj godina radnog staza ").append(brojGodinaRadnogStaza);
	return sb.toString();	
	}
	
	
}
