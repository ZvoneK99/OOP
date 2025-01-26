package Zadatak22;

public class Stjuardesa extends Osoba {
	private int brojJezika;
	
	public Stjuardesa(String ime, String prezime, int brojJezika) {
		super(ime, prezime);
		this.setBrojJezika(brojJezika);
	}

	@Override
	public String uloga() {
		return "Stjuardesa";
	}

	public int getBrojJezika() {
		return brojJezika;
	}

	public void setBrojJezika(int brojJezika) {
		this.brojJezika = brojJezika;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString()).append(" Broj jezika ").append(getBrojJezika());
		return sb.toString();
	}
}
