package zadatak2;

import java.util.ArrayList;

public class ZadatakMain {
	public static void main(String[]args) {
		ArrayList<Vozilo> vozila = new ArrayList<>();
		
		vozila.add(new Automobil("Toyota", "Corolla", 2018, 4, "benzin"));
		vozila.add(new Automobil("Tesla", "Model 3", 2022, 4, "elektricni"));
		vozila.add(new Automobil("Volkswagen", "Golf", 2015, 4, "dizel"));

		vozila.add(new Motocikl("Yamaha", "R1", 2020, 200, "sportski"));
		vozila.add(new Motocikl("Honda", "CB500", 2019, 47, "gradski"));
		vozila.add(new Motocikl("KTM", "Adventure", 2016, 105, "terenac"));
		
		for(Vozilo v : vozila) {
			v.ispisiDetalje();
		}
	}
}	
