package Zadatak2novo;

public abstract class CestovnoVozilo implements Vozilo {
	private String modelVozila;
	private String registracijaVozila;
	
	public CestovnoVozilo(String modelVozila, String registracijaVozila) {
		this.modelVozila = modelVozila;
		this.registracijaVozila = registracijaVozila;
	}
	@Override
	public abstract int dohvatiMaksimalanBrojPutnika();

	@Override
	public abstract double dohvatiMaksimalnuNosivost();
	
	public String getModelVozila() {
		return modelVozila;
	}
	public void setModelVozila(String modelVozila) {
		this.modelVozila = modelVozila;
	}
	public String getRegistracijaVozila() {
		return registracijaVozila;
	}
	public void setRegistracijaVozila(String registracijaVozila) {
		this.registracijaVozila = registracijaVozila;
	}
	
	@Override
	public String toString() {
		return "Model vozila: "+getModelVozila()+", Registracija: "+getRegistracijaVozila();
	}
}
