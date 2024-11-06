//Koristenje private za atribute i getteri i setteri

package primjer_01;

public class Vozilo {
	private String marka;
	private String model;
	private int godinaProizvodnje;
	private double cijena;
	
	public Vozilo(String marka, String model, int godinaProizvodnje, double cijena) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
		this.cijena = cijena;
	}
	//Getter i Setter za marku
	public String getMarka() {
		return this.marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	//Getter i Setter za model
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//Getter i Setter za godinaProizvodnje
	public int getGodinaProizvodnje() {
		return this.godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	//Getter i Setter za cijena
	public double getCijena() {
		return this.cijena;
	}
	public void setCijena(double cijena) {
		this.cijena = cijena;
	}
	public void ispisiDetalje() {
		System.out.println("------Podatci o Vozilu-----");
		System.out.println("Marka vozila: "+marka);
		System.out.println("Model vozila: "+model);
		System.out.println("Godina proizvodnje: "+godinaProizvodnje);
		System.out.println("Cijena vozila: "+cijena+"$");
	}
}
