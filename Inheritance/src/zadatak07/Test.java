package zadatak07;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		/*Vozilo v1 = new Vozilo("Biciklo", "CUBE", 2024);
		Automobil a1 = new Automobil("Mercedes-Benz", "S-class", 2020, 5);
		Kamion k1 = new Kamion("MAN", "E600", 2010, 50);
		Automobil a2 = new Automobil("BMW", "M3", 2010, 0);
		Kamion k2 = new Kamion("VOLVO", "B62", 2020, 0);
		*/
		ArrayList<Vozilo> vozila = new ArrayList<>();
		vozila.add(new Automobil("Toyota", "Corolla", 2010, 4));
		vozila.add(new Automobil("Volkswagen", "Golf", 2015, 5));
		vozila.add(new Automobil("Honda", "Civic", 2020, 4));
		vozila.add(new Kamion("MAN", "TGX", 2018, 20.0));
		vozila.add(new Kamion("Mercedes", "Actros", 2012, 25.0));

		vozila.sort((v1, v2) -> Integer.compare(v2.izracunajStarost(), v1.izracunajStarost()));
					
		System.out.println("Vozila sortirana po starosti:");
        for (Vozilo v : vozila) {
            v.ispisiDetalje();
        }
		/*v1.ispisiDetalje();
		a1.ispisiDetalje();
		k1.ispisiDetalje();
		a2.provjeriBrojVrata();
		k2.provjeriNosivost();*/
	}
	
}
