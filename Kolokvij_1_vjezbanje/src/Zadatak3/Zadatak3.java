package Zadatak3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Zadatak3 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 1. datum u formatu DD.MM.GGGG");
		String unosDatuma1 = ulaz.nextLine();
		
		System.out.println("Unesite 2. datum u formatu DD.MM.GGGG");
		String unosDatuma2 = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		LocalDate date1 = LocalDate.parse(unosDatuma1, formatter);
		LocalDate date2 = LocalDate.parse(unosDatuma2, formatter);
		LocalDate noviDatum = date1.plusYears(1).plusMonths(2).plusDays(4);
				 long razlika = ChronoUnit.DAYS.between(date1, date2);
		 
		 System.out.println(razlika);
		 System.out.println(noviDatum);
		 ulaz.close();
	}
}
