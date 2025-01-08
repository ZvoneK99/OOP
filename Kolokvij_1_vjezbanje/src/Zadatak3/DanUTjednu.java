package Zadatak3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DanUTjednu {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite datum");
		String unos = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		try {
			LocalDate date = LocalDate.parse(unos, formatter);
			LocalDate danas = LocalDate.now();
			
			if(date.isBefore(danas)) {
				System.out.println("Datum je u proslosti.");
			}
			else if(date.isAfter(danas)) {
				System.out.println("Datum je u budućnosti.");
			}
			else {
				System.out.println("Datum je danas.");
			}
			DayOfWeek danUTjednu = date.getDayOfWeek();
			System.out.println(danUTjednu);
			
			long razlika = Math.abs(ChronoUnit.DAYS.between(date, danas));
			System.out.println(razlika);
		} catch(DateTimeParseException e) {
			System.out.println("Pogresan unos datuma.");
		}
		ulaz.close();
	}
 }
