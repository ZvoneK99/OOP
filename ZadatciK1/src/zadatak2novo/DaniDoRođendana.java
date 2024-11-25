package zadatak2novo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaniDoRođendana {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite ime:");
		String ime = ulaz.nextLine();
		
		System.out.println("Unesite prezime: ");
		String prezime = ulaz.nextLine();
		
		System.out.println("Unesite dan rođenja: ");
		int dan = ulaz.nextInt();
		
		System.out.println("Unesite mjesec rođenja: ");
		int mjesec = ulaz.nextInt();
		
		System.out.println("Unesite godinu rođenja: ");
		int godina = ulaz.nextInt();
		
		LocalDate datumRođenja = LocalDate.of(godina, mjesec, dan);
		
		LocalDate trenutniDatum = LocalDate.now();
		
		int trenutnaGodina = trenutniDatum.getYear();
		LocalDate sljedeciRođendan = LocalDate.of(trenutnaGodina, datumRođenja.getMonth(), datumRođenja.getDayOfMonth());
		
		if(sljedeciRođendan.isBefore(trenutniDatum) || sljedeciRođendan.isEqual(trenutniDatum)) {
			sljedeciRođendan = sljedeciRođendan.plusYears(1);
			
			long preostaliDani = ChronoUnit.DAYS.between(trenutniDatum, sljedeciRođendan);
			
			System.out.println(preostaliDani);
		}
	}
	
}
