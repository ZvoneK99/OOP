package zadatak09;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[]args) {
		ArrayList<Zaposlenik> zaposlenici = new ArrayList<>();
		Scanner ulaz = new Scanner(System.in);
		
		zaposlenici.add(new Zaposlenik("Ivan", "Ivić", 1985, "Programer", 3000.0));
		zaposlenici.add(new Zaposlenik("Ana", "Anić", 1990, "Računovođa", 2500.0));
		zaposlenici.add(new Zaposlenik("Marko", "Marić", 1980, "Voditelj", 4500.0));
		zaposlenici.add(new Zaposlenik("Lucija", "Lucić", 1995, "Dizajner", 3200.0));
		zaposlenici.add(new Zaposlenik("Petar", "Perić", 1992, "Sistem administrator", 2700.0));
		zaposlenici.add(new Zaposlenik("Mia", "Matić", 1988, "Marketing", 2800.0));
		zaposlenici.add(new Zaposlenik("Sara", "Sarić", 1996, "Programer", 3100.0));
		zaposlenici.add(new Zaposlenik("Luka", "Lukić", 1983, "Voditelj", 4000.0));
		zaposlenici.add(new Zaposlenik("Tina", "Tinić", 1991, "Računovođa", 2600.0));
		zaposlenici.add(new Zaposlenik("Josip", "Josić", 1987, "Prodavač", 2900.0));
		
		System.out.println("Unesite prag da provjerimo osobe koje imaju plaću veću od njega.");
		double prag = ulaz.nextDouble();
		System.out.println("Zaposlenici sa plaćom većom od "+prag+" su:");
		for(Zaposlenik z : zaposlenici) {
			if(z.jeLiVisokPlaceni(prag)) {
				z.ispisiImePrezime();
			}
		}
		ulaz.close();
	}
}
