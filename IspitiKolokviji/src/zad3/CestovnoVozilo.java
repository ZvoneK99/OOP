package zad3;

public abstract class CestovnoVozilo implements Vozilo {
	String modelVozila;
	String registracijskaOznaka;
	
	public CestovnoVozilo(String modelVozila, String registracijskaOznaka) {
		this.modelVozila = modelVozila;
		this.registracijskaOznaka = registracijskaOznaka;
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

}
