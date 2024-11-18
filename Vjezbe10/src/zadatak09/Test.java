package zadatak09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		//Dodavanje proizvoda u listu proizvodi
		ArrayList<Proizvod> proizvodi = new ArrayList<>();
		proizvodi.add(new Proizvod("Laptop", 1500.0, 10));
		proizvodi.add(new Proizvod("Pametni telefon", 800.0, 25));
		proizvodi.add(new Proizvod("Monitor", 300.0, 5));
		proizvodi.add(new Proizvod("Tipkovnica", 50.0, 15));
		proizvodi.add(new Proizvod("Miš", 30.0, 8));
		proizvodi.add(new Proizvod("Slušalice", 120.0, 3));
		proizvodi.add(new Proizvod("USB memorija", 20.0, 50));
		proizvodi.add(new Proizvod("Punjač", 40.0, 7));
		
		//Provjera je li proizvod na stanju
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite naziv proizvoda da vidimo ima li ga na stanju.");
		String naziv = ulaz.nextLine();
		boolean pronađen = false;
		for(Proizvod p : proizvodi) {
			if(p.naziv.equalsIgnoreCase(naziv)) {
				System.out.println("Proizvod je na stanju: ");
				p.ispisiDetalje();
				pronađen = true;
				break;
			}
		}
		if(!pronađen) {
			System.out.println("Proizvod nazalost nije na stanju.");
		}
		//Provjera koji proizvodi imaju veću količinu na stanju od one koju mi odredimo
		System.out.println("Unesite kolicinu koju zelite da bude granica");
		int kolicinaGranica = ulaz.nextInt();
		ulaz.nextLine();
		System.out.println("Proizvodi kod kojih je kolicina veca od unesene količine su: ");
		for(Proizvod p : proizvodi) {
			if(p.kolicina>= kolicinaGranica) {
				p.ispisiNazivProizvoda();
			}
		}
		//Simulacija prodaje
		System.out.println("Unesite naziv proizvoda:");
		String imeProizvoda = ulaz.nextLine();
		
		System.out.println("Unesite količinu:");
		String unosKolicina = ulaz.nextLine(); // Unos količine kao string
		int količina = Integer.parseInt(unosKolicina);
		
		boolean pronadjen = false;
		
		for(Proizvod p : proizvodi) {
			if(p.naziv.equalsIgnoreCase(imeProizvoda)) {
				pronadjen = true;
				
				if(p.prodaj(količina)) {
					System.out.println("Prodaja uspješna. Količina na stanju: "+p.kolicina);
				}
				else {
					System.out.println("Proizvod: "+imeProizvoda+" je pronađen ali nemamo dovoljnu količinu na stanju.");
				}
				break;
			}
		}
		if(!pronadjen) {
			System.out.println("Proizvod nije pronađen.");
		}
		//Filtriranje proizvoda između min i max cijene
		System.out.println("Unesite min i max cijenu odvojenu razmakom.");
		String input = ulaz.nextLine();
		
		String[] cijene = input.split(" ");
		int min = Integer.parseInt(cijene[0]);
		int max = Integer.parseInt(cijene[1]);
		
		System.out.println("Proizvodi kod kojih je cijena između postavljenih granica su: ");
		for(Proizvod p : proizvodi) {
			if(p.filtriranjeProizvoda(min, max)) {
				
				p.ispisiNazivProizvoda();
			}
		}
		//Sortiranje proizvoda od najjeftinijeg do najskupljeg
		proizvodi.sort(Comparator.comparingDouble(p -> p.cijena));
		System.out.println("Proizvodi od najjeftinijeg do najskupljeg: ");
		for(Proizvod p : proizvodi) {
			p.ispisiNazivProizvoda();
		}
		// Sortiranje proizvoda od najskupljeg do najjeftinijeg
		proizvodi.sort(Comparator.comparingDouble(Proizvod::getCijena).reversed());
		System.out.println("Proizvodi od najskupljeg do najjeftinijeg: ");
		for (Proizvod p : proizvodi) {
		    p.ispisiNazivProizvoda();
		}

		ulaz.close();
	}
}
