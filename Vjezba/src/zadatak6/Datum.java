package zadatak6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Datum {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite prvi datum u formatu DD.MM.YYYY");
		String unosPrvogDatuma = ulaz.nextLine();
		
		System.out.println("Unesite drugi datum u formatu DD.MM.YYYY");
		String unosDrugogDatuma = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		

		LocalDate prviDatum = LocalDate.parse(unosPrvogDatuma, formatter);
		LocalDate drugiDatum = LocalDate.parse(unosDrugogDatuma, formatter);
		
		long daniIzmeđuDatuma = ChronoUnit.DAYS.between(prviDatum, drugiDatum);
		
		System.out.println(daniIzmeđuDatuma);
		ulaz.close();
	}
}
