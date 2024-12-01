package zadatak11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RazlikaVremena {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
		
		LocalDateTime prvoVrijeme =null, drugoVrijeme = null;
		
		while(prvoVrijeme == null) {
			System.out.println("Unesite prvo vrijeme u formatu dd.MM.yyyy HH:mm");
			String vrijeme1 = ulaz.nextLine();
			
			try {
				prvoVrijeme = LocalDateTime.parse(vrijeme1, formatter);
			}
			catch (DateTimeParseException e) {
				System.out.println("Uneseni datum nije ispravan.");
			}
		}
		
		while(drugoVrijeme == null) {
			System.out.println("Unesite drugo vrijeme u formatu dd.MM.yyyy HH:mm");
			String vrijeme2 = ulaz.nextLine();
			
			try {
				drugoVrijeme = LocalDateTime.parse(vrijeme2, formatter);
			}
			catch(DateTimeParseException e) {
				System.out.println("Uneseni datum nije ispravan.");
			}
		}
		long godine = ChronoUnit.YEARS.between(prvoVrijeme, drugoVrijeme);
		
		LocalDateTime bezGodina = prvoVrijeme.plusYears(godine);
		
		long dani = ChronoUnit.DAYS.between(bezGodina, drugoVrijeme);
		
		LocalDateTime bezDana = bezGodina.plusDays(dani);
		
		long sati = ChronoUnit.HOURS.between(bezDana, drugoVrijeme);
		
		LocalDateTime bezSati = bezDana.plusHours(sati);
		
		long minute = ChronoUnit.MINUTES.between(bezSati, drugoVrijeme);
		
		System.out.println("Razlika između unosa je:");
		System.out.println(godine+" godine");
		System.out.println(dani+" dana");
		System.out.println(sati+" sati");
		System.out.println(minute+" minuta");
		
	}
}
