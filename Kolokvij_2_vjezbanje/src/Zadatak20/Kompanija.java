package Zadatak20;

import java.util.ArrayList;

public class Kompanija {
	private ArrayList<Zaposlenik> zaposlenici;
	
	public Kompanija() {
		this.zaposlenici = new ArrayList<Zaposlenik>();
	}
	
	public ArrayList<Zaposlenik> getZaposlenici() {
		return zaposlenici;
	}
	public void setZaposlenik(ArrayList<Zaposlenik> zaposlenici) {
		this.zaposlenici = zaposlenici;
	}
	
	public void dodajZaposlenika(Zaposlenik z) {
		zaposlenici.add(z);
	}
	public void ispisiSveZaposlenike() {
		System.out.println("Zaposlenici:");
		for(Zaposlenik z : zaposlenici) {
			System.out.println(z);
		}
	}
	public void filtrirajPoVrsti(String vrsta) {
		System.out.println("Zaposlenici :"+vrsta);
		for(Zaposlenik z : zaposlenici) {
			if(z.vrstaOsobe().equalsIgnoreCase(vrsta)) {
				System.out.println(z);
			}
		}
	}
	public void najplacenijiZaposlenik() {
		Zaposlenik najplaceniji = zaposlenici.get(0);
		for(Zaposlenik z : zaposlenici) {
			if(z.izracunajPlacu() > najplaceniji.izracunajPlacu()) {
				najplaceniji = z;
			}
		}
		System.out.println("Najplaceniji zaposlenik:");
		System.out.println(najplaceniji.getIme()+" "+najplaceniji.getPrezime()+" sa placom "+najplaceniji.izracunajPlacu());
	}
	public void ukupnaPlaca() {
		double ukupnaPlaca = 0;
		for(Zaposlenik z : zaposlenici) {
			ukupnaPlaca+=z.izracunajPlacu();
		}
		System.out.println("Ukupna placa za sve zaposlenike iznosi "+ukupnaPlaca);
	}
}
