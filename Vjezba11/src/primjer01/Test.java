package primjer01;

import java.util.ArrayList;

public class Test {
	public static void main(String[]args) {
		ArrayList<Osoba> osobe = new ArrayList<>();
		 osobe.add(new Student("Marko", 20, "123456"));
	        osobe.add(new Student("Ana", 22, "654321"));

	        // Dodavanje zaposlenika
	        osobe.add(new Zaposlenik("Ivana", 30, 5000.0));
	        osobe.add(new Zaposlenik("Petar", 35, 7000.0));
		for(Osoba o : osobe) {
			o.ispisiDetalje();
		}
	}
}
