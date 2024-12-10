package K2Z2;

import zad3.Vozilo;

public abstract class CestovnoVozilo implements Vozilo {
	private String modelVozila;
	private String registracijaVozila;
	
	public CestovnoVozilo(String modelVozila, String registracijaVozila) {
		this.modelVozila = modelVozila;
		this.registracijaVozila = registracijaVozila;
	}
	
	//Getter i setter
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
		return "Model vozila: "+modelVozila+", Registracija: "+registracijaVozila+"."; 
	}

}
