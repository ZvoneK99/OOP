package Zadatak12;

public abstract class Zaposlenik implements Osoba {
	private String ime;
	private int godine;
	private double placa;
	
	public Zaposlenik(String ime, int godine, double placa) {
		this.setIme(ime);
		this.setGodine(godine);
		this.setPlaca(placa);
	}
	
	
	@Override
	public String dohvatiIme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int dohvatiGodine() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {
		this.ime = ime;
	}


	public int getGodine() {
		return godine;
	}


	public void setGodine(int godine) {
		this.godine = godine;
	}


	public double getPlaca() {
		return placa;
	}


	public void setPlaca(double placa) {
		this.placa = placa;
	}

}
