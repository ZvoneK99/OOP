package zadatak_04;

public class Kamion extends Vozilo {
	double nosivost;
	
	public Kamion(String marka, int godinaProizvodnje, double nosivost) {
		super(marka, godinaProizvodnje);
		this.nosivost = nosivost;
	}
	public void ispisiDetalje() {
		System.out.println("Marka automobila je "+marka+", godina proizvodnje "+godinaProizvodnje+ " nosivost je "+nosivost+" tona");

	}
}
