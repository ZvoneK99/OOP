package zadatak08;

public class Kamion extends Vozilo {
	double nosivost;
	
	public Kamion(String marka, int godinaProizvodnje, double nosivost) {
		super(marka, godinaProizvodnje);
		this.nosivost = nosivost;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+", Godina proizvodnje: "+godinaProizvodnje+", Nosivost: "+nosivost+" tona.");
	}

}
