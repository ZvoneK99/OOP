package zad2;

public class Knjiga extends DokumentKnjiznice {
	private String autor;

	public Knjiga(int ID, String nazivDokumenta, String autor) {
		super(ID, nazivDokumenta);
		this.autor = autor;
	}
	
	//Getter i setter
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
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
	public int dajIznosPologa() {
		return 20;
	}
	@Override
	public String toString() {
		return super.toString()+" Autor: "+autor;
	}
}
