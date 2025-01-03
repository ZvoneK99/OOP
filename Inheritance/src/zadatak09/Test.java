package zadatak09;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		zaposlenici.add(new Zaposlenik("Ivan", "Ivić", 1985, "Programer", 3000.0, 2000));
		zaposlenici.add(new Zaposlenik("Ana", "Anić", 1990, "Računovođa", 2500.0, 1999));
		zaposlenici.add(new Zaposlenik("Marko", "Marić", 1980, "Voditelj", 4500.0, 2010));
		zaposlenici.add(new Zaposlenik("Lucija", "Lucić", 1995, "Dizajner", 3200.0, 2012));
		zaposlenici.add(new Zaposlenik("Petar", "Perić", 1992, "Sistem administrator", 2700.0, 2020));
		zaposlenici.add(new Zaposlenik("Mia", "Matić", 1988, "Marketing", 2800.0, 2017));
		zaposlenici.add(new Zaposlenik("Sara", "Sarić", 1996, "Programer", 3100.0, 2019));
		zaposlenici.add(new Zaposlenik("Luka", "Lukić", 1983, "Voditelj", 4000.0, 2024));
		zaposlenici.add(new Zaposlenik("Tina", "Tinić", 1991, "Računovođa", 2600.0, 2020));
		zaposlenici.add(new Zaposlenik("Josip", "Josić", 1987, "Prodavač", 2900.0, 2009));
		
		//Provjera koji zaposlenici imaju veću plaću od proslijeđene
		/*System.out.println("Unesite prag da provjerimo osobe koje imaju plaću veću od njega.");
		double prag = ulaz.nextDouble();
		System.out.println("Zaposlenici sa plaćom većom od "+prag+" su:");
		for(Zaposlenik z : zaposlenici) {
			if(z.jeLiVisokPlaceni(prag)) {
				z.ispisiImePrezime();
			}
		}
		*/
		//Računanje staža zaposlenika
		/*System.out.println("Unesite minimalni broj godina staža da ispišemo osobe sa više godina radnog staža.");
		int stazZaposlenika = ulaz.nextInt();
		System.out.println("Osobe sa vise od "+stazZaposlenika+" godina radnog staza su:");
		for(Zaposlenik z : zaposlenici) {
			if(z.izracunajStaz()> stazZaposlenika) {
				z.ispisiImePrezime();
			}
		}*/
		
		//Sortiranje osoba po godini staža
		zaposlenici.sort(Comparator.comparing(Zaposlenik::getGodinaZaposlenja));
		for(Zaposlenik z : zaposlenici) {
			z.ispisiImePrezime();
		}
		HashMap<String, List<Zaposlenik>> grupiraniZaposlenici = new HashMap<>();

		// Dinamičko grupiranje bez unaprijed definiranih ključeva
		for (Zaposlenik z : zaposlenici) {
		    String pozicija = z.getPozicija(); // Pretpostavljamo da postoji getter za poziciju

		    // Ako pozicija još nije dodana u mapu, dodaj je
		    grupiraniZaposlenici.putIfAbsent(pozicija, new ArrayList<>());

		    // Dodaj zaposlenika u odgovarajuću grupu
		    grupiraniZaposlenici.get(pozicija).add(z);
		}
		for (Entry<String, List<Zaposlenik>> entry : grupiraniZaposlenici.entrySet()) {
		    System.out.println("Pozicija: " + entry.getKey());
		    for (Zaposlenik z : entry.getValue()) {
		        z.ispisiDetalje();
		    }
		}

		
		ulaz.close();
	}
}
