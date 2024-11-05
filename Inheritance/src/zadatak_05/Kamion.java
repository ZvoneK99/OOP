package zadatak_05;

public class Kamion extends Vozilo {
	int nosivost;
	
	public Kamion(String marka, int godinaProizvodnje, int nosivost) {
		super(marka, godinaProizvodnje);
		this.nosivost = nosivost;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Kamion marke "+marka+" je proizveden "+godinaProizvodnje+". godine i ima nosivost od "+nosivost+" tona.");
	}
	
}
