package Zadatak3;

import java.util.ArrayList;

public class Main {
	public static void main(String[]args) {
		ArrayList<Uredaj> uredaji = new ArrayList<>();
		
		Televizor t1 = new Televizor("LG", 52, "UHD");
		Laptop l1 = new Laptop("Fujitsu", "Intel", 32);
		PametniTelefon pt1 = new PametniTelefon("Xiaomi", "Android", 5000);
		
		uredaji.add(t1);
		uredaji.add(l1);
		uredaji.add(pt1);
		
	
		for(Uredaj u : uredaji) {
			if(u instanceof Televizor) {
				u.ukljuciUredaj();
				System.out.println(u);
			}
		}
	}
}
