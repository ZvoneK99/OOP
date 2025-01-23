package Zadatak16;

import java.util.ArrayList;

public class Agencija {
	ArrayList<Nekretnina> nekretnine;
	
	public Agencija() {
		this.nekretnine = new ArrayList<Nekretnina>();
	}
	
	public void dodajNekretninu(Nekretnina n) {
		nekretnine.add(n);
	}
	public void ispisNekretnina() {
		System.out.println("Sve nekretnine:");
		for(Nekretnina n : nekretnine) {
			System.out.println(n.toString());
		}
	}
	public void filtrirajPoVrsti(String vrsta) {
		System.out.println("Nekretnine vrste: " + vrsta);
		for(Nekretnina n : nekretnine) {
			if(n.vrstaNekretnine().equalsIgnoreCase(vrsta)) {
				System.out.println(n);
			}
		}
	}
}
