package zadatak07;

import java.util.Calendar;

public class Vozilo {
	String marka;
	String model;
	int godinaProizvodnje;
	
	public Vozilo(String marka, String model, int godinaProizvodnje) {
		this.marka = marka;
		this.model = model;
		this.godinaProizvodnje = godinaProizvodnje;
	}
	public int izracunajStarost() {
		int trenutnaGodina = Calendar.getInstance().get(Calendar.YEAR);
		return trenutnaGodina - godinaProizvodnje;
	}
	public void ispisiDetalje() {
		System.out.println("Marka: "+marka+"; Model: "+model+"; Godina proizvodnje: "+godinaProizvodnje+".");
		System.out.println("---------------------------------------------------------------------------------------------------------");
	}
}
