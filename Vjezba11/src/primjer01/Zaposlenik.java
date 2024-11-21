package primjer01;

public class Zaposlenik extends Osoba {
	double placa;
	
	public Zaposlenik(String ime, int godine, double placa) {
		super(ime, godine);
		this.placa = placa;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Ime: "+ime+", Godine: "+godine+", Placa: "+placa+"$.");
	}
}
