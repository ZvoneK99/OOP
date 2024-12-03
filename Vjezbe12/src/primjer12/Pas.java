package primjer12;

public class Pas extends Zivotinja {
	public Pas(String ime) {
		super(ime);
	}
	
	@Override
	public void glasajSe() {
		System.out.println(getIme()+ "kaze Vau");
	}
	@Override
	public void jedem() {
		System.out.println(getIme()+" jede.");
	}

}
