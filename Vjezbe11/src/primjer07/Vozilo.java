package primjer07;

public class Vozilo {
	String proizvodjac;
	String model;
	int godinaProizvodnje;
	String boja;
	
	public Vozilo(String proizvodjac, String model, int godinaProizvodnje, String boja) {
		this.proizvodjac = proizvodjac;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
		this.boja = boja;
	}
	public void start() {
		System.out.println("Vozilo "+proizvodjac+" "+model+" je pokrenuto");
	}
	public String toString() {
		return "Proizvođač: "+proizvodjac+", Model: "+model+", Godina proizvodnje: "+godinaProizvodnje+", Boja: "+boja+".";
	}
}
