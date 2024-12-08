package zadatak2;

public abstract class Vozilo {
	private String marka;
	private String model;
	private int godinaProizvodnje;
	
	public Vozilo(String marka, String model, int godinaProizvodnje) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	//Getteri i Setteri
	public String getMarka() {
		return this.marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getGodinaProizvodnje() {
		return this.godinaProizvodnje;
	}
	public void setGodinaProizvodnje(int godinaProizvodnje) {
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public abstract int izracunajCijenu();
	
	public void ispisiDetalje() {
		System.out.println("Marka: "+getMarka()+", Model: "+getModel()+", Godina proizvodnje: "+getGodinaProizvodnje());
	}
}
