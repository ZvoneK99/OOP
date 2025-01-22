package Zadatak12;

public class TerminPregleda {
	private Pacijent pacijent;
	private Lijecnik lijecnik;
	private String datum;
	
	public TerminPregleda(Pacijent pacijent, Lijecnik lijecnik, String datum) {
		this.setPacijent(pacijent);
		this.setLijecnik(lijecnik);
		this.setDatum(datum);
	}

	public Pacijent getPacijent() {
		return pacijent;
	}

	public void setPacijent(Pacijent pacijent) {
		this.pacijent = pacijent;
	}

	public Lijecnik getLijecnik() {
		return lijecnik;
	}

	public void setLijecnik(Lijecnik lijecnik) {
		this.lijecnik = lijecnik;
	}

	public String getDatum() {
		return datum;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}
 public void ispisiDetaljeTermina() {
    System.out.println("Detalji termina pregleda:");
    System.out.println("Pacijent: " + (pacijent != null ? pacijent.getIme() : "Nepoznato"));
    System.out.println("Liječnik: " + (lijecnik != null ? lijecnik.getIme() + " (" + lijecnik.getSpecijalizacija() + ")" : "Nepoznato"));
    System.out.println("Datum: " + datum);
 	}
}