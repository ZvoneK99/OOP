package Zadatak3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Zad3 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		try {
			System.out.println("Unesite 1. datum u formatu DD.MM.YYYY");
			String datum1 = ulaz.nextLine();
			
			System.out.println("Unesite 2. datum u formatu DD.MM.YYYY");
			String datum2 = ulaz.nextLine();
			
			
			
			LocalDate date1 = LocalDate.parse(datum1, formatter);
			LocalDate date2 = LocalDate.parse(datum2, formatter);
			
			Period period = Period.between(date1, date2);
			int godine = period.getYears();
			int mjeseci = period.getMonths();
			int dani = period.getDays();
			
			System.out.println("Razlika između datuma je "+godine+" godina "+mjeseci+" mjeseci "+ dani+" dana");
		}
		catch(DateTimeParseException e) {
			System.out.println("Datum neispravan.");
		}
		ulaz.close();
	}
}
