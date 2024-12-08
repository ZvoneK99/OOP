package zadatak2;

public class Motocikl extends Vozilo {
	private int snagaMotora;
	private String tipMotocikla;
	
	public Motocikl(String marka, String model, int godinaProizvodnje, int snagaMotora, String tipMotocikla) {
		super(marka, model, godinaProizvodnje);
		this.snagaMotora = snagaMotora;
		this.tipMotocikla = tipMotocikla;
	}
	
	public int getSnagaMotora() {
		return this.snagaMotora;
	}
	public void setSnagaMotora(int snagaMotora) {
		this.snagaMotora = snagaMotora;
	}
	public String getTipMotocikla() {
		return this.tipMotocikla;
	}
	public void setTipMotocikla(String tipMotocikla) {
		this.tipMotocikla = tipMotocikla;
	}
	
	@Override
	public int izracunajCijenu() {
int baznaCijena = (2024-getGodinaProizvodnje())*500;
		
		if(getTipMotocikla().equalsIgnoreCase("sportski")) {
			baznaCijena+=3000;
		}
		else if(getTipMotocikla().equalsIgnoreCase("gradski")) {
			baznaCijena+=1000;
		}
		else if(getTipMotocikla().equalsIgnoreCase("terenac")) {
			baznaCijena+=2000;
		}else {
			System.out.print("Unijeli ste nepostojeći tip motocikla.");
		}
		return baznaCijena;
	}
	@Override
	public void ispisiDetalje() {
		System.out.println("Marka: "+getMarka()+", Model: "+getModel()+", Godina proizvodnje: "+getGodinaProizvodnje()+", Snaga motora: "+getSnagaMotora()
							+", Tip motocikla: "+getTipMotocikla()+" Cijena: "+izracunajCijenu()+" EUR");
	}
}