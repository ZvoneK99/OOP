package primjer_02;

public class Papiga extends Zivotinja {
	
	public Papiga(String ime, String vrsta, int starost) {
		super(ime, vrsta, starost);
	}
	@Override
	public void oglasiSe() {
		System.out.println("Papiga govori: Pozdrav");
	}
}
