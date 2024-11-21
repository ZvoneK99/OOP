package primjer01;

import java.util.ArrayList;
import java.util.Comparator;

public class Test {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		 osobe.add(new Student("Marko", 20, "123456"));
	        osobe.add(new Student("Ana", 22, "654321"));

	        // Dodavanje zaposlenika
	        osobe.add(new Zaposlenik("Ivana", 30, 5000.0));
	        osobe.add(new Zaposlenik("Petar", 35, 7000.0));
			
			osobe.sort(Comparator.comparingDouble(o -> o.godine));
			for(Osoba o1 : osobe) {
				o1.ispisiDetalje();
			}
			System.out.println("--------------------------");
			for(Osoba o : osobe) {
				if(o.godineOsobe()>25) {
					o.ispisiDetalje();
				}
			}
		}
	}
