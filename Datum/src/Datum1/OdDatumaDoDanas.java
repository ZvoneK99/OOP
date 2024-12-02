package Datum1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class OdDatumaDoDanas {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite datum u formatu dd.MM.yyyy");
		String datum = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		
		LocalDate datumRodjenja = LocalDate.parse(datum, formatter);
		
		LocalDate danas = LocalDate.now();
		
		if(datumRodjenja.isAfter(danas)) {
			System.out.println("Datum rođenja ne može biti u budućnosti.");
		}
		else {
			long odRodjendanaDoDanas = ChronoUnit.DAYS.between(datumRodjenja, danas);
			
			System.out.println("Dani od rođendana do danas: "+odRodjendanaDoDanas);
		}
		ulaz.close();
	}
}
