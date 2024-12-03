package primjer12;

public class Ptica extends Zivotinja {

	public Ptica(String ime) {
		super(ime);
	}
	
	@Override
	public void glasajSe() {
		System.out.println(getIme()+" pjeva.");
	}
	@Override
	public void jedem() {
		System.out.println(getIme()+" jede.");
	}
}
