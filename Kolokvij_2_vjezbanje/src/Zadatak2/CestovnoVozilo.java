package Zadatak2;

public abstract class CestovnoVozilo implements Vozilo {
	private String modelVozila;
	private String registracijaVozila;
	
	public CestovnoVozilo(String modelVozila, String registracijaVozila) {
		this.modelVozila = modelVozila;
		this.registracijaVozila = registracijaVozila;
	}
	public String getModelVozila() {
		return this.modelVozila;
	}
	public void setModelVozila(String modelVozila) {
		this.modelVozila = modelVozila;
	}
	
	public String getRegistracijaVozila() {
		return this.registracijaVozila;
	}
	public void setRegistracijaVozila(String registracijaVozila) {
		this.registracijaVozila = registracijaVozila;
	}
	
	@Override
	public int dohvatiMaksimalanBrojPutnika() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dohvatiMaksimalnuNosivost() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Model vozila "+getModelVozila()+", Registracija vozila: "+getRegistracijaVozila();
	}
}
