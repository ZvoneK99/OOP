package Zadatak22;

import java.util.ArrayList;

public class KomercijalniLet implements Let {
	private int brojPutnika;
	private double cijenaPoPutniku;
	private Avion avion;
	private ArrayList<Osoba> osoblje;
	
	public KomercijalniLet(int brojPutnika, double cijenaPoPutniku, Avion avion) {
		this.setBrojPutnika(brojPutnika);
		this.setCijenaPoPutniku(cijenaPoPutniku);
		this.setAvion(avion);
		this.setOsobe(new ArrayList<Osoba>());
	}
	@Override
	public void zapocniLet() {
		if(brojPutnika > avion.getKapacitetPutnika()) {
			System.out.println("Broj putnika premasuje broj sjedala");
		}
		else {
			System.out.println("Let započinje.");
		}
	}
	@Override
	public double izracunajTroskove() {
		return getBrojPutnika() * getCijenaPoPutniku();
	}
	public void dodajOsobu(Osoba o) {
		osoblje.add(o);
	}
	public int getBrojPutnika() {
		return brojPutnika;
	}
	public void setBrojPutnika(int brojPutnika) {
		this.brojPutnika = brojPutnika;
	}
	public double getCijenaPoPutniku() {
		return cijenaPoPutniku;
	}
	public void setCijenaPoPutniku(double cijenaPoPutniku) {
		this.cijenaPoPutniku = cijenaPoPutniku;
	}
	public Avion getAvion() {
		return avion;
	}
	public void setAvion(Avion avion) {
		this.avion = avion;
	}
	public ArrayList<Osoba> getOsobe() {
		return getOsobe();
	}
	public void setOsobe(ArrayList<Osoba> osoblje) {
		this.osoblje = osoblje;
	}
	@Override
	public String toString() {
		return "Broj putnika "+getBrojPutnika()+" Cijena po putniku "+getCijenaPoPutniku()+" Avion "+getAvion();
	}
}
