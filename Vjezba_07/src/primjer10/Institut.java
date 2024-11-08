package primjer10;

import java.util.ArrayList;

public class Institut {
	private ArrayList<Tecaj> tecajevi;
	
	public Institut() {
		this.tecajevi = new ArrayList<>();
	}
	//Getteri i setteri
	public ArrayList<Tecaj> getTecajevi() {
		return this.tecajevi;
	}
	public void setTecajevi(ArrayList<Tecaj>tecajevi) {
		this.tecajevi = tecajevi;
	}
	public void dodajTecaj(Tecaj tecaj) {
		tecajevi.add(tecaj);
		System.out.println("Tecaj "+tecaj+" je dodan u listu tecajeva.");
	}
	public void prikaziSveTecaje() {
		for(Tecaj t : tecajevi) {
			System.out.println(t);
		}
	}
	public void prikaziPolaznikeZaTecaj(String naziv) {
		for(Tecaj t : tecajevi) {
			if(t.getNaziv().equals(naziv)) {
				for(Polaznik p : t.getPolaznici()) {
					p.ispisiDetalje();
				}
			}
		}
	}
}
