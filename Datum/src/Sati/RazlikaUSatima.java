package Sati;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RazlikaUSatima {
	public static void main(String[]args) {
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite vrijeme u formatu HH:mm");
		String unosVremena = ulaz.nextLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime vrijeme = LocalTime.parse(unosVremena, formatter);
		
		LocalTime trenutnoVrijeme = LocalTime.now();
		
		long razlikaUSatima = java.time.Duration.between(trenutnoVrijeme, vrijeme).toHours();
		long razlikaUMinutama = java.time.Duration.between(trenutnoVrijeme, vrijeme).toMinutesPart();
		
		System.out.println("Uneseno vrijeme: "+vrijeme);
		System.out.println("Trenutno vrijeme: "+trenutnoVrijeme);
		System.out.println("Razlika između ova dva vremena: "+razlikaUSatima+" "+razlikaUMinutama);
		ulaz.close();
	}
}
