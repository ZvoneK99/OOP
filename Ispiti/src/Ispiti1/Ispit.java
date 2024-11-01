package Ispiti1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;


public class Ispit implements Ocjenjivanje {
	String predmet;
	String nastavnik;
	 LocalDateTime datumVrijemeIspita;
	 private static final String[] vrsteIspita = {"pismeni ispit", "usmeni ispit"};
	 ArrayList<String> studenti = new ArrayList<>(Arrays.asList("Ante", "Zvone", "Pero", "Ivan"));
	@Override
	public void definirajNacinIspitivanja() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dodjeliOcjene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return nastavnik;
	}
	
}
