package primjer12;

public class Macka extends Zivotinja {
	public Macka(String ime) {
		super(ime);
	}
	
	@Override
	public void glasajSe() {
		System.out.println(getIme()+" kaze Mijau.");
	}
	@Override
	public void jedem() {
		System.out.println(getIme()+" jede.");
	}
}
