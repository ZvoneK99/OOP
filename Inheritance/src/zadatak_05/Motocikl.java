package zadatak_05;

public class Motocikl extends Vozilo {
	String tipMotora;
	
	public Motocikl(String marka, int godinaProizvodnje, String tipMotora) {
		super(marka, godinaProizvodnje);
		this.tipMotora = tipMotora;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Motor marke "+marka+" je proizveden "+godinaProizvodnje+". godine, a motor je "+tipMotora);
	}
}
