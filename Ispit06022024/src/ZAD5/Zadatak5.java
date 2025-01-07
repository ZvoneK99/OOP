package ZAD5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadatak5 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime i prezime");
		String imePrezime = ulaz.nextLine();
		
		System.out.println("Unesite datum u foramtu DD.MM.YYYY");
		String datum = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		LocalDate date = LocalDate.parse(datum, formatter);
		LocalDate danas = LocalDate.now();
		
		long dani = ChronoUnit.DAYS.between(date, danas);
		
		LocalDate sljedeciRodjendan = date.withYear(danas.getYear());
		
		if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
			sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
		}
		
		long daniDoRodjendana = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
		
		System.out.println("Od rođenja osobe <"+imePrezime+"> prošlo je <"+dani+"> dana, a do iduceg rođendana je <"+daniDoRodjendana+"> dana.");
		ulaz.close();
	}
}
