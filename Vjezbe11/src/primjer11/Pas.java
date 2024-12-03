package primjer11;

public class Pas extends Zivotinja implements KucniLjubimac{
	public Pas(String ime) {
		super(ime);
	}
	@Override 
	public void oglasiSe() {
		System.out.println(ime+" kaže vau.");
	}
	@Override
	public void igrajSe() {
		System.out.println(ime+" se igra s loptom.");
	}
}
