package zadatak2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatumRodenja {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite ime i prezime: ");
		String imePrezime = ulaz.nextLine();
		
		String ime = imePrezime.substring(0, imePrezime.indexOf(' '));
		
		String prezime = imePrezime.substring(imePrezime.indexOf(' ')+1);
		
		System.out.println("Unesite datum rođenja u formatu dd.MM.yyyy.");
		String unosDatuma = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.M.yyyy");
		
		LocalDate datumRodenja = LocalDate.parse(unosDatuma, formatter);
		
		LocalDate danas = LocalDate.now();
		
		LocalDate sljedeciRodjendan = LocalDate.of(danas.getYear(), datumRodenja.getMonth(), datumRodenja.getDayOfMonth());
		
		if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
			sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
		}
		long preostaliDani = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
		
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Datum rođenja: "+datumRodenja);
		System.out.println("Sljedeci rođendan je za "+preostaliDani+" dana.");
		ulaz.close();
	}
	
}

