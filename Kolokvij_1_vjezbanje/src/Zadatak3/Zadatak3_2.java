package Zadatak3;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Period;

public class Zadatak3_2 {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite 1.datum u formatu dd.MM.yyyy");
		String unosDatuma1 = ulaz.nextLine();
		
		System.out.println("Unesite 2.datum u formatu dd.MM.yyyy");
		String unosDatuma2 = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date1 = null;
		LocalDate date2 = null;
		
		try {
			date1 = LocalDate.parse(unosDatuma1, formatter);
			date2 = LocalDate.parse(unosDatuma2, formatter);
		}catch (Exception e) {
			System.out.println("Unos datuma nije valjan pokusaj ponovno");
			return;
		}
		Period period = Period.between(date1, date2);
		int godine = period.getYears();
		int mjeseci = period.getMonths();
		int dani = period.getDays();
		
		System.out.println(godine+" godina "+mjeseci+" mjeseci "+dani+" dana");
		
	}
}
