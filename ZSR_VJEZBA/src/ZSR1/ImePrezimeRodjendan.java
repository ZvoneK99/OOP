package ZSR1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ImePrezimeRodjendan {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime i prezime ");
		String imePrezime = ulaz.nextLine();
		
		System.out.println("Unesite datum rođenja u formatu dd.MM.yyyy");
		String unosDatuma = ulaz.nextLine();
		
		String[] ime_prezime = imePrezime.split(" ");
		String ime = ime_prezime[0];
		String prezime = ime_prezime[1];
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate date = LocalDate.parse(unosDatuma, formatter);
		LocalDate danas = LocalDate.now();
		
		LocalDate sljedeciRodjendan = date.withYear(danas.getYear());
		if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
			sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
		}
		long preostaloDana = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
		
		System.out.println("Ime i Prezime: "+ime+" "+prezime);
		System.out.println("Preostalo dana do rođendana: "+preostaloDana);
		ulaz.close();
	}
	
}
