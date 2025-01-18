package Zadatak3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ispitni {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		try {
			System.out.println("Unesite ime i prezime");
			String imePrezime = ulaz.nextLine();
			
			System.out.println("Unesite datum rodjenja");
			String datum = ulaz.nextLine();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			LocalDate date = LocalDate.parse(datum, formatter);
			LocalDate danas = LocalDate.now();
			
			long daniOdRodjendana = ChronoUnit.DAYS.between(date, danas);
			
			LocalDate sljedeciRodjendan = date.withYear(danas.getYear());
			
			if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
				sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
			}
			
			long daniDoRodjendana = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
			
			System.out.println("Dani od rodjendana su: "+daniOdRodjendana);
			System.out.println("Sljedeci rodj je za "+daniDoRodjendana);
		}
		catch(DateTimeParseException e) {
			System.out.println("Pogresan datum");
		}
	}
}
