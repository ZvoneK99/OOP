package Zadatak17;

import java.util.ArrayList;

public class Natjecatelj extends Osoba implements Natjecanje{
	private int brojBodova;
	private ArrayList<String> natjecanja;
	
	public Natjecatelj(int ID, String imePrezime, int brojBodova) {
		super(ID, imePrezime);
		this.setBrojBodova(brojBodova);
		this.setNatjecanja(new ArrayList<String>());
	}
	
	@Override
	public double izracunajRezultat() {
		return (int) (brojBodova);
	}
	
	public void dodajNatjecatelja(String natjecanje) {
		natjecanja.add(natjecanje);
	}
	
	public void dohvatiNatjecanja() {
		for(String n : natjecanja) {
			System.out.println(n);
		}
	}
	//getteri i setteri
	public int getBrojBodova() {
		return brojBodova;
	}

	public void setBrojBodova(int brojBodova) {
		this.brojBodova = brojBodova;
	}

	public ArrayList<String> getNatjecanja() {
		return natjecanja;
	}

	public void setNatjecanja(ArrayList<String> natjecanja) {
		this.natjecanja = natjecanja;
	}

	@Override
	public void prikaziDetalje() {
		StringBuilder sb = new StringBuilder();
		super.prikaziDetalje();
		sb.append("Broj bodova ").append(getBrojBodova()).append("Natjecanja: ");
		for(String n : natjecanja) {
			sb.append(n).append(" ");
		}
		System.out.println(sb);
	}

}
