package primjer05;

public class Vozilo {
	public String marka;
	public String model;
	protected int godinaProizvodnje;
	private double cijena;

	//Konstruktor bez parametara
	public Vozilo() {
		
	}
	public Vozilo(String marka, String model, int godinaProizvodnje, double cijena) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
		this.cijena = cijena;
	}
	public double getCijena() {
		return this.cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+", Model: "+model+", Godina proizvodnje: "+godinaProizvodnje+", Cijena: "+cijena+" EUR.");
	}
}
