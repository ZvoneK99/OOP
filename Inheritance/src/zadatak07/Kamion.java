package zadatak07;

public class Kamion extends Vozilo {
	double nosivost;
	
	public Kamion(String marka, String model, int godinaProizvodnje, double nosivost) {
		super(marka, model, godinaProizvodnje);
		this.nosivost = nosivost;
	}
	public void provjeriNosivost() {
		if(nosivost<=0) {
			System.out.println("Neispravna nosivost.");
		}
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+"; Model: "+model+"; Godina proizvodnje: "+godinaProizvodnje+"; Nosivost: "+nosivost+" tona.");
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
