package zad1;

import java.time.LocalDate;

public class Main {
	public static void main(String[]args) {
		Transakcija t1 = new Transakcija(1743, "Uplata semestra", 1600.0, LocalDate.of(2020, 8, 3));
		Transakcija t2 = new Transakcija(2020, "Uplata za studentski zbor", 10, LocalDate.of(1999, 9, 2));
		Transakcija t3 = new Transakcija(145, "Placanje mise", 1900, LocalDate.of(2020, 5, 2));
		
		UpravljanjeTransakcijama upravljanje = new UpravljanjeTransakcijama();
		upravljanje.dodajTransakciju(t1);
		upravljanje.dodajTransakciju(t2);
		upravljanje.dodajTransakciju(t3);
		
		upravljanje.ispisiSveTransakcije();
		upravljanje.pretraziPoDatumu(LocalDate.of(2020, 8, 3));
	}
}
