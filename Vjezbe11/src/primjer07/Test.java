package primjer07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		ArrayList<Vozilo> listaVozila = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Unos podataka za "+(i+1)+" vozilo:");
			
			System.out.println("Unesite tip vozila(automobil/motocikl): ");
			String tip = ulaz.nextLine();
			
			System.out.println("Proizvođač: ");
			String proizvodjac = ulaz.nextLine();
			
			System.out.println("Model: ");
			String model = ulaz.nextLine();
			
			System.out.println("Godina proizvodnje: ");
			int godina = ulaz.nextInt();
			
			System.out.println("Boja: ");
			String boja = ulaz.nextLine();
			ulaz.nextLine();
			if(tip.equalsIgnoreCase("automobil")) {
				System.out.println("Broj vrata: ");
				int brojVrata = ulaz.nextInt();
				ulaz.nextLine();
				listaVozila.add(new Automobil(proizvodjac, model, godina, boja, brojVrata));
			}else if(tip.equalsIgnoreCase("motocikl")) {
				System.out.println("Tip motocikla (sportski/kruzer): ");
				String tipMotocikla = ulaz.nextLine();
				listaVozila.add(new Motocikl(proizvodjac, model, godina, boja, tipMotocikla));
			}
			else {
				System.out.println("Neispravan unos. Pokušajte ponovno.");
				i--;
				
			}
			for(Vozilo v : listaVozila) {
				System.out.println(v.toString());
			}
		}
		
	}
}
