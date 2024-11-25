package primjer07;

public class Motocikl extends Vozilo {
	String tip;
	
	public Motocikl(String proizvodjac, String model, int godinaProizvodnje, String boja, String tip) {
		super(proizvodjac, model, godinaProizvodnje, boja);
		this.tip = tip;
	}
	@Override
	public void start() {
		System.out.println("Motocikl "+proizvodjac+" "+model+" " +"("+tip+")"+ " je pokrenut.");
	}
}
