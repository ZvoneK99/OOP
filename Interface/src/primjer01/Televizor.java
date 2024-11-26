package primjer01;

public class Televizor implements Uredaj {
	String proizvodjac;
	String model;
	boolean ukljucen;
	
	public Televizor(String proizvodjac, String model) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.ukljucen = false;
	}
	
	@Override
	public void ukljuci() {
		ukljucen = true;
		System.out.println("Televizor "+proizvodjac+" "+model+" je ukljucen.");
	}

	@Override
	public void iskljuci() {
		ukljucen = false;
		System.out.println("Televizor "+proizvodjac+" "+model+" je iskljucen.");
	}

	@Override
	public boolean jeUkljucen() {
			return ukljucen;
	}

}
