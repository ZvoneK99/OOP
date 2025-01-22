package Zadatak11;

public class Hrana extends Proizvod{
	private double tezina;
	private double cijenaPoKilogramu;
	
	public Hrana(int ID, String naziv, double tezina, double cijenaPoKilogramu) {
		super(ID, naziv);
		this.setTezina(tezina);
		this.setCijenaPoKilogramu(cijenaPoKilogramu);
		
	}
	
	@Override
	public double izracunajCijenu() {
		return tezina * cijenaPoKilogramu;
	}

	public double getTezina() {
		return tezina;
	}

	public void setTezina(double tezina) {
		this.tezina = tezina;
	}

	public double getCijenaPoKilogramu() {
		return cijenaPoKilogramu;
	}

	public void setCijenaPoKilogramu(double cijenaPoKilogramu) {
		this.cijenaPoKilogramu = cijenaPoKilogramu;
	}
	@Override
	public String toString() {
		return super.toString()+" Tezina "+getTezina()+" Cijena po kiloramu "+getCijenaPoKilogramu();
	}
}
