package ZSR1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class zad2 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime i prezime");
		String imePrezime = ulaz.nextLine();
		
		System.out.println("Unesite datum rođenja ");
		String datum = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		LocalDate date = LocalDate.parse(datum, formatter);
		LocalDate danas = LocalDate.now();
		
		LocalDate sljedeciRodjendan = date.withYear(danas.getYear());
		if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
			sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
		}
		long preostaloDana = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
		
		System.out.println("Preostalo je " +preostaloDana);
	}
}
