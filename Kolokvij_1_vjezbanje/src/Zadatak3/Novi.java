package Zadatak3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Novi {
	public static void main(String[]args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		Scanner ulaz = new Scanner(System.in);
		ArrayList<LocalDate> datumi = new ArrayList<>();
		try {
			
			for(int i=0; i<5; i++) {
				System.out.println("Unesite datum "+(i+1));
				String datum = ulaz.nextLine();
			
			LocalDate date = LocalDate.parse(datum, formatter);
			datumi.add(date);
			}
				
			datumi.sort(Comparator.comparing(LocalDate::toEpochDay).reversed());
			LocalDate najstarijiDatum = datumi.get(0);
			LocalDate najmladiDatum = datumi.get(0);
			
			for(LocalDate d : datumi) {
				if (d.isBefore(najstarijiDatum)) {
					najstarijiDatum = d;
				}
				if(d.isAfter(najmladiDatum)) {
					najmladiDatum = d;
				}
			}
			System.out.println("Najstariji datum "+najstarijiDatum);
			System.out.println("Najmlađi datum "+najmladiDatum);
			
		}catch(DateTimeParseException e) {
			System.out.println("Pogresno unesen datum.");
		}
		System.out.println("Datumi sortirani su ");
		System.out.println(datumi);
		
	}
}
