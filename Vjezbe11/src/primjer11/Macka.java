package primjer11;

public class Macka extends Zivotinja implements KucniLjubimac {

	public Macka(String ime ) {
		super(ime);
	}
	
	@Override
	public void oglasiSe() {
		System.out.println(ime+" kaže Mijau.");
	}
	@Override
	public void igrajSe() {
		System.out.println(ime+" se igra s klupkom vune.");
	}

}
