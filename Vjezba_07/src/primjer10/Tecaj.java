package primjer10;

import java.util.ArrayList;

public class Tecaj {
	private String naziv;
	private int trajanjeUSatima;
	private ArrayList<Polaznik> polaznici;
	
	public Tecaj (String naziv, int trajanjeUSatima) {
		this.naziv = naziv;
		this.trajanjeUSatima = trajanjeUSatima;
		this.polaznici = new ArrayList<>();
	}
	//Getteri i setteri
	public String getNaziv() {
		return this.naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public int getTrajanjeUSatima() {
		return this.trajanjeUSatima;
	}
	public void setTrajanjeUSatima(int trajanjeUSatima) {
		this.trajanjeUSatima = trajanjeUSatima;
	}
	public ArrayList<Polaznik> getPolaznici() {
		return this.polaznici;
	}
	public void setPolaznici(ArrayList<Polaznik> polaznici) {
		this.polaznici = polaznici;
	}
	public void dodajPolaznika(Polaznik polaznik) {
		polaznici.add(polaznik);
		System.out.println("Polaznik "+polaznik.getIme()+" "+polaznik.getPrezime()+" je dodan na listu");
	}
	public void ukloniPolaznika(int brojPolaznika) {
		for(Polaznik p : polaznici) {
			if(p.getBrojPolaznika() == brojPolaznika) {
				polaznici.remove(p);
				System.out.println("Korisnik sa ID "+p.getBrojPolaznika()+" je uklonjen iz liste");
				break;
			}
		}
	}
	public void ispisiDetalje() {
		System.out.println("Naziv: "+naziv);
		System.out.println("Trajanje: "+trajanjeUSatima);
	}
	@Override
	public String toString() {
		return "Naziv tečaja: "+naziv+", Trajanje "+trajanjeUSatima+" sati";
	}

}

