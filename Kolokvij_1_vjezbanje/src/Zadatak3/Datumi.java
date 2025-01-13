package Zadatak3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Datumi {
	public static void main(String[]args) {
		try {
			Scanner ulaz = new Scanner(System.in);
			System.out.println("Unesite datum rodjenja ");
			String datum = ulaz.nextLine();
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
			
			LocalDate datumRodjenja = LocalDate.parse(datum, formatter);
			LocalDate danas = LocalDate.now();
			
			Period period = Period.between(datumRodjenja, danas);
			int godine = period.getYears();
			
			
			LocalDate ovaGodinaRodjendan = datumRodjenja.withYear(danas.getYear());
			LocalDate prosliRodjendan;
			if(ovaGodinaRodjendan.isAfter(danas)) {
				prosliRodjendan = ovaGodinaRodjendan.minusYears(1);
			}else {
				prosliRodjendan = ovaGodinaRodjendan;
			}
			
			long daniOdProslogRodjendana = ChronoUnit.DAYS.between(prosliRodjendan, danas);
			
			
			LocalDate prviSijecanj = datumRodjenja.withMonth(1).withDayOfMonth(1);
			long razlika = ChronoUnit.DAYS.between(prviSijecanj, datumRodjenja);
			
			System.out.println("Na trenutni dan osoba ima "+godine+ " godina");
			System.out.println(daniOdProslogRodjendana);
			System.out.println(razlika);
		}
		catch(DateTimeParseException e) {
			System.out.println("Pogresan unos datuma");
		}
		
	}
}
