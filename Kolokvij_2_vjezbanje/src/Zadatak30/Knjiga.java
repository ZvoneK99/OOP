package Zadatak30;

public class Knjiga extends DokumentKnjiznice {
	String autor;
	
	public Knjiga(int ID, String nazivDokumenta, String autor) {
		super(ID, nazivDokumenta);
		this.autor = autor;
	}

	@Override
	public int dajPeriodPosudbe() {
		return 14;
	}
	@Override
	public boolean jeLiPotrebanPolog() {
		return false;
	}
	@Override
	public double dajIznosPologa() {
		return 0;
	}
	@Override
	public String toString() {
		return super.toString()+" Autor "+autor;
	}
}
