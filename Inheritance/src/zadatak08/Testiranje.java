package zadatak08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Testiranje {
	public static void main(String[]args) {
		ArrayList<Vozilo> vozila = new ArrayList<>();
		
		vozila.add(new Automobil("Toyota", 2015, 5));
		vozila.add(new Automobil("Honda", 2020, 4));
		vozila.add(new Automobil("BMW", 2018, 3));

		vozila.add(new Kamion("Volvo", 2012, 15.5));
		vozila.add(new Kamion("Scania", 2019, 20.0));
		vozila.add(new Kamion("MAN", 2016, 18.0));
		
		vozila.sort(Comparator.comparing(Vozilo::getGodinaProizvodnje));
		System.out.println("Vozila sortirana od najstarijeg do najmlađeg ");
		for(Vozilo v : vozila) {
			v.ispisiDetalje();
		}
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite minimalnu starost vozila: ");
		int minimalnaStarost = ulaz.nextInt();
		System.out.println("Vozila koja su starija od te granice su: ");
		for(Vozilo v : vozila) {
			if(v.izracunajStarost()>=minimalnaStarost) {
				v.ispisiNazivVozila();
			}
		}
		
		//Kreiranje HashMap za grupiranje
		
		HashMap<String, List<Vozilo>> grupiranaVozila = new HashMap<>();
		grupiranaVozila.put("Automobil", new ArrayList<>());
		grupiranaVozila.put("Kamion", new ArrayList<>());
		
		//Grupiranje vozila po tipu
		for(Vozilo v : vozila) {
			if(v instanceof Automobil) {
				grupiranaVozila.get("Automobil").add(v);
			}
			else if(v instanceof Kamion ) {
				grupiranaVozila.get("Kamion").add(v);
			}
		}
		
		//Ispis grupiranih vozila
		for(Map.Entry<String, List<Vozilo>> entry : grupiranaVozila.entrySet()) {
			System.out.println("Tip vozila: "+entry.getKey());
			for(Vozilo v : entry.getValue()) {
				v.ispisiDetalje();
			}
		}
		
	}
}
