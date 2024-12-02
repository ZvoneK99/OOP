package Datum2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class DodajOduzmiVrijeme {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite datum u formatu dd.MM.yyyy");
		String unosDatuma = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate datum = LocalDate.parse(unosDatuma, formatter);
		
		System.out.println("Unesite broj dana koje zelite da zbrojimo i oduzmemo od trenutnog datuma:");
		int dani = ulaz.nextInt();
		
		System.out.println("Novi datum sa dodanim danima: "+datum.plusDays(dani));
		System.out.println("Novi datum sa oduzetim danima: "+datum.minusDays(dani));
	}
}
