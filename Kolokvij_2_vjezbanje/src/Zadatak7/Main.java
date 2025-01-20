package Zadatak7;

public class Main {
	public static void main(String[]args) {
		
		Inzinjer i1 = new Inzinjer("Zvone", 30, 2000, 3);
		Menadzer m1 = new Menadzer("Gabi", 40, 2500, 1000);
		Radnik r1 = new Radnik("Kreso", 25, 0, 160);
		
		Projekt p1 = new Projekt("Projekt A");
		Projekt p2 = new Projekt("Projekt B");
		
		p1.dodajZaposlenika(i1);
		p1.dodajZaposlenika(r1);
		
		p2.dodajZaposlenika(m1);
		p2.dodajZaposlenika(i1);
		
		System.out.println("Ispis zaposlenika u 'Projekt A'");
		for(Zaposlenik z : p1.getZaposlenici()) {
			System.out.println(z + " Placa "+z.izracunajPlacu());
		}
		
		System.out.println("Ispis zaposlenika u 'Projekt B'");
		for(Zaposlenik z : p2.getZaposlenici()) {
			System.out.println(z + " Placa "+z.izracunajPlacu());
		}
	}
}
