package Zadatak3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Zadatak3_1 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 1. datum rođenja u formatu DD.MM.GGGG");
		String unosDatuma1 = ulaz.nextLine();
		
		System.out.println("Unesite 2. datum rođenja u formatu DD.MM.GGGG");
		String unosDatuma2 = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

		LocalDate date1 = LocalDate.parse(unosDatuma1, formatter);
		LocalDate date2 = LocalDate.parse(unosDatuma2, formatter);
		
		Period period = Period.between(date1, date2);
		int godine = period.getYears();
		int mjeseci = period.getMonths();
		int dani = period.getDays();
		
		System.out.println(godine+" godina "+mjeseci+" mjeseci "+dani+" dana.");
		ulaz.close();
	}
}
