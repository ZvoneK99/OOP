package primjer_02;

public class Lav extends Zivotinja {
	
	public Lav(String ime, String vrsta, int starost) {
		super(ime, vrsta, starost);
	}
	@Override
	public void oglasiSe() {
		System.out.println("Lav riče.");
	}
}