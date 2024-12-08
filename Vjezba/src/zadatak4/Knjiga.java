package zadatak4;

public class Knjiga extends DokumentKnjiznice {
	private String autor;
	private boolean jeUdzbenik;
	
	public Knjiga(int ID, String nazivDokumenta, String autor, boolean jeUdzbenik) {
		super(ID, nazivDokumenta);
		this.autor = autor;
	}
	@Override
	public int dajPeriodPosudbe() {
		return jeUdzbenik ? 120 : 40;
	}

	@Override
	public boolean jeLiPotrebanPolog() {
		return jeUdzbenik;
	}
 
	@Override
	public double dajIznosPologa() {
		return jeUdzbenik ? 100.0 : 0.0;
	}
	 @Override
	    public String toString() {
	        return super.toString() + ", Autor: " + autor + ", Period posudbe: " + dajPeriodPosudbe();
	    }
}
