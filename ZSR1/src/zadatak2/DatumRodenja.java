package zadatak2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DatumRodenja {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite ime i prezime: ");
		String imePrezime = ulaz.nextLine();
		
		String ime = imePrezime.substring(0, imePrezime.indexOf(' '));
		
		String prezime = imePrezime.substring(imePrezime.indexOf(' ')+1);
		
		System.out.println("Unesite dan rođenja.");
		int dan = ulaz.nextInt();
		
		System.out.println("Unesite mjesec rođenja.");
		int mjesec = ulaz.nextInt();
		
		System.out.println("Unesite godinu rođenja.");
		int godina = ulaz.nextInt();
		
		
		
		LocalDate datumRodenja = LocalDate.of(godina, mjesec, dan);
		LocalDate danas = LocalDate.now();
		
		LocalDate sljedeciRodjendan = LocalDate.of(danas.getYear(), mjesec, dan);
		
		if(sljedeciRodjendan.isBefore(danas) || sljedeciRodjendan.isEqual(danas)) {
			sljedeciRodjendan = sljedeciRodjendan.plusYears(1);
		}
		long preostaliDani = ChronoUnit.DAYS.between(danas, sljedeciRodjendan);
		
		System.out.println("Ime i prezime: "+ime+" "+prezime);
		System.out.println("Datum rođenja: "+dan+"."+mjesec+"."+godina);
		System.out.println("Sljedeci rođendan je za "+preostaliDani+" dana.");
	}
}

