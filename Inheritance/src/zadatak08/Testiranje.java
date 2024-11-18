package zadatak08;

import java.util.ArrayList;
import java.util.Comparator;
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
	}
}
